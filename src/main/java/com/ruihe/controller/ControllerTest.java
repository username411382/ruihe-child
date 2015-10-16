package com.ruihe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest {
	@RequestMapping(value="index.do")
	public void index(Model model){
		model.addAttribute("index", "HelloWord!这是我的第一个小程序。");
	}
}
