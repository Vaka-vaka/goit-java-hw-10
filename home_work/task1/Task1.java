package home_work.task1;

import java.util.List;

public class Task1 {

    public String getNameList(List<String> nameList) {

        StringBuilder result = new StringBuilder();
        int number = 1;
        for (String names : nameList) {
            if (number % 2 != 0) {
                result.append(number).append(".").append(names).append(";\n");
            }
            number++;
        }
        return result.toString();
    }

}
