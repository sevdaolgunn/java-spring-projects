package koz.dev.employeespringbootproject.controller;

import jakarta.websocket.server.PathParam;
import koz.dev.employeespringbootproject.dto.EmployerDto;
import koz.dev.employeespringbootproject.dto.request.CreateEmployerRequest;
import koz.dev.employeespringbootproject.service.EmployerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employer")
@RequiredArgsConstructor
public class EmployerController {

    private final EmployerService service;


    @PostMapping("/create")
    public ResponseEntity<EmployerDto> createEmployer(@RequestBody CreateEmployerRequest request){
        return ResponseEntity.ok(service.createEmployer(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployerDto> getEmployer(@PathVariable Long id){
        return ResponseEntity.ok(service.getEmployeeById(id));
    }
}
