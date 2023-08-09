package koz.dev.employeespringbootproject.controller;

import koz.dev.employeespringbootproject.dto.EmployeeDto;
import koz.dev.employeespringbootproject.dto.request.CreateEmployeeRequest;
import koz.dev.employeespringbootproject.dto.request.UpdateEmployeeRequest;
import koz.dev.employeespringbootproject.entity.Employee;
import koz.dev.employeespringbootproject.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    @PostMapping("/add")
    public ResponseEntity<EmployeeDto> addEmployee(@RequestBody CreateEmployeeRequest request){
        return ResponseEntity.ok(service.addEmployee(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable Long id){
        return ResponseEntity.ok(service.getEmployeeById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable Long id,
                                                     @RequestBody UpdateEmployeeRequest request){
        return ResponseEntity.ok(service.updateEmployee(id,request));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id){
        service.deleteEmployee(id);
        return ResponseEntity.ok().build();

    }


}
