package com.ex.jdbcandhibernate.ex_003_hibernate_get_and_insert;

import com.ex.jdbcandhibernate.ex_003_hibernate_get_and_insert.entity.Author;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();

        // получение всех авторов
//        List<Author> authorList = ah.getAuthorList();
//        for (Author author : authorList) {
//            System.out.println(author.getId() + " " + author.getName());
//        }

        // получение автора по id
//        Author author = ah.getAuthorById(7);
//        System.out.println(author.getId() + " " + author.getName());

        // добавление автора
        Author author = new Author();
        author.setName("Lermontov");
        ah.addAuthor(author);

        List<Author> authorList = ah.getAuthorList();
        for (Author a : authorList) {
            System.out.println(a.getId() + " " + a.getName());
        }


    }
}
