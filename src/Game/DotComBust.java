package Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DotComBust {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private final Game helper = new Game();
    private int numOfGuesses = 0;
    private final ArrayList<DotCom> dotComList = new ArrayList<>();

    public void setUpGame() {
        //Создадим несколько "сайтов" и присвоим им имена и адреса
        DotCom go2 = new DotCom();
        DotCom pets = new DotCom();
        DotCom askMe = new DotCom();

        go2.setName("Go2.com");
        pets.setName("Pets.com");
        askMe.setName("AskMe.com");

        dotComList.add(go2);
        dotComList.add(pets);
        dotComList.add(askMe);

        System.out.println("Ваша цель - потопить три \"сайта\".");
        System.out.printf("%s, %s, %s\n", go2.getName(), pets.getName(), askMe.getName());
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom list : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            list.setLocationCells(newLocation);
        }
    }

    public void startPlaying() throws IOException {
        //Запрашиваем у пользователя ход и вызываем метод checkUserGuess(),
        //пока все объекты не выведем из игры
        while (!dotComList.isEmpty()) {
            System.out.print("Сделайте ход ");
            String guess = reader.readLine();
            checkUserGuess(guess);
        }

        finishGame();
    }

    public void checkUserGuess(String guess) {
        //Просматриваем все остальные объекты и вызываем каждый
        //объект метода checkYourself()
        numOfGuesses++;
        String result = "";

        for (DotCom list : dotComList) {
            result = list.checkYourself(guess);

            if (result.equals("Попал")) {
                break;
            }

            if (result.equals("Потопил")) {
                dotComList.remove(list);
                break;
            }
        }

        System.out.println(result);
    }

    public void finishGame() {
        //Выводим на экран сообщение об успехах пользователя, основываясь на том,
        //за сколько ходов тот потопил все объекты
        System.out.println("Все \"сайты\" ушли ко дну! Ваши акции теперь ничего не стоят.");

        if (numOfGuesses <= 18) {
            System.out.printf("Это заняло у вас всего %d попыток.\n", numOfGuesses);
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули.");
        } else {
            System.out.printf("Это заняло у вас довольно много времени. %d попыток.\n", numOfGuesses);
            System.out.println("Рыбы водят хороводы вокруг ваших вложений");
        }
    }
}
