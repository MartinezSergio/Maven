package net.impactotecnologico.mvc.demo.controller;

import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.impactotecnologico.mvc.demo.model.Categoria;

@Controller
public class CategoryController {

	@RequestMapping(path = { "/category" }, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String sayHello(Model model) {

		Categoria categoria = new Categoria(1, "Alimentacion");

		model.addAttribute("nombre", categoria.getNombre());
		model.addAttribute("categoria", categoria);

		JSONObject json = new JSONObject();

		json.put("id", categoria.getId());
		json.put("nombre", categoria.getNombre());

		return json.toString();
	}

}
