package com.ordestiny.tdd.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class User {
    @NotBlank(message = "name is mandatory")
    private String name;

    @Pattern(regexp = "M|F", flags = Pattern.Flag.CASE_INSENSITIVE)
    private String sex;

    @Pattern(regexp="^[A-Za-z0-9+_.-]+@(.+)$")
    private String email;

    @Pattern(regexp="(^$|[0-9]{10})")
    private String phone;
}
