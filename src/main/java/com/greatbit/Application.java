package com.greatbit;

import com.greatbit.models.Book;
import com.greatbit.models.BooksStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        BooksStorage.getBooks().add(
                new Book("Три товарища", "Эрих Мария Ремарк", 560)
        );

        BooksStorage.getBooks().add(
                new Book("Богатый Папа, Бедный Папа", "Роберт Киосаки", 300)
        );
        SpringApplication.run(Application.class, args);
    }
}