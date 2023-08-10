package koz.dev.companystringboot.service;

import koz.dev.companystringboot.entity.Company;
import koz.dev.companystringboot.exception.EmailAlreadyExistsException;
import koz.dev.companystringboot.repository.CompanyRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository repository;


    public void registerCompany(String name,String email) throws EmailAlreadyExistsException {
        if (repository.existsByEmail(email)){
            throw new EmailAlreadyExistsException("Bu e-posta adresi zaten kayıtlı");
        }
        Company company = new Company();
        company.setName(name);
        company.setEmail(email);
        repository.save(company);
    }


}
