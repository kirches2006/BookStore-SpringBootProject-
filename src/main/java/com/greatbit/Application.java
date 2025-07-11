package com.greatbit;

import com.greatbit.models.Book;
import com.greatbit.models.BooksStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        BooksStorage.getBooks().add(
                new Book(UUID.randomUUID().toString(), "Три товарища", "Эрих Мария Ремарк", 560)
        );

        BooksStorage.getBooks().add(
                new Book(UUID.randomUUID().toString(), "Богатый Папа, Бедный Папа", "Роберт Киосаки", 300)
        );
        SpringApplication.run(Application.class, args);
    }
}