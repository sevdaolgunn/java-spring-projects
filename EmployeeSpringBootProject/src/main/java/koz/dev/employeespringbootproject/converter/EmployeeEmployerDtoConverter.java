package koz.dev.employeespringbootproject.converter;

import koz.dev.employeespringbootproject.dto.EmployeeEmployerDto;
import koz.dev.employeespringbootproject.entity.Employer;
import koz.dev.employeespringbootproject.dto.EmployerEmployeeDto;


import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EmployeeEmployerDtoConverter {

    public EmployeeEmployerDto convert(Optional<Employer> from) {
        return EmployeeEmployerDto.builder()
                .id(from.get().getId())
                .name(from.get().getName())
                .companyName(from.get().getCompanyName())
                .build();



    }
}
