package com.br.sion.controladores;

import com.br.sion.repositorios.ProfessoresRepository;
import com.br.sion.modelo.Professor;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


@Controller
@RequestMapping("/professores")
public class ProfessoresController {
    
    @Autowired
    private ProfessoresRepository professoresRepository;
    
    @GetMapping
    public String lista(Model model) {
        model.addAttribute("professores", professoresRepository.lista());
        model.addAttribute("page", "professores/listaprofessores");
        return "main";
    }
    
    @DeleteMapping("/{professor_cpf}")
    @ResponseStatus(HttpStatus.OK)
    public void deleta(@PathVariable("professor_cpf") Long professor_cpf) {
        professoresRepository.remove(professor_cpf);
    }
    
    @GetMapping({"/cadastroprofessores", "/cadastroprofessores/{professor_cpf}"})
    public String cadastroprofessores(@PathVariable("professor_cpf") Optional<Long> professor_cpf, Model model) {
        if (professor_cpf.isPresent()) {
            model.addAttribute("professor", professoresRepository.busca(professor_cpf.get()));
        } else {
            model.addAttribute("professor", new Professor());
        }
        model.addAttribute("page", "professores/cadastroprofessores");
        return "main";
    }
    
    @PostMapping({"/cadastroprofessores", "/cadastroprofessores/{professor_cpf}"})
    public String grava(@PathVariable("professor_cpf") Optional<Long> professor_cpf, Professor professor) {
        if (professor_cpf.isPresent()) {
            professoresRepository.atualiza(professor_cpf.get(), professor);
        } else {
            professoresRepository.salva(professor);
        }
        return "redirect:/professores";
    }
    
}
