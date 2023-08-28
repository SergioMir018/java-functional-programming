package com.functional.streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    Random random = new Random();

    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        // This is the function that generates the stream
        Stream.of("Manolo", "Pedro", "Baldomero", "Paula", "Ana")
                // From now on 0 or more intermediate operations should be provided. This kind of operation will always
                // return another stream in order to continue concatenating more intermediate operations
                .filter(name -> name.toLowerCase().contains("p"))
                // Until now all that was done was a presentation of intentions because all the intermediate operations
                // of the pipeline are lazy and will not execute until a terminal function is call, like in this case, the
                // method forEach will not return another stream concluding therefor the pipeline
                .forEach(System.out::println);

        var names = List.of("Manolo", "Pedro", "Baldomero", "Paula", "Ana");

        var filteredNames = names.stream()
                .filter(name -> name.toLowerCase().contains("p"))
                // In this case there is a terminal function that returns a value, in this case a List, but it's NOT a stream
                // so this operation is a valid terminal function and the pipeline would be complete
                .toList();

        var streamGenerated = Stream.generate(() -> random.nextInt(10));

/*
        Flux.integerList(10, this::randomInt)
                .order(Integer::compareTo)
                .doSomething(System.out::print)
                .filter(value -> value >= 0)
                .doSomething(System.out::print)
                .transform(NumberUtils::squareUp)
                .doSomething(System.out::println)
                //.sumValues(0, Integer::sum)
                .max(Comparator.naturalOrder())
                .ifPresentOrElse(
                        value -> System.out.println("Total: " + value),
                        () -> System.out.print("There is no max value because the flux is empty")
                        );
*/
    }

    private int randomInt() {
        return random.nextInt(10);
    }
}
