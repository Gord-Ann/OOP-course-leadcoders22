package task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NullNumericAndStringComparator implements Comparator<String> {

    /**
     * Принцип сортировки делится на 3 части:
     * 1. Null
     * 2. "" - пустое значение
     * 3. Остальное
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return -1, 0, 1 если первая строка больше, равна или меньше второй соответственно
     */
    @Override
    public int compare(String o1, String o2) {
        // 1
        if (o1 == null || o2 == null) {
            return nullComparator(o1, o2);
        }

        // 2
        if (o1.equals("") || o2.equals("")) {
            return emptyStringComparator(o1, o2);
        }

        // 3
        return stringComparator(o1, o2);
    }

    /**
     * Сравнение строк, где одна,
     * как минимум, равна null.
     * <ul>
     *     <li>null == null</li>
     *     <li>null > anyString </li>
     * </ul>
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return -1, 0, 1 если первая строка больше, равна или меньше второй соответственно
     */
    private int nullComparator(String o1, String o2) {
        if (o1 == null) {
            return (o2 == null) ? 0 : -1;
        }

        return 1;
    }

    /**
     * Сравнение строк, где одна,
     * как минимум, пустая ("")
     * и точно не равны null
     * <ul>
     *     <li>"" == ""</li>
     *     <li>"" > anyString </li>
     * </ul>
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return 1, 0, -1 если первая строка больше, равна или меньше второй соответственно
     */
    private int emptyStringComparator(String o1, String o2) {
        if (o1.equals("")) {
            return (o2.equals("")) ? 0 : -1;
        }

        return 1;
    }

    /**
     * Сравнение строк по принципу:
     * 1. Разделяем строку на подстроки
     * 2. Пытаемся преобразовать подстроки в числа
     * 3. Если не выходит (возвращает null), то сравниваются строки
     * 4. Если при сравнении подстроки одинаковые,
     * но кол-во подстрок разное, то сравниваем по длине
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return 1, 0, -1 если первая строка больше, равна или меньше второй соответственно
     */
    private int stringComparator(String o1, String o2) {
        Iterator<String> str1 = Tokenize(o1).iterator();
        Iterator<String> str2 = Tokenize(o2).iterator();

        while (str1.hasNext() && str2.hasNext()) {
            String token1 = str1.next();
            String token2 = str2.next();

            Integer numbersCompare = tryToCompareNumbers(token1, token2);
            if (numbersCompare != null && numbersCompare != 0) {
                return numbersCompare;
            }

            int stringCompare = token1.compareTo(token2);
            if (stringCompare != 0) {
                return stringCompare;
            }
        }

        return Integer.compare(o1.length(), o2.length());
    }

    /**
     * Разделяет строку на числа и не числа
     *
     * @param str строка для разбиения
     * @return список из подстрок
     */
    private Iterable<String> Tokenize(String str) {
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\D+|\\d+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            list.add(matcher.group());
        }

        return list;
    }

    /**
     * Сравнение чисел
     *
     * @param o1 первое число в строковом формате
     * @param o2 первое число в строковом формате
     * @return при преобразовании строк в числа: -1, 0, 1, иначе null
     */
    private Integer tryToCompareNumbers(String o1, String o2) {
        Integer res1 = tryParse(o1);
        Integer res2 = tryParse(o2);

        if (res1 != null && res2 != null) {
            return res1.compareTo(res2);
        } else {
            return null;
        }
    }

    /**
     * Преобразование в число.
     *
     * @param num строка для преобразования
     * @return возвращает null, если не удалось преобразовать в число
     */
    private Integer tryParse(String num) {
        try {
            return Integer.valueOf(num);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
