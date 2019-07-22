package com.coding.dojo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coding.dojo.model.Lender;

import com.coding.dojo.dao.LenderRepository;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private LenderRepository lenderRepository;

	@GetMapping(path = {"/login", "/home"})
	public String LogIn() {
		return "index";
	}
	
	@GetMapping(path = "/register")
	public String Register(ModelMap mp) {
		mp.put("lender", new Lender());
		return "register";
	}	
	
	@PostMapping(path = "/create")
	public String createLender (@Valid Lender lender, 
			BindingResult bindingResult, ModelMap mp) {
		lenderRepository.save(lender);
		mp.put("lender", new Lender());
		return "index";
	}
	
	@GetMapping( path = "/lender")
	public String Lender() {
		return "lender";
	}	
	
	@GetMapping("/borrower")
    public String borrowerForm(Model model) {
        model.addAttribute("borrower", new Lender());
        return "borrower";
    }

    @PostMapping("/borrower")
    public ModelAndView listarModelAndView() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("borrower", lenderRepository.findAll());
        mav.setViewName("borrower");
        return mav;
    }
	
	/*
	 * 
	 * @RequestMapping(value = "/borrower", method = RequestMethod.GET)
	public String Borrower (ModelMap mp) {
		mp.put("lenders", lenderRepository.findAll());
		return "borrower";
	}
	
	@GetMapping("/borrower")
	public ModelAndView getBorrower() {
		List<Lender> lenders = lenderRepository.findAll();
		return new ModelAndView("borrower").addObject("lenders", lenders);
	}*/
}
