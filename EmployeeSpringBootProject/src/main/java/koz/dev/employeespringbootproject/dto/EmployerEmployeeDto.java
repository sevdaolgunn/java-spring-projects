package koz.dev.employeespringbootproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class EmployerEmployeeDto {
    private Long id;
    private String name;
    private float salary;

}
