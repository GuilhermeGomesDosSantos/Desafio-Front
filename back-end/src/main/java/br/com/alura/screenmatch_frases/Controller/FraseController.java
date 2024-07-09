package br.com.alura.screenmatch_frases.Controller;

import br.com.alura.screenmatch_frases.DTO.FraseDTO;
import br.com.alura.screenmatch_frases.Model.Frase;
import br.com.alura.screenmatch_frases.Repository.FraseRepository;
import br.com.alura.screenmatch_frases.Service.FraseServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseRepository reposotorio;
    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria() {
        Frase frase = reposotorio.findById(4L).get();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(),frase.getPoster());
    }
}
