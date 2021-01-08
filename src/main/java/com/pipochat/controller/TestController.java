package com.pipochat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pipochat.mapper.TestMapper;

@Controller
public class TestController {

	@Autowired
	TestMapper testMapper;

	@RequestMapping("/")
	public String list(Model model) {
		model.addAttribute("test", testMapper.getTest());
		return "list";
	}

}