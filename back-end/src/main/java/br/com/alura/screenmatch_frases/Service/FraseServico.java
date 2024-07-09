package br.com.alura.screenmatch_frases.Service;

import br.com.alura.screenmatch_frases.DTO.FraseDTO;
import br.com.alura.screenmatch_frases.Model.Frase;
import br.com.alura.screenmatch_frases.Repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseServico {
    @Autowired
    private FraseRepository repositorio;
    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.findById(4L).get();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
