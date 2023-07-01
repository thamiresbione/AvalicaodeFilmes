package bione.api.avaliacao;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AvaliacaoRepository extends MongoRepository<Avaliacao, String> {
    
}
