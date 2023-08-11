package koz.dev.companystringboot.controller;

import koz.dev.companystringboot.dto.CompanyDto;
import koz.dev.companystringboot.dto.request.CreateCompanyRequest;
import koz.dev.companystringboot.dto.request.UpdateCompanyRequest;
import koz.dev.companystringboot.exception.EmailAlreadyExistsException;
import koz.dev.companystringboot.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{id}")
    public ResponseEntity<CompanyDto> getCompany(@PathVariable Long id){
        return ResponseEntity.ok(companyService.getCompanyById(id));
    }

    @GetMapping
    public List<CompanyDto> getAllCompany(){
        return companyService.getAllCompany();
    }
    @PutMapping("/update")
    public ResponseEntity<CompanyDto> updateCompany(@RequestBody UpdateCompanyRequest request){
        return ResponseEntity.ok(companyService.updateCompany(request));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCompany(@PathVariable Long id){
        companyService.deleteCompany(id);
        return ResponseEntity.ok().build();
    }
}
