import task1.IStringRowsListSorter;
import task1.Task1Impl;
import task2.Task2ImplStart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        test1();
        //test2();
    }

    public static void test1() {
        List<String[]> list = new ArrayList<>();
        list.add(new String[]{"7", "123"});
        list.add(new String[]{"2", "1asd54gg"});
        list.add(new String[]{"4", "1"});
        list.add(new String[]{"4", ""});
        list.add(new String[]{"2", null});
        list.add(new String[]{"0", "c123"});
        list.add(new String[]{"9", "dsa565v6g"});
        list.add(new String[]{"h", "dsa"});
        list.add(new String[]{"4vvvj6", "4546/*ds.,a"});
        list.add(new String[]{"bvv5kkj6n565", "fofnoduhftf76fdf;f.,fmkdjf"});
        IStringRowsListSorter sorter = Task1Impl.INSTANCE;
        sorter.sort(list, 1);
        for (String[] s : list) {
            System.out.println(Arrays.asList(s));
        }
    }

    public static void test2() throws Exception {
        Task2ImplStart task = new Task2ImplStart();
        task.testAssignNumbers();
    }
}