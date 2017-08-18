package com.indracompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.indracompany.model.Cliente;
import com.indracompany.repository.ClienteRepository;

@Controller
public class FrontEndController {
	@Autowired
	private ClienteRepository repository;
	private Iterable<Cliente> iterable;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("encontraCliente")
	public String encontraCliente() {
		return "encontraCliente";
	}
	
	@RequestMapping("listaCliente")
	public String listaCliente(Model model) {
		
		Iterable<Cliente> Cliente = repository.findAll();
		model.addAttribute("Cliente", Cliente);
		
		return "listaCliente";
	}
	
	@RequestMapping("cadastraCliente")
	public String cadastraCliente() {
		return "cadastraCliente";
	}
	
	@RequestMapping(value = "salvar", method = RequestMethod.POST)
	public String salvar(@RequestParam("ID_CLIENTE") Long ID, @RequestParam("NO_CLIENTE") String Nome) {
		
		Cliente novoCliente = new Cliente(ID,Nome);
		repository.save(novoCliente);
		
		return "index";
	}
	
	@RequestMapping(value ="encontra", method = RequestMethod.GET)
	public String encontra(@RequestParam("ID_CLIENTE") Long ID, Model model) {
		
		Cliente novoCliente = new Cliente();
		novoCliente = repository.findOne(ID);
		model.addAttribute("ClienteNome", novoCliente);
		 
		return "encontraCliente";
	}
}
