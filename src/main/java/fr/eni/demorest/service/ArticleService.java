package fr.eni.demorest.service;

import fr.eni.demorest.bo.Article;

import java.util.List;

public interface ArticleService {

    Article getArticleById(Integer id);
    List<Article> getAllArticles();

    void saveArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(Integer id);
}
