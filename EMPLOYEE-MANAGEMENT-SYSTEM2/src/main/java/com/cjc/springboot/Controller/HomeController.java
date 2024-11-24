package com.cjc.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.springboot.model.Employee;
import com.cjc.springboot.serviceI.HomeService;

@Controller
public class HomeController {
	@Autowired
	HomeService hs;

	@GetMapping("/")
	public String prelogin() {
		return "login";
	}

	@GetMapping("/register")
	public String preregister() {
		return "register";
	}

	@GetMapping("/reg")
	public String register(@ModelAttribute Employee s) {
		hs.savedata(s);
		return "login";
	}

	@GetMapping("/log")
	public String loginCheck(@RequestParam("username") String un, @RequestParam("password") String ps, Model m) {
	    Employee emp = hs.logincheck(un, ps);
	    if (emp != null) {
	        Iterable<Employee> ls = hs.displayallData();
	        if (ls != null) {
	            m.addAttribute("data", ls);
	            return "success";
	        }
	        return "login";
	    }
	    return "login";
	}


	@GetMapping("/add")
	public String addUser() {
		return "register";
	}

	@RequestMapping("/edit")
	public String editData(@RequestParam("id") int id, Model m) {
		Employee s = hs.editData(id);
		m.addAttribute("data", s);
		return "edit";

	}

	@RequestMapping("/update")
	public String updateData(@ModelAttribute Employee s, Model m) {
		hs.savedata(s);
		Iterable<Employee> ls = hs.displayallData();

		m.addAttribute("data", ls);
		return "success";

	}

	@RequestMapping("/delete")
	public String delete(@ModelAttribute Employee s, Model m) {
		hs.deletedata(s);
		Iterable<Employee> ls = hs.displayallData();
		m.addAttribute("data", ls);
		return "success";
	}

}
