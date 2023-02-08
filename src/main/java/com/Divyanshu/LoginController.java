package com.Divyanshu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController 
{
	//url->http://localhost:8080/login-validation/login
	@RequestMapping("login")
	public String getLoginView()
	{
		return "login.jsp";
	}
	//url->http://localhost:8080/login-validation/validation
	@RequestMapping("validation")
	public String validateUser(String user,String pass,Model model)
	{
		if(user.equals("admin") && pass.equals("Devansh"))
		{
			return "home.jsp";
		}
		model.addAttribute("uid",user);
		model.addAttribute("msg","Authnetication failed");
		return "login.jsp";
	}
}
