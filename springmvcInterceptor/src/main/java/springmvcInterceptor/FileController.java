package springmvcInterceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FileController {
	
	@RequestMapping("/home")
	public String home() {
		
		System.out.println("This is home page");
		return "home";
	}
	
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("user") String name, Model model) {
		System.out.println(name);
		model.addAttribute("name", name);
		return "welcome";
	}

}

