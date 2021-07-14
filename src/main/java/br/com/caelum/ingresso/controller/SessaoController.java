package br.com.caelum.ingresso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.ingresso.dao.FilmeDao;
import br.com.caelum.ingresso.dao.SalaDao;
import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Sala;

@Controller
public class SessaoController {
	
	@Autowired
	private SalaDao salaDao;
	
	@Autowired
	private FilmeDao filmeDao;
	
	@GetMapping("/admin/sessao")
	public ModelAndView form(@RequestParam("salaId") Integer salaId) {
		
		//sala
		//SalaDao salaDao = new SalaDao();
		Sala sala = salaDao.findOne(salaId);
		
		//FilmeDao filmeDao = new FilmeDao();
		List<Filme> filmes = filmeDao.findAll();
		
		ModelAndView modelAndView = new ModelAndView("sessao/sessao");
		modelAndView.addObject("sala", sala);
		modelAndView.addObject("filmes", filmes);
		
		return modelAndView;
		
	}

}
