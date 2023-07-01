package bione.api.avaliacao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PrincipaisFilmes")

public class Avaliacao {
    
    
    @Id
    private String id;
    private String title;
    private String image;
    private int ranking;

    public Avaliacao(){
        
    }
    
    
    public Avaliacao (String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;

    }
    public String getTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }
    public int getRanking() {
        return ranking;
    }    

    
}
