package com.klef.fsd.springboot.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientDemo 
{
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() 
	{
		return "Full Stack Development";
	}
	
	@GetMapping("/demo1")
	public String demo1() 
	{
		return "<h3>Spring Boot Rest Controller</h3>";
	}
	
	@GetMapping("demo2")
	public int demo2() {
		return 852;
	}
	

	
	@GetMapping("demo3")
	public String demo3(@RequestParam("id") int eid) {
	       return "ID="+eid;	
	}
	
	@GetMapping("demo4")
	public String demo4( @RequestParam String name){
		return "NAME: "+name;
	}
	
	@GetMapping("add")
	public String add( @RequestParam int a,@RequestParam  int b){
		return "OUTPUT: "+(a+b);
	}
	
	@GetMapping("display/{id}")
	public String display( @PathVariable("id") int eid){
		return "ID : "+eid;
	}
	
//	@GetMapping("addd/{a}/{b}")
//	public String addd( @PathVariable int a,@PathVariable int b){
//		return "OUTPUT: "+(a+b);
//	}
	
	@GetMapping("view/{name}")
	public String view( @PathVariable String name){
		return "The Name Is:-" +(name);
	}
	
	@GetMapping("sub/{a}/{b}")
		public String sub( @PathVariable int a,@PathVariable int b) {
			return "OUTPUT="+(a-b);
		}
	
	@GetMapping("test1")
	public String test1(@RequestParam String Fname,@RequestParam  String Lname){
		return "FULLNAME-"+ Fname+ ""+Lname;
		
	}
	
	@GetMapping("test2/{fname}/{lname}")
	public String test2(@PathVariable String fname,@PathVariable String lname){
		return "FULLNAME-"+fname+" "+lname;
		
	}
	
}

