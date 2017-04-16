package com.perepelitsya.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Andriu on 10.04.2017.
 */
@Getter
@Setter
public class StudentDto {

    private Long id;

    private String username;

    private String password;

    private String email;

    private String phoneNumber;

    private String gender;

    private String birthDay;
}
