package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ContractsController {

	@Autowired
	DeveloperRepository repository;

    @RequestMapping("/developer/{id}")
	public String developer(@PathVariable Long id, Model model) {
        model.addAttribute("developer", repository.findOne(id));
        return "developer";
	}

    @RequestMapping("/developers")
	public String developers(Model model) {
        model.addAttribute("developers", repository.findAll());
        return "developers";
	}

}
