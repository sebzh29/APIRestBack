package fr.eni.demorest.service;

import fr.eni.demorest.bo.Article;
import fr.eni.demorest.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    private List<Article> articlemocks;

    //post
    @Autowired
    private ArticleRepository articleRepository;

//    public ArticleServiceImpl (){
//        articlemocks = List.of(
//                new Article(1,"Formation Symfony","bjjhhk", "pas moi"),
//                new Article(2,"Authentification Spring","fklgdfjk", "Eric Dupont"),
//                new Article(3,"Formation JavaScript","gkdfsj", "Steven Seagall"),
//                new Article(4,"Initiation Github","kklklkl", "Djamilla Table"),
//                new Article(5,"Dev en couche","kkklkklhg", "Edmond Beausapin"),
//                new Article(6,"Quizz Php","flfd45lvkccbj", "Melanie Melamaniche"),
//                new Article(7," API RestFull","vlkfisf", "Jessica Scroutedanslesac")
//        );
//    }

    //post
    @Override
    public Article getArticleById(Integer id) {
        return articleRepository.findById(id).get();
    }

//    @Override
//    public Article getArticleById(Integer id) {
//        for (Article article : articlemocks) {
//            if(article.getId() == id) return article;
//        }
//        return null;
//    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public void saveArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public void updateArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public void deleteArticle(Integer id) {
        articleRepository.deleteById(id);
    }


}
