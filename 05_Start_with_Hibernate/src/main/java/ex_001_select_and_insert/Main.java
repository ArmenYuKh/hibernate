package ex_001_select_and_insert;

import ex_001_select_and_insert.entity.Author;

import java.util.List;

public class Main {
    //   private static final Logger LOG = Logger.getLogger( AuthorHelper.class.getName() );

    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();

        // вывод списка всех авторов
        List<Author> authorList = ah.getAuthorList();

        for (Author author : authorList) {
            System.out.println(author.getId() + " " + author.getName());
        }

        // добавление автора
        Author author = new Author("Shevchenko");

        ah.addAuthor(author);

        for (Author a : authorList) {
            System.out.println(a.getId() + " " + a.getName());
        }

        // получение автора по ID

        Author getAuthor = ah.getAuthorById(2);
        System.out.println(getAuthor.getId() + " " + getAuthor.getName());

    }
}
