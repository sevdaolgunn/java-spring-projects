package koza.dev.firstspringproject.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_info")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

}
