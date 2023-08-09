package koz.dev.employeespringbootproject.repository;

import koz.dev.employeespringbootproject.entity.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployerRepository extends JpaRepository<Employer, Long> {
    Optional<Employer> findEmployerById(Long id);
}
