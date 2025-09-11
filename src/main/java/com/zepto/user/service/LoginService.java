package com.zepto.user.service;

import com.zepto.user.VO.LoginVO;
import com.zepto.user.VO.ResponseVO;

public interface LoginService {

	ResponseVO validateUser(LoginVO loginVO);

}
