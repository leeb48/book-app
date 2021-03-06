package com.project.bookapp.payload.bookspayload;

import com.project.bookapp.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookAddedResponse {
    private String bookAddedToBookshelfMessage;
    private Book book;
}
