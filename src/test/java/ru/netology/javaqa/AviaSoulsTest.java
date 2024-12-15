package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

class AviaSoulsTest {

    @Test
    public void testSortFewTickets() {

        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("MSK","EKB",300,12,14);
        Ticket ticket2 = new Ticket("MSK","EKB",250,11,13);
        Ticket ticket3 = new Ticket("PRS","MSK",500,8,14);
        Ticket ticket4 = new Ticket("EKB","VSK",420,17,22);
        Ticket ticket5 = new Ticket("MSK","EKB",330,19,20);
        Ticket ticket6 = new Ticket("MSK","EKB",425,2,4);
        Ticket ticket7 = new Ticket("PRS","MSK",600,14,18);
        Ticket ticket8 = new Ticket("MSK","EKB",390,10,12);


        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.search("MSK","EKB");
        Ticket[] expected = {ticket2,ticket1,ticket5,ticket8,ticket6};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortZeroTickets() {

        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("MSK","EKB",300,12,14);
        Ticket ticket2 = new Ticket("MSK","EKB",250,11,13);
        Ticket ticket3 = new Ticket("PRS","MSK",500,8,14);
        Ticket ticket4 = new Ticket("EKB","VSK",420,17,22);
        Ticket ticket5 = new Ticket("MSK","EKB",330,19,20);
        Ticket ticket6 = new Ticket("MSK","EKB",425,2,4);
        Ticket ticket7 = new Ticket("PRS","MSK",600,14,18);
        Ticket ticket8 = new Ticket("MSK","EKB",390,10,12);


        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.search("MSK","PRS");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortOneTickets() {

        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("MSK","EKB",300,12,14);
        Ticket ticket2 = new Ticket("MSK","EKB",250,11,13);
        Ticket ticket3 = new Ticket("PRS","MSK",500,8,14);
        Ticket ticket4 = new Ticket("EKB","VSK",420,17,22);
        Ticket ticket5 = new Ticket("MSK","EKB",330,19,20);
        Ticket ticket6 = new Ticket("MSK","EKB",425,2,4);
        Ticket ticket7 = new Ticket("PRS","MSK",600,14,18);
        Ticket ticket8 = new Ticket("MSK","EKB",390,10,12);


        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.search("EKB","VSK");
        Ticket[] expected = {ticket4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortFewTicketsWithComparator() {

        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("MSK","EKB",300,12,14);
        Ticket ticket2 = new Ticket("MSK","EKB",250,11,13);
        Ticket ticket3 = new Ticket("PRS","MSK",500,8,14);
        Ticket ticket4 = new Ticket("EKB","VSK",420,17,22);
        Ticket ticket5 = new Ticket("MSK","EKB",330,19,20);
        Ticket ticket6 = new Ticket("MSK","EKB",425,2,4);
        Ticket ticket7 = new Ticket("PRS","MSK",600,14,18);
        Ticket ticket8 = new Ticket("MSK","EKB",390,10,12);


        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("MSK","EKB",comparator);
        Ticket[] expected = {ticket5,ticket1,ticket2,ticket6,ticket8};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortZeroTicketsWithComparator() {

        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("MSK","EKB",300,12,14);
        Ticket ticket2 = new Ticket("MSK","EKB",250,11,13);
        Ticket ticket3 = new Ticket("PRS","MSK",500,8,14);
        Ticket ticket4 = new Ticket("EKB","VSK",420,17,22);
        Ticket ticket5 = new Ticket("MSK","EKB",330,19,20);
        Ticket ticket6 = new Ticket("MSK","EKB",425,2,4);
        Ticket ticket7 = new Ticket("PRS","MSK",600,14,18);
        Ticket ticket8 = new Ticket("MSK","EKB",390,10,12);


        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("MSK","PRS",comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortOneTicketsWithComparator() {

        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("MSK","EKB",300,12,14);
        Ticket ticket2 = new Ticket("MSK","EKB",250,11,13);
        Ticket ticket3 = new Ticket("PRS","MSK",500,8,14);
        Ticket ticket4 = new Ticket("EKB","VSK",420,17,22);
        Ticket ticket5 = new Ticket("MSK","EKB",330,19,20);
        Ticket ticket6 = new Ticket("MSK","EKB",425,2,4);
        Ticket ticket7 = new Ticket("PRS","MSK",600,14,18);
        Ticket ticket8 = new Ticket("MSK","EKB",390,10,12);


        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("EKB","VSK",comparator);
        Ticket[] expected = {ticket4};

        Assertions.assertArrayEquals(expected, actual);
    }
}