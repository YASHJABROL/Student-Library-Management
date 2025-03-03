package com.demo.example.student_library_management_system.converters;

import com.demo.example.student_library_management_system.model.Book;
import com.demo.example.student_library_management_system.requestdto.BookRequestDto;

public class BookConverter {

    public static Book convertBookRequestDtoIntoBook(BookRequestDto bookRequestDto)
    {
        Book book = new Book();
        book.setTitle(bookRequestDto.getTitle());
        book.setRackNo(bookRequestDto.getRackNo());
        book.setPages(bookRequestDto.getPages());
        book.setPublisherName(book.getPublisherName());
        book.setPublisherDate(book.getPublisherDate());
        book.setAvailability(bookRequestDto.isAvailability());
        book.setCategory(bookRequestDto.getCategory());

        return book;
    }
}
