package org.gassion.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{
    public void getBook() {
        System.out.println("Берём книгу из UniLibrary ");
    }

    public void getMagazine() {
        System.out.println("Берём журнал из UniLibrary");
    }
}
