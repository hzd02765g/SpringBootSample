package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	/** ログイン画面を表示 */
	@GetMapping("/login")
	public String getLogin() {
		return "login/login";
	}
	
	@PostMapping("/login")
	public String postLogout() {
		return "redirect:/user/list";
	}
}
