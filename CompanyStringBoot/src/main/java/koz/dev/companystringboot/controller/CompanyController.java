package koz.dev.companystringboot.controller;

import koz.dev.companystringboot.dto.request.CreateCompanyRequest;
import koz.dev.companystringboot.exception.EmailAlreadyExistsException;
import koz.dev.companystringboot.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/company")

public class CompanyController {
    private final CompanyService companyService;

    @PostMapping("/register")
    public ResponseEntity<String> registerCompany(@RequestBody CreateCompanyRequest request){
        try {
            companyService.registerCompany(request.getName(),request.getEmail());
            return ResponseEntity.ok("Şirket başarıyla oluşturuldu");
        }
        catch (EmailAlreadyExistsException e){
            return  ResponseEntity.badRequest().body(e.getMessage());

        }
    }
}
