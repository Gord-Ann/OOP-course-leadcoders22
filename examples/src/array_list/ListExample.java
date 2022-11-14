package array_list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>();
        wordsList.add("Hey");
        wordsList.add("Hi");
        wordsList.add("Hello");
        wordsList.add("Здравствуйте");
        wordsList.add("Привет");
        wordsList.add("Привет, Андрей");
        System.out.println(wordsList);

        for (int i = 0; i < wordsList.size(); i++) {
            System.out.println(wordsList.get(i));
        }

        for (String s : wordsList) {
            System.out.println(s);
        }
    }
}
