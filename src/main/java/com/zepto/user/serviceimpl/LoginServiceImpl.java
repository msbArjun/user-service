package com.zepto.user.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.zepto.user.VO.LoginVO;
import com.zepto.user.VO.ResponseVO;
import com.zepto.user.entity.UserEntity;
import com.zepto.user.repository.UserRepository;
import com.zepto.user.service.LoginService;

public class LoginServiceImpl implements LoginService{

	@Autowired
	private UserRepository userRepo;
	@Override
	public ResponseVO validateUser(LoginVO loginVO) {
		Optional<UserEntity> user=userRepo.findByUserId(loginVO.getUserId());
		return null;
	}

}
