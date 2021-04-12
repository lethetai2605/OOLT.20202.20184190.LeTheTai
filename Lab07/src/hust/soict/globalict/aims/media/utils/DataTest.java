package hust.soict.globalict.aims.media.utils;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.media.order.Order;

import java.util.Scanner;

public class DataTest extends Aims {
    public static void main(String[] args) {
        Order anOrder = null;
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "a", 1, 1);
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Deadpool", "b", 2, 2);
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Ironman", "c", 3, 3);

        int idx;
        int type;
        int id;
        do {
            showMenu();
            Scanner scanner = new Scanner(System.in);
            idx = scanner.nextInt();
            switch (idx) {
                case 1:
                    anOrder = new Order();
                    break;
                case 2:

//                    anOrder.addMedia(dvd1); // total = 1
//                    anOrder.addMedia(dvd2); // total = 1 + 2 = 3
//                    anOrder.addMedia(dvd3); // total = 3 + 3 = 6
                    do {
                        choiceType();
                        type = scanner.nextInt();
                    } while (type < 1 || type > 3 );

                    System.out.println("Title: ");
                    String title = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Category: ");
                    String category = scanner.nextLine();
                    System.out.println("Cost: ");
                    float cost = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.println("Id: ");
                    id = scanner.nextInt();
                    switch (type){
                        case 1:
                            Book book = new Book(title,category,cost,id);
                            anOrder.addMedia(book);
                            scanner.nextLine();
                            System.out.println("Author: ");
                            String author = scanner.nextLine();
                            book.addAuthor(author);
                            break;
                        case 2:
                            CompactDisc compactDisc = new CompactDisc(title,category,cost,id);
                            System.out.println("Number of Tracks: ");
                            int numoftrack;
                            numoftrack = scanner.nextInt();
                            for (int i = 0; i < numoftrack; i++) {
                                System.out.printf("Track %d :\n",i+1);
                                System.out.println("Title: ");
                                String subtitle = scanner.nextLine();
                                scanner.nextLine();
                                System.out.println("Length: ");
                                int length = scanner.nextInt();
                                compactDisc.addTrack(new Track(title,length));
                            }
                            anOrder.addMedia(compactDisc);
                            break;
                        case 3:
                            DigitalVideoDisc dvd = new DigitalVideoDisc(title,category,cost,id);
                            System.out.println("Play DVD?");
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            int select = scanner.nextInt();
                            if(select == 1){
                                dvd.play();
                            }
                            anOrder.addMedia(dvd);
                            break;
                    }
                    break;
                case 3:
                    Scanner scandelbyid = new Scanner(System.in);
                    System.out.printf("Insert id: ");
                     id = scanner.nextInt();
                    anOrder.removeMedia(id);
                    break;
                case 4:
                    anOrder.getItemOrder();
                    System.out.println("\nTotal Cost is: ");
                    System.out.println(anOrder.totalCost());
                    break;
            }
        }
        while (idx != 0);
    }
}