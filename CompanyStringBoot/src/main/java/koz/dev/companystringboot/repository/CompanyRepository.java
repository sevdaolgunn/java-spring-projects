package koz.dev.companystringboot.repository;

import koz.dev.companystringboot.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {

    boolean existsByEmail (String email);
    Optional<Company> findCompanyByEmail(String email);
    Optional<Company> findCompanyById(Long id);
}
