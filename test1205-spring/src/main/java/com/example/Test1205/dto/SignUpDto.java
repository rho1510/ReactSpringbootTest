package com.example.Test1205.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SignUpDto {
    private String kakaoNickname;
    private String kakaoEmail;
    private String password;
    private String passwordCheck;
    private String kakaoName;
    private int kakaoAge;
    private Date kakaoBirthday;
}
