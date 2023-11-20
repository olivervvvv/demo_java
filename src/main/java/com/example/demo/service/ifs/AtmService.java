package com.example.demo.service.ifs;

import com.example.demo.vo.AtmResponse;

public interface AtmService {
	public AtmResponse addInfo(String account,String pwd);
	
	public AtmResponse getBlanceByAccount(String account, String pwd);
	
	public AtmResponse updatePwd(String account, String oldPwd, String newPwd);
	
	public AtmResponse despoite(String account, String pwd, int amount);

	public AtmResponse withdraw(String account, String pwd, int amount);

}
