package com.org2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ModelAttributeController {

	
	
	
	@RequestMapping(path ="/modelDemo",method = RequestMethod.POST)
	public String m1(@ModelAttribute User  u, Model model)
	{
		System.out.println(u);
		
		
		
		
		
		
		model.addAttribute("u1",u);
		
		return "modelAttri";
	}
	
	/* Without using Model attribute annotation */
	/*	@RequestMapping(path= "/modelDemo", method = RequestMethod.POST)      //here by default the method is get for this form. if we have to process post request then we need to use path and method attri
	    public String modelDemo(@RequestParam("id") int i,@RequestParam("uname") String u,@RequestParam("pass") String p,Model md )
	    {
			
			System.out.println("id = "+i);
			     System.out.println("uname = "+u);
			     System.out.println("pass= "+p);
			     
			     
			     md.addAttribute("ii", i);
			     md.addAttribute("u1", u);
			     md.addAttribute("ps", p);
			     
			     
			     return  "mo";
			     
			     
			}
	    
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
}
