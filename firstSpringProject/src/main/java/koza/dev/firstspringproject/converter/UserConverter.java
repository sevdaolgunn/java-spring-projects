package koza.dev.firstspringproject.converter;

import koza.dev.firstspringproject.dto.UserDto;
import koza.dev.firstspringproject.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserDto convertAsDto(User user){
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .surname(user.getSurname())
                .build();
    }
}
