package com.rms.model.dto;

import com.rms.model.entity.Role;
import lombok.Data;

@Data
public class UserDTO {
    private String name;
    private String password;
    private Role role;
}
