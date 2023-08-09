package koz.dev.employeespringbootproject.service;


import koz.dev.employeespringbootproject.converter.EmployeeDtoConverter;
import koz.dev.employeespringbootproject.dto.EmployeeDto;
import koz.dev.employeespringbootproject.dto.request.CreateEmployeeRequest;
import koz.dev.employeespringbootproject.dto.request.UpdateEmployeeRequest;
import koz.dev.employeespringbootproject.entity.Employee;
import koz.dev.employeespringbootproject.entity.Employer;
import koz.dev.employeespringbootproject.exception.GenericException;
import koz.dev.employeespringbootproject.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;
    private final EmployeeDtoConverter dtoConverter;
    private final EmployerService employerService;



    public EmployeeDto addEmployee(CreateEmployeeRequest request){
        Employer employer = employerService.findEmployeeById(request.getEmployerId());

        return dtoConverter.converterToDto(repository.save(Employee.builder()
                .name(request.getName())
                .salary(request.getSalary())
                .employer(employer)
                .build()));
    }

    protected Employee findEmployeeById(Long Id){
        return repository.findEmployeeById(Id).orElseThrow(
                () -> GenericException.builder()
                        .httpStatus(HttpStatus.NOT_FOUND)
                        .errorMessage("employee not found")
                        .build());
    }

    public EmployeeDto getEmployeeById(Long Id){
        return dtoConverter.converterToDto(findEmployeeById(Id));
    }

    public EmployeeDto updateEmployee(Long id, UpdateEmployeeRequest request){
        Employer employer = employerService.findEmployeeById(request.getEmployerId());

        Employee employee = findEmployeeById(id);

        employee.setName(request.getName());
        employee.setSalary(request.getSalary());
        employee.setEmployer(employer);

        return dtoConverter.converterToDto(repository.save(employee));
    }


    public void deleteEmployee(Long id){
        repository.deleteById(id);
    }

}
