

import java.util.*;



public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 20; i++){
            list.add(random.nextInt(30) - 10);
        }
        System.out.println("list: \t\t\t" + list);

        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            newList.add(i, list.get(i));
        }
        System.out.println("newList: \t\t" + newList);


        int[] uniqueNumbers = new int[list.size()];

        for (int i = 0; i < list.size(); i++){
            uniqueNumbers[i] = list.get(i);
        }
        uniqueNumbers = Arrays.stream(uniqueNumbers).distinct().toArray();
        ArrayList<Integer> uniqueNumbersList = new ArrayList<>();

        for (int a : uniqueNumbers){
            uniqueNumbersList.add(a);
        }

        System.out.println("uniqueNumbersList" + uniqueNumbersList);

        Collections.sort(uniqueNumbersList);
        System.out.println("uniqueNumbersList" + uniqueNumbersList);
        Collections.reverse(uniqueNumbersList);
        System.out.println("uniqueNumbersList" + uniqueNumbersList);

        System.out.println("MAX: " + Collections.max(uniqueNumbersList));
        System.out.println("MIN: " + Collections.min(uniqueNumbersList));


        ArrayList<Integer> hiZero = new ArrayList<>();
        for (Integer integer : list) {
            if (integer >= 0) {
                hiZero.add(integer);
            }
        }
        System.out.println("hiZero: " + hiZero);

        list.removeIf(a -> a % 2 != 0);
        System.out.println("even " + list);

        System.out.println(list.indexOf(10));   //если повезет)


    }
}

//    + Сгенерируйте коллекцию целых чисел (ArrayList<Integer>), используя класс Random(). Используя методы классов-коллекций:
//    + Создайте новую коллекцию, переписав в него часть элементов из первой коллекции (к примеру, первые 10 элементов)
//    + Найдите все уникальные числа (те, которые встречаются один раз) и сохраните их в отдельную коллекцию
//    + Отсортируйте коллекцию (по возрастанию/убыванию)
//    + Найдите максимум, минимум и сумму чисел коллекции
//    + Создайте  коллекцию, содержащий все положительные числа первой коллекции
//    + Удалите из первого коллекции все нечетные числа
//    +` Найдите индекс указанного числа в коллекции