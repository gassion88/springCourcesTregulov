package org.gassion.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{
    public void getBook() {
        System.out.println("Берём книгу из UniLibrary ");
    }

    public void returnBook() {
        System.out.println("Возвращаем книгу в UniLibrary ");
    }

    public void getMagazine() {
        System.out.println("Берём журнал из UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("Возвращаем журнал в UniLibrary");
    }

    public void addBook() {
        System.out.println("Добавляем книгу в UniLibrary ");
    }

    public void addMagazine() {
        System.out.println("Добавляем журнал в UniLibrary");
    }
}
