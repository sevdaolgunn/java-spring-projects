package koza.dev.firstspringproject.repository;

import koza.dev.firstspringproject.dto.UserDto;
import koza.dev.firstspringproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findById(Integer id);

    List<User> findAll();



}
