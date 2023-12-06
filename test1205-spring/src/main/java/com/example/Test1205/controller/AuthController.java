package com.example.Test1205.controller;

import com.example.Test1205.dto.ResponseDto;
import com.example.Test1205.dto.SignUpDto;
import com.example.Test1205.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired AuthService authService;
    @PostMapping("/signUp")
    public ResponseDto<?> signUp(@RequestBody SignUpDto requestBody){
        System.out.println("log auth controller");
        ResponseDto<?> result = authService.signUp(requestBody);
        return result;
    }
}
