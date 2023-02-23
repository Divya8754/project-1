package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class divya {
	@RequestMapping("/")
	public String message ()
	{
		return "NewFile.jsp";
	}

}
