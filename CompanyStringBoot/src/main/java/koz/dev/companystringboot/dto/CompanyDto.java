package koz.dev.companystringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CompanyDto {

    private Long id;
    private String name;
    private String email;
    private Date created_date;
}
