package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.User;
import service.UserService;

/**
 * 能够处理所有的user相关请求
 */
@Controller
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping("/login.do")
	public String login(User user,Model model) {
		//处理登录业务
		User u=service.login(user);
		if (u == null) {
			return "index";
		}
		model.addAttribute("user",user.getUsername());
		return "show";
	}

	
}
