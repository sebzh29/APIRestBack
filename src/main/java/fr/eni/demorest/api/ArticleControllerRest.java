package fr.eni.demorest.api;


import fr.eni.demorest.bo.Article;
import fr.eni.demorest.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleControllerRest {

    @Autowired
    private ArticleService articleService;

    @GetMapping
    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    public List<Article> allArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/{id:[0-9]+}")
    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    public Article getArticles(@PathVariable Integer id) {
        return articleService.getArticleById(id);
    }

    @PostMapping
    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    public ResponseEntity<Article> addArticles(@RequestBody Article article) {
       articleService.saveArticle(article);
        return ResponseEntity.created(null).body(article);//201
    }

    @PutMapping("/{id:[0-9]+}")
    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    public ResponseEntity<Article> updateArticles(@PathVariable Integer id,
                                  @RequestBody Article article) {
        article.setId(id);
        articleService.saveArticle(article);
        return ResponseEntity.accepted().body(article);//202
    }

    @DeleteMapping("/{id:[0-9]+}")
    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    public ResponseEntity<String> deleteArticles(@PathVariable Integer id) {
        articleService.deleteArticle(id);
        return ResponseEntity.noContent().build();//204

    }

}
