package ex_003_delete;

import ex_003_delete.entity.Author;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();

//        ah.deleteById(2);
//        ah.deleteCriteria();
        ah.deleteCriteriaLogic();
    }
}
