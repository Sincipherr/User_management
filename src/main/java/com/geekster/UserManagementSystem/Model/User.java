package com.geekster.UserManagementSystem.Model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @NotEmpty
    private String UserID;
    @NotEmpty
    private String UserName;
    @NotEmpty
    @Pattern(regexp = "^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4}$")
    private String DOB;
    @NotEmpty
    @org.hibernate.validator.constraints.Email
    private String email;
    @NotEmpty
    @Size(min = 12,max = 12)
    @Pattern(regexp = "^[0-9]+$")
    private String PhoneNO;
    @NotEmpty
    @Pattern(regexp = "^\\d\\d.*[0-9]+$")
    private String Date;
    @NotEmpty
    @Pattern(regexp = "^[0-9]+:[0-9]+:[0-9]+$")
    private String Time;

}
