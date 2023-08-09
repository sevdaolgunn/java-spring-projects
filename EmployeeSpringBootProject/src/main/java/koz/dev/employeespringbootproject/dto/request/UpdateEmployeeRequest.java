package koz.dev.employeespringbootproject.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UpdateEmployeeRequest {
    private String name;
    private float salary;
    private Long employerId;
}
