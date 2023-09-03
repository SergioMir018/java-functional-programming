package com.functional.collect;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@NonNull
public class Book {
    private final String isbn;
    private final String title;
    private final int yearPublication;
    private final Genre genre;
}
