package com.the_daul_intra.mini.controller;


import com.the_daul_intra.mini.dto.request.loginRequestDTO;
import com.the_daul_intra.mini.service.apiEmpService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class apiController {

    private final apiEmpService apiEmpService;
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody loginRequestDTO dto){

        return ResponseEntity.ok().body(apiEmpService.apiLogin(dto.getEmail(), dto.getPassword()));
    }

}
