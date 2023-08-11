package koz.dev.companystringboot.service;

import koz.dev.companystringboot.converter.CompanyConverter;
import koz.dev.companystringboot.dto.CompanyDto;
import koz.dev.companystringboot.dto.request.UpdateCompanyRequest;
import koz.dev.companystringboot.entity.Company;
import koz.dev.companystringboot.exception.EmailAlreadyExistsException;
import koz.dev.companystringboot.exception.GenericException;
import koz.dev.companystringboot.repository.CompanyRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository repository;
    private final CompanyConverter dtoConverter;


    public void registerCompany(String name, String email) throws EmailAlreadyExistsException {
        if (repository.existsByEmail(email)) {
            throw new EmailAlreadyExistsException("Bu e-posta adresi zaten kayıtlı");
        }
        Company company = new Company();
        company.setName(name);
        company.setEmail(email);
        repository.save(company);
    }

    protected Company findCompanyByEmail(String email) {
        return repository.findCompanyByEmail(email).orElseThrow(
                () -> GenericException.builder()
                        .httpStatus(HttpStatus.NOT_FOUND)
                        .errorMessage("Şirket bulunamadı.")
                        .build());

    }

    protected Company findCompanyById(Long id) {
        return repository.findCompanyById(id).orElseThrow(
                () -> GenericException.builder()
                        .httpStatus(HttpStatus.NOT_FOUND)
                        .errorMessage("Şirket bulunamadı!")
                        .build());
    }

    public CompanyDto getCompanyById(Long id) {
        return dtoConverter.convertAsDto(findCompanyById(id));
    }

    public List<CompanyDto> getAllCompany() {
        List<Company> companies = repository.findAll();
        List<CompanyDto> companyDtoList = new ArrayList<>();

        for (Company company : companies) {
            companyDtoList.add(dtoConverter.convertAsDto(company));
        }
        return companyDtoList;
    }

    public CompanyDto updateCompany(UpdateCompanyRequest request) {
        Company company = findCompanyByEmail(request.getEmail());

        Company foundCompany = findCompanyByEmail(request.getEmail());
        foundCompany.setName(request.getName());

        return dtoConverter.convertAsDto(repository.save(foundCompany));
    }

    public void deleteCompany(Long id) {
        Company company =findCompanyById(id);
        repository.delete(company);
    }
}