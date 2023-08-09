package koz.dev.employeespringbootproject.converter;

import koz.dev.employeespringbootproject.dto.EmployerEmployeeDto;
import koz.dev.employeespringbootproject.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class EmployerEmployeeDtoConverter {

    public EmployerEmployeeDto convert(Employee from){

        return EmployerEmployeeDto.builder()
                .id(Objects.requireNonNull(from.getId()))
                .name(from.getName())
                .salary(from.getSalary())
                .build();


    }
}
