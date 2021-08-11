package home_work.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Task3 {

    public String arrayNumber(String[] array) {

        return Arrays.stream(array).flatMap(p -> Arrays.stream(p.replace(" ", "").split(",")))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(", "));
    }

}
