package com.example.Test1205.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SignUpDto {
    private String kakaoNickname;
    private String kakaoEmail;
    private String kakaoName;
    private String kakaoSex;
    private String kakaoAge;
    private Date kakaoBirthday;
}
