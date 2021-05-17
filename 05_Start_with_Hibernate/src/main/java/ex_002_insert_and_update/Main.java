package ex_002_insert_and_update;

import ex_002_insert_and_update.entity.Author;

public class Main {
    //   private static final Logger LOG = Logger.getLogger( AuthorHelper.class.getName() );

    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();

        // добавление автора с добавлением нового столбца
//        Author author = new Author();
//        author.setName("Michael");
//        author.setLastName("Bulgakov");
//
//        ah.addAuthor(author);

        // добавление недостающей фамилии автора
        // так нельзя, потому что добавится новая запись, нужно стделать в транзакции
        // в AuthorHelper

//        Author author = ah.getAuthorById(2);
//        author.setName("Alexander");
//        author.setLastName("Pushkin");
//
//        ah.addAuthor(author);

        ah.addAuthor(null);
    }
}
