package com.cloudapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

	@RequestMapping(value = "/dashboard")
	public String loadDashboard()  {
		return "index";
	}

}
