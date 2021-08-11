package home_work;

import home_work.task1.Task1;
import home_work.task2.Task2;
import home_work.task3.Task3;
import home_work.task4.Task4;
import home_work.task5.Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MainTest {

    public static void main(String[] args) {

        // ex.1

        List<String> nameList = Arrays.asList
                ("Ivan", "Peter", "Valentin", "Tanya", "Ivana", "Vasyl", "Sasha", "Ira", "Vova", "Inna");
        //("A", "B", "c", "d", "e", "z");
        Task1 task1 = new Task1();
        System.out.print("task1:\n" + task1.getNameList(nameList));
        System.out.println("----------------------------");

        // ex.2

        Task2 task2 = new Task2();
        System.out.println("task2:\n" + task2.SortList(nameList));
        System.out.println("----------------------------");

        // ex.3

        String[] array = new String[]{"1, 2, 0", "4, 5"};
        Task3 task3 = new Task3();
        System.out.println("task3:\n" + task3.arrayNumber(array));
        System.out.println("----------------------------");

        // ex.4

        Task4 task4 = new Task4();
        System.out.println("task4:\n" + task4.generator(25214903917L, 11L, 2 ^ 48, 0L));
        System.out.println("----------------------------");

        // ex.5

        Stream<String> first = Arrays.stream(new String[]{"1", "2", "3", "4", "5"});
        Stream<String> second = Arrays.stream(new String[]
                {"one", "two", "three", "four", "five", "six", "seven",
                        "eight", "nine", "zero"});

        System.out.println("task5:\n" + Task5.zip(first, second).collect(Collectors.joining(", ")));
        System.out.println("----------------------------");
    }

}