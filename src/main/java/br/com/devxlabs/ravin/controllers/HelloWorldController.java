package br.com.devxlabs.ravin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@GetMapping("/helloWorldHtml")
	public String helloWorldHtml(Model model) {
		String message = "Hello, World!";
		model.addAttribute("message", message);
		return "helloWorldHtml";
	}

	@GetMapping("/hello")
	@ResponseBody
	public String helloWorld() {
		return "Hello, World!";
	}

}
