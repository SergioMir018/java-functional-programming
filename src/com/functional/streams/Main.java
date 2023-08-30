package com.functional.streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    Random random = new Random();

    public static void main(String[] args) {
        new Main();
    }

    public Main() {

//        // This is the function that generates the stream
//        Stream.of("Manolo", "Pedro", "Baldomero", "Paula", "Ana")
//                // From now on 0 or more intermediate operations should be provided. This kind of operation will always
//                // return another stream in order to continue concatenating more intermediate operations
//                .filter(name -> name.toLowerCase().contains("p"))
//                // Until now all that was done was a presentation of intentions because all the intermediate operations
//                // of the pipeline are lazy and will not execute until a terminal function is call, like in this case, the
//                // method forEach will not return another stream concluding therefor the pipeline
//                .forEach(System.out::println);
//
//        var names = List.of("Manolo", "Pedro", "Baldomero", "Paula", "Ana");
//
//        var filteredNames = names.stream()
//                .filter(name -> name.toLowerCase().contains("p"))
//                // In this case there is a terminal function that returns a value, in this case a List, but it's NOT a stream
//                // so this operation is a valid terminal function and the pipeline would be complete
//                .toList();

//        var streamGenerated = Stream.generate(() -> {
//            var next = random.nextInt(10);
//
//            System.out.println(next + " has been generated");
//
//            return next;
//        })
//                //This intermediate operation will limit the data which the stream uses to work
//                .limit(5)
//                .toList();
//
//        System.out.println(streamGenerated);

//        // This way we tell through the predicate that we want to keep generating values if these are minor to 10000
//        var streamGenerated = Stream.iterate(1, x -> x < 10000, x -> x * 5)
//                //.limit(5)
//                .toList();
//
//        System.out.println(streamGenerated);

        // This is a version of the previous example that uses classes and methods that Java provides
        var generatedStream = IntStream.rangeClosed(1, 10)
                // boxed() will turn the given flow of data into a Stream of that data type
                .boxed()
                .map(integer -> integer * 2)
                .collect(Collectors.toList());

        System.out.println(generatedStream);

        var charName = "Sergio".chars()
                .boxed()
                .toList();
        System.out.println(charName);

        Stream.of(1, 2, 3)
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

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

/*
    private int randomInt() {
        return random.nextInt(10);
    }
*/
}
