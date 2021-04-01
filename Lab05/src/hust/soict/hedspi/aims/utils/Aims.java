package hust.soict.hedspi.aims.utils;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
    public static void main(String[] args) {
        Order anOrder = new Order();
        DigitalVideoDisc dvd[] = new DigitalVideoDisc[5];
        System.out.println("Size of Order: " + Order.MAX_NUMBERS_ORDERED);

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

        dvd[3] = new DigitalVideoDisc("Aladdin");
        dvd[3].setCategory("Animation");
        dvd[3].setCost(18.99f);
        dvd[3].setDirector("John Musker");
        dvd[3].setLength(90);


        dvd[4] = new DigitalVideoDisc("Iron man");
        dvd[4].setCategory("Animation");
        dvd[4].setCost(10f);

        anOrder.addDigitalVideoDisc(dvd);

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Aquaman");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Matrix");
        anOrder.addDigitalVideoDisc(dvd1,dvd2);

        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());

    }
}