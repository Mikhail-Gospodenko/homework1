package homework12;

import java.util.*;
//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//Найти и вывести список уникальных слов, из которых состоит массив
//(дубликаты не считаем). Посчитать, сколько раз встречается каждое слово

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    private static void taskTwo() {
        Directory directory = new Directory();
        //directory.add();
        //directory.getPhoneByName();
    }

    public static void taskOne() {
        String[] words = {"собака", "кот", "лицо", "мяч", "кот", "крест", "клавиатура", "рисунок", "рисунок", "кот", "мяч", "мышка", "сок"};

        Map<String, Integer> hm = new HashMap<>();

        for (String i : words) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        System.out.println(hm);

        Set<String> set = new HashSet<>(Arrays.asList(words));
        System.out.println(set);

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }

        for (String key : hm.keySet()) {
            System.out.print(key + " ");
        }
    }
}