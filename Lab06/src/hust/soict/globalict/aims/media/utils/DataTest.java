package hust.soict.globalict.aims.media.utils;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.order.Order;

import java.util.Scanner;

public class DataTest extends Aims {
    public static void main(String[] args) {
        Order anOrder = null;
        Media dvd1 = new Media("The Lion King", "a", 1, 1);
        Media dvd2 = new Media("Deadpool", "b", 2, 2);
        Media dvd3 = new Media("Ironman", "c", 3, 3);

        int idx;
        do {
            showMenu();
            Scanner scanner = new Scanner(System.in);
            idx = scanner.nextInt();
            switch (idx) {
                case 1:
                    anOrder = new Order();
                    break;
                case 2:
                    anOrder.addMedia(dvd1); // total = 1
                    anOrder.addMedia(dvd2); // total = 1 + 2 = 3
                    anOrder.addMedia(dvd3); // total = 3 + 3 = 6
                    System.out.print("Total Cost is: ");
                    System.out.println(anOrder.totalCost());
                    break;
                case 3:
                    Scanner scandelbyid = new Scanner(System.in);
                    System.out.printf("Insert id: ");
                    int id = scanner.nextInt();

                    anOrder.removeMedia(id);
                    System.out.print("Total Cost is: ");
                    System.out.println(anOrder.totalCost());
                    break;
                case 4:
                    anOrder.getItemOrder();
                    break;
            }
        }
        while (idx != 0);
    }
}