package fr.eni.demorest.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//post on ajoute @entity
@Entity


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article { //Blog
    //post @id et @GV
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titre;
    private String contenu;
    private String auteur;
}
