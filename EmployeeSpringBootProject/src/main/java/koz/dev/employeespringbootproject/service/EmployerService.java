package koz.dev.employeespringbootproject.service;

import koz.dev.employeespringbootproject.converter.EmployerConverter;
import koz.dev.employeespringbootproject.dto.EmployerDto;
import koz.dev.employeespringbootproject.dto.request.CreateEmployerRequest;
import koz.dev.employeespringbootproject.entity.Employee;
import koz.dev.employeespringbootproject.entity.Employer;
import koz.dev.employeespringbootproject.exception.GenericException;
import koz.dev.employeespringbootproject.repository.EmployerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployerService {
    private final EmployerRepository repository;
    private final EmployerConverter dtoConverter;

    public EmployerDto createEmployer(CreateEmployerRequest request){
        return dtoConverter.convertToDto(repository.save(Employer.builder()
                .name(request.getName())
                .companyName(request.getCompanyName())
                .build()));
    }


    protected Employer findEmployeeById(Long id){
        return repository.findEmployerById(id).orElseThrow(
                () -> GenericException.builder()
                        .httpStatus(HttpStatus.NOT_FOUND)
                        .errorMessage("employer not found")
                        .build());
    }

    public EmployerDto getEmployeeById(Long Id){
        return dtoConverter.convertToDto(findEmployeeById(Id));
    }



}
