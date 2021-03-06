package com.activiti.test.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.activiti.test.action.support.BaseController;


@Controller
@RequestMapping("/menu")
public class MenuController extends BaseController{
	
	private static Logger log = LoggerFactory.getLogger(MenuController.class);
	
	@RequestMapping("/index")
	public String index() {
		return "menu_main";
	}
	
}
