package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import buisness.UserService;
import models.User;

@Controller
@RequestMapping("/users")
public class UserController {

	private UserService userService;
	@Autowired(required = true)
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	 @GetMapping("/list")
	    public String listUsers(Model theModel) {
	        List<User> theusers = userService.getUsers();
	        theModel.addAttribute("users", theusers);
	        return "users/list-users";
	    }
}
