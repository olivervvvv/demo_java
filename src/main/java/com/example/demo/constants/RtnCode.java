package com.example.demo.constants;

public enum RtnCode {
	
	SUCCESSFUL(200, "OK"), //
	PARAM_ERROR(400, "param error!"), //
	ACCOUNT_EXISTED(400, "Account existed"), //
	ACCOUNT_NOT_FOUND(404,"ACCOUNT not Found"), //
	INSUFFICIENT_BALANCE(400,"Insufficient Balance"), //
	;

	private int code;
	
	private String message;

	private RtnCode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	
}
