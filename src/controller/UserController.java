package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.User;
import service.UserService;

/**
 * �ܹ��������е�user�������
 */
@Controller
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping("/login.do")
	public String login(User user,Model model) {
		//�����¼ҵ��
		User u=service.login(user);
		if (u == null) {
			return "index";
		}
		model.addAttribute("user",user.getUsername());
		return "show";
	}

	
}
