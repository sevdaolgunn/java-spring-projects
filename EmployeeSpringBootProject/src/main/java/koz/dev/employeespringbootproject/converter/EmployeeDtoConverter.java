package koz.dev.employeespringbootproject.converter;

import koz.dev.employeespringbootproject.dto.EmployeeDto;
import koz.dev.employeespringbootproject.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
@RequiredArgsConstructor
public class EmployeeDtoConverter {
    private final EmployeeEmployerDtoConverter employeeEmployerDtoConverter;

    public EmployeeDto converterToDto(Employee from){

        return EmployeeDto.builder()
                .id(from.getId())
                .name(from.getName())
                .salary(from.getSalary())
                .employer(employeeEmployerDtoConverter.convert(Optional.ofNullable(from.getEmployer())))
                .build();

    }
}
