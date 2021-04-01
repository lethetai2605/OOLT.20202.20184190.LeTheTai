package hust.soict.hedspi.aims.utils;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class DiscTest {
    public static void testSearch(String title) {
        Order anOrder = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Aquaman");
        System.out.println("Key:" + title);
        if (dvd1.search(title)) {
            System.out.println("The Lion King found!");
        } else {
            System.out.println("The Lion King not found!");
        }

    }

    public static void testGetLucky() {
        Order anOrder = new Order();
        DigitalVideoDisc dvd[] = new DigitalVideoDisc[3];
        dvd[0] = new DigitalVideoDisc("The Lion King");
        dvd[0].setCategory("Animation");
        dvd[0].setCost(19.95f);
        dvd[0].setDirector("Roger Allers");
        dvd[0].setLength(87);

        dvd[1] = new DigitalVideoDisc("Star Wars");
        dvd[1].setCategory("Science Fiction");
        dvd[1].setCost(24.95f);
        dvd[1].setDirector("George Lucas");
        dvd[1].setLength(124);

        dvd[2] = new DigitalVideoDisc("Aladdin");
        dvd[2].setCategory("Animation");
        dvd[2].setCost(18.99f);
        dvd[2].setDirector("John Musker");
        dvd[2].setLength(90);

        anOrder.addDigitalVideoDisc(dvd);
        System.out.println("The Lucky item:" + anOrder.getALuckyItem().getTitle());
    }
    public static void testGetLuckyNull()
    {
        Order order = new Order();
        order.getALuckyItem();
    }

    public static void main(String[] args) {
        testSearch("The Lion");
        testSearch("Lion");
        testSearch("The King");
        testSearch("Aquaman");
        testSearch("Kin");
        System.out.println();

        testGetLuckyNull();
        testGetLucky();
        testGetLucky();
        testGetLucky();
        testGetLucky();
        testGetLucky();
    }
}
