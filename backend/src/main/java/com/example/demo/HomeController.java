package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

/**
 * 기본 엔트포인트 제공, restful 처리
 */
@RequiredArgsConstructor
@RequestMapping("/api/test")
@RestController
public class HomeController {
	private final UserService userService;
    @GetMapping("/home")
    public User home() {
    	return userService.findByLongId(1);
        //return "{ \"status\":\"ok\" }";
    }
}








