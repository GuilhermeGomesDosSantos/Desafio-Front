package br.com.alura.screenmatch_frases.Repository;

import br.com.alura.screenmatch_frases.Model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase,Long> {
}
