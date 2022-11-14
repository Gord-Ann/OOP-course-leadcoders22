package array_list;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        String[] wordsArray = new String[5];
        wordsArray[0] = "Hey";
        wordsArray[1] = "Hi";
        wordsArray[2] = "Hello";
        wordsArray[3] = "Привет";
        wordsArray[4] = "Здравствуйте";
        System.out.println(Arrays.toString(wordsArray));

        for (int i = 0; i < wordsArray.length; i++){
            System.out.println(wordsArray[i]);
        }

        for (String s : wordsArray) {
            System.out.println(s);
        }
    }
}
