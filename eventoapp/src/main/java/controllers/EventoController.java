package controllers;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import com.eventoapp.eventoapp.EventoappApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EventoController {


	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public String form(){
		return "evento/formEvento";
	}


}	
