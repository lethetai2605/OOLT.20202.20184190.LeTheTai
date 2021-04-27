package hust.soict.hedspi.test.media;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

import java.util.*;

public class TestMediaCompareTo {
    public static void main (String args[]) {
        Collection collection = new ArrayList();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                "The Lion King", "Romantic ",
                100, 1,220,"Tai");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                "Star Wars", "Animation",
                87, 2,200,"Tai2");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
                "Aladdin", "Animation",
                90, 3,180,"Tai3");

        collection.add(dvd1);
        collection.add(dvd2);
        collection.add(dvd3);

        Iterator iterator = collection.iterator();
        System.out.println("--------------------------------------");
        System.out.println("The DVDs currently in the order are: ");

        while (iterator.hasNext()) {
            System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
        }

        Collections.sort((List) collection);
        iterator = collection.iterator();
        System.out.println("--------------------------------------");
        System.out.println("The DVDs in sorted order are: ");

        while (iterator.hasNext()) {
            System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
        }
        System.out.println("--------------------------------------");
    }

}
