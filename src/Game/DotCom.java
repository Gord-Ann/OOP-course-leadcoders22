package Game;

import java.util.ArrayList;

public class DotCom {
    private String name;
    private ArrayList<String> locationCells;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String userGuess) {
        String result = "Мимо";
        int index = locationCells.indexOf(userGuess);
        //Сравниваем ход пользователя с местоположением клетки
        if (index >= 0) {
            locationCells.remove(index);
            //Выясняем, была ли это последняя ячейка
            if (locationCells.isEmpty()) {
                result = "Потопил";
                System.out.printf("Ой, Вы потопили %s :(\n", this.name);
            } else {
                result = "Попал";
            }
        }

        return result;
    }
}
