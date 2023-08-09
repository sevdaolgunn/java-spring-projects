package koz.dev.employeespringbootproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeEmployerDto {
    private Long id;
    private String name;
    private String companyName;
}
