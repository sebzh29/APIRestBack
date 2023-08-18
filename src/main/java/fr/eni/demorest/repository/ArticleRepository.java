package fr.eni.demorest.repository;

import fr.eni.demorest.bo.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
