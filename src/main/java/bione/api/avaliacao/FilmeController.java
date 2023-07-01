package bione.api.avaliacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmeController {

    @Autowired
    private AvaliacaoRepository repositorio;

    
    
    @GetMapping(value="/filmes")
    public List<Avaliacao> obterFilmes(){
        List<Avaliacao> filmes = repositorio.findAll();
        return filmes;
    }    
}
