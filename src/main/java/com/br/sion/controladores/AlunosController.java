package com.br.sion.controladores;

import com.br.sion.modelo.Aluno;
import com.br.sion.repositorios.AlunosRepository;
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
@RequestMapping("/alunos")
public class AlunosController {
    
    @Autowired
    private AlunosRepository alunosRepository;
    
    @GetMapping
    public String lista(Model model) {
        model.addAttribute("alunos", alunosRepository.lista());
        model.addAttribute("page", "alunos/listaalunos");
        return "main";
    }
    
    @DeleteMapping("/{ra}")
    @ResponseStatus(HttpStatus.OK)
    public void deleta(@PathVariable("ra") Long ra) {
        alunosRepository.remove(ra);
    }
    
    @GetMapping({"/cadastroalunos", "/cadastroalunos/{ra}"})
    public String cadastroalunos(@PathVariable("ra") Optional<Long> ra, Model model) {
        if (ra.isPresent()) {
            model.addAttribute("aluno", alunosRepository.busca(ra.get()));
        } else {
            model.addAttribute("aluno", new Aluno());
        }
        model.addAttribute("page", "alunos/cadastroalunos");
        return "main";
    }
    
    @PostMapping({"/cadastroalunos", "/cadastroalunos/{ra}"})
    public String grava(@PathVariable("ra") Optional<Long> ra, Aluno aluno) {
        if (ra.isPresent()) {
            alunosRepository.atualiza(ra.get(), aluno);
        } else {
            alunosRepository.salva(aluno);
        }
        return "redirect:/alunos";
    }
    
}
