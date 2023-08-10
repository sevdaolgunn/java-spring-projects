package koz.dev.companystringboot.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CreateCompanyRequest {
    private Long id;
    private String name;
    private String email;
    private Date created_date;
}
