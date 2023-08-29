package br.com.devxlabs.ravin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloWorldController {
	
	@GetMapping("/helloWorld")
	public String helloWorld(Model model) {
		model.addAttribute("message", "Olá mundo Teste ASDIJHAS");
		return "helloWorld";
	}
	
	@GetMapping("/helloWorldPlain")
	@ResponseBody
	public String helloWorldPlain() {
		return "Teste hello word com text plain";
	}
}
