package com.exemple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    void testNomContact() {
        Contact contact = new Contact("Paul", "699999999");
        assertEquals("Paul", contact.getNom());
    }

    @Test
    void testTelephoneContact() {
        Contact contact = new Contact("Paul", "699999999");
        assertEquals("699999999", contact.getTelephone());
    }
}