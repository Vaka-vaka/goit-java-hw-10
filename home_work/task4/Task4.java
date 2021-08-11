package home_work.task4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {

    public List<Long> generator(long a, long c, long m, long seed) {
        Stream<Long> streamFromIterate = Stream.iterate(seed, x -> (a * x + c) % m);
        return streamFromIterate.limit(5).collect(Collectors.toList());
    }

}
