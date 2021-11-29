package com.learn.bookApi;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.learn.bookApi.model.BookModel;
import com.learn.bookApi.service.BookService;

@SpringBootTest
class BookHappyPatchTest {

	@Autowired
	private BookService bookService;
	
	@Test
	void test() {
		BookModel bookModelTest = new BookModel();
		bookModelTest.setNumberOfPages(400);
		bookModelTest.setGenre("TESTE");
		bookModelTest.setTitle("TESTE");

		BookModel book = bookService.createBook(bookModelTest);
		assertThat(book).isNotNull();
//		assertThat(book.getId()).isNotNull();
	}

}
