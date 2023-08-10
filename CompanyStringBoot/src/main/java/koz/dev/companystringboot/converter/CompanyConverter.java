package koz.dev.companystringboot.converter;

import koz.dev.companystringboot.dto.CompanyDto;
import koz.dev.companystringboot.entity.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyConverter {

    public CompanyDto convertAsDto(Company company){
        return CompanyDto.builder()
                .id(company.getId())
                .name(company.getName())
                .email(company.getEmail())
                .build();

    }
}
