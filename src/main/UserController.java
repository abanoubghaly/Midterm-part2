package main;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/")
	public String showForm(Model model)
	{
		User usr = new User();
		model.addAttribute("user", usr);
		return "user-form";
	}
	
	@RequestMapping("/user-form-result")
	public String proccessStudentForm(@Valid@ModelAttribute("user") User myUser, 
			BindingResult bindingResult)
	{
		if (bindingResult.hasErrors()) {
			return "user-form";
		}
		return "user-confirmation";
	}
	
}
