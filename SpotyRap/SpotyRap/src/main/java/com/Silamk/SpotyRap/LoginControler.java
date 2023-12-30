package com.Silamk.SpotyRap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginControler {

	@GetMapping("/Login")
	@ResponseBody
	public static Boolean validadelogin(String senha) {

		if (senha.contains("k")) {
			return true;
		} else {
			return false;
		}
	}
}
