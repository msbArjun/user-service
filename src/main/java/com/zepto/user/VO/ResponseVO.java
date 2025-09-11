package com.zepto.user.VO;

public class ResponseVO {
	private String successMessage;
	
	private String failedMessage;

	public ResponseVO(String successMessage, String failedMessage) {
		super();
		this.successMessage = successMessage;
		this.failedMessage = failedMessage;
	}

	public String getSuccessMessage() {
		return successMessage;
	}

	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}

	public String getFailedMessage() {
		return failedMessage;
	}

	public void setFailedMessage(String failedMessage) {
		this.failedMessage = failedMessage;
	}
	
	
}
