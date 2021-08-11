package home_work.task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public String SortList(List<String> nameList) {

        return nameList.stream().map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(";\n"));
    }

}
