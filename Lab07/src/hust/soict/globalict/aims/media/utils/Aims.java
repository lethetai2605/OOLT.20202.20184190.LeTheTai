package hust.soict.globalict.aims.media.utils;

public class Aims {
    public static void showMenu() {
        System.out.println("\nOrder Management Application: ");
        System.out.println("----------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("----------------------");
        System.out.println("Please choose a number: 0-1-2-3-4\n");
    }
    public static void choiceType(){
        System.out.println("\nChoose a type:");
        System.out.println("------------------");
        System.out.println("1. Book");
        System.out.println("2. CompactDisc");
        System.out.println("3. DigitalVideoDisc");
        System.out.println("------------------");
        System.out.println("Please choose 1 - 3: ");
    }
}
