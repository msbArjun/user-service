package com.zepto.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.user.VO.LoginVO;
import com.zepto.user.VO.ResponseVO;
import com.zepto.user.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping("/validateUser")
	public ResponseVO validateUser(@RequestBody LoginVO loginVO) {
		return loginService.validateUser(loginVO);
	}
}
