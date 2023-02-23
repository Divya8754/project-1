package com.example.StudentExample.Controller;

public class StudentController {

}
package com.example.StudentExample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.StudentExample.Entity.StudentEntity;
import com.example.StudentExample.Sevice.StudentService;

@RestController
public class StudentController {	
	@Autowired(required=true)	
	StudentService  stuService;
	@PostMapping("/addDetails")	
	public StudentEntity addInfo(@RequestBody StudentEntity st)	{
		return stuService.saveDetails(st);	
		}
	}