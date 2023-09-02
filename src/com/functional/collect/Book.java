package com.functional.collect;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Book {
    private final String isbn;
    private final String title;
    private final int yearPublication;
    private final Genre genre;
}
