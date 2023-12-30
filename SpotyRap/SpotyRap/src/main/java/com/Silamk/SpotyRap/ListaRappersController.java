package com.Silamk.SpotyRap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ListaRappersController {
	@GetMapping("/Topdez")
	@ResponseBody
	public static  String[] validadelogin() {

		return listaderappers;
		
	}
		public static String[] listaderappers = new String[] {"Jotape","Xamuel","Brennuz","Jhonny"};
	

}
