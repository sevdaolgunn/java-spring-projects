package koz.dev.employeespringbootproject.converter;


import koz.dev.employeespringbootproject.dto.EmployerDto;
import koz.dev.employeespringbootproject.entity.Employer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;



import java.util.stream.Collectors;


@Component
@RequiredArgsConstructor
public class EmployerConverter {
    private final EmployerEmployeeDtoConverter employerEmployeeDtoConverter;


    public EmployerDto convertToDto(Employer from) {

        return EmployerDto.builder()
                .id(from.getId())
                .name(from.getName())
                .companyName(from.getCompanyName())
                .employees(from.getEmployees() == null ? null :
                        from.getEmployees().stream()
                                .map(employerEmployeeDtoConverter::convert)
                                .collect(Collectors.toSet()))
                .build();

    }

}
