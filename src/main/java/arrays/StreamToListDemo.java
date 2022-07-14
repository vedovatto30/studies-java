package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToListDemo {
    public static void main(String[] args) {
        List<String> ids = Arrays.asList("123", "456", "789");
        ids.stream().map(Integer::parseInt).collect(Collectors.toList());


    }
}
