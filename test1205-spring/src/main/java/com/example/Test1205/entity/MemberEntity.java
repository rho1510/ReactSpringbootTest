package com.example.Test1205.entity;

import com.example.Test1205.dto.SignUpDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity(name = "member")
@Table(name = "member")
@NoArgsConstructor
public class MemberEntity {
    @Id
    private String kakao_email;
    private String member_name;
    private int member_age;
    private Date member_birthday;

    public MemberEntity(SignUpDto dto) {
        this.kakao_email = dto.getKakaoEmail();
        this.member_name = dto.getKakaoName();
        this.member_age = dto.getKakaoAge();
        this.member_birthday = dto.getKakaoBirthday();
    }
}
