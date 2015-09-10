package com.gerrytan.pizzashop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class PizzaController {
	
	@Autowired private PizzaDAO pizzaDAO;
	
	@RequestMapping(method = RequestMethod.GET)
	public String list(Model model) {
		List<Pizza> pizzas = pizzaDAO.findAll();
		model.addAttribute("pizzas", pizzas);
		return "index";
	}
}
