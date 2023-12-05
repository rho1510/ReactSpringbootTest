package com.example.Test1205.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity(name = "member")
@Table(name = "member")
public class MemberEntity {
    @Id
    private String kakaoEmail;
    private String member_name;
    private int member_age;
    private Date member_birthday;
}
