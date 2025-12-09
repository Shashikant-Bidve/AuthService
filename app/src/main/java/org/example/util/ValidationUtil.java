package org.example.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.model.UserInfoDto;
import org.springframework.context.annotation.Bean;

@Data
@AllArgsConstructor

public class ValidationUtil {

    private UserInfoDto userInfoDto;

    public void validateUserAttributes() {
        if (userInfoDto.getUsername() == null || userInfoDto.getUsername().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        if (userInfoDto.getPassword() == null || userInfoDto.getPassword().isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
    }


}
