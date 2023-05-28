package org.gassion.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{
    public void getBook() {
        System.out.println("Берём книгу из UniLibrary ");
        System.out.println("------------------------------------------");
    }

    public void returnBook() {
        System.out.println("Возвращаем книгу в UniLibrary ");
        System.out.println("------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("Берём журнал из UniLibrary");
        System.out.println("------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Возвращаем журнал в UniLibrary");
        System.out.println("------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Добавляем книгу в UniLibrary ");
        System.out.println("------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Добавляем журнал в UniLibrary");
        System.out.println("------------------------------------------");
    }
}
