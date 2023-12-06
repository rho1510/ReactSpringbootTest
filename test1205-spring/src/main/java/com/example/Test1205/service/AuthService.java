package com.example.Test1205.service;

import com.example.Test1205.dto.ResponseDto;
import com.example.Test1205.dto.SignUpDto;
import com.example.Test1205.entity.MemberEntity;
import com.example.Test1205.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    MemberRepository memberRepository;

    public ResponseDto<?> signUp(SignUpDto dto) {

        String kakaoEmail = dto.getKakaoEmail();
        String password = dto.getPassword();
        String passwordCheck = dto.getPasswordCheck();

        System.out.println("log auth service1");
        // email 중복 확인
        try {
            System.out.println(kakaoEmail);
            if (memberRepository.existsById(kakaoEmail)) {
                System.out.println("log auth service Email already exists");
                return ResponseDto.setFailed("Email already exists");
            }
        } catch (Exception e) {
            System.out.println("log auth service DataBase Error");
            return ResponseDto.setFailed("DataBase Error");
        }

        System.out.println("log auth service2");

        // 비밀번호가 다르면 failed response 반환
        if (!password.equals(passwordCheck)) {
            return ResponseDto.setFailed("Password does not matched");
        }
        // MemberEntity 객체 생성
        MemberEntity memberEntity = new MemberEntity(dto);

        // MemberRepository를 이용해서 DB에 Entity 저장
        try {
            memberRepository.save(memberEntity);
        } catch (Exception e) {
            return ResponseDto.setFailed("DataBase Error");
        }
        // 성공 시 success response 반환
        return ResponseDto.setSuccess("sign up success", null);
    }
}