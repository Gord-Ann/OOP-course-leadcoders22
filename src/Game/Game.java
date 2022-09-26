package Game;

import java.io.IOException;
import java.util.ArrayList;

public class Game {
    private int comCount = 0;
    private final int gridSize = 49;
    private final int[] grid = new int[gridSize];
    private static final String alphabet = "abcdefg";

    public static void main(String[] args) throws IOException {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCell = new ArrayList<>();
        String temp; //временная строка для конкатенации
        int[] coords = new int[comSize]; //координаты текущего "сайта"
        int attempts = 0; //счетчик текущих попыток
        boolean success = false; //нашли подходящее местоположение?
        int location; //текущее начальное положение

        comCount++;
        int incr = 1;
        int gridLength = 7;
        if (comCount % 2 == 1) {
            incr = gridLength;
        }

        while (!success & attempts++ < 200) {
            location = (int) (Math.random() * gridSize);
            int x = 0;
            success = true;

            while (success && x < comSize) {
                if (grid[location] == 0) {
                    coords[x++] = location;
                    location += incr;

                    if (location >= gridSize) {
                        success = false;
                    }

                    if (location % gridLength == 0) {
                        success = false;
                    }
                } else {
                    success = false;
                }
            }
        }

        int x = 0;
        int row;
        int column;

        while (x < comSize) {
            grid[coords[x]] = 1;
            row = coords[x] / gridLength;
            column = coords[x] % gridLength;
            temp = String.valueOf(alphabet.charAt(column));

            alphaCell.add(temp.concat(Integer.toString(row)));
            x++;
        }

        return alphaCell;
    }
}
