package hust.soict.globalict.aims.media.order;

import hust.soict.globalict.aims.media.Media;

import java.util.ArrayList;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 5;
    private int id;
    private ArrayList<Media> itemOrdered = new ArrayList<Media>(4);
    //    int qtyOrdered = 0;
    int k = 0;

    public void addMedia(Media media) {
        //for (int i = 0; i < itemOrdered.size(); i++) {

        if (media.getTitle() != null) {
            // qtyOrdered++;
            itemOrdered.add(media);
            //  System.out.println("The disc " + disc.getTitle() + " has been added");
        }
        //}
//        if (qtyOrdered > 1) {
//            removeDigitalVideoDisc(itemOrdered);
//        }

//        if(k == 1){
//            System.out.printf("the dvd "+media.getTitle()+" could not be added.");
//            System.out.println("The order is almost full");

        //}
//        if (qtyOrdered  == itemOrdered.length) {
//            k =1;
//        }
    }
//    public void addDigitalVideoDisc(DigitalVideoDisc []disc)
//    {
//        for (int i = 0; i < disc.length; i++) {
//            addDigitalVideoDisc(disc[i]);
//        }
//    }

    //    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
//    {
//        addDigitalVideoDisc(dvd1);
//        addDigitalVideoDisc(dvd2);
//    }
    public void removeMedia(Media media) {
        if (findMedia(media.getTitle()) != -1) {
            for (int i = 0; i < itemOrdered.size(); i++) {
                if (itemOrdered.get(i).equals(media)) {
                    itemOrdered.remove(i);
                }
            }
//            media.setId(0);
//            media.setCost(0);
//            media.setTitle(null);
//            media.setCategory(null);

        }
//        int n = item.length;
//        for (int i = 1; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                if (item[i] == null || item[j] == null) {
//                    break;
//                }
//                if (item[i].getTitle().equals(item[j].getTitle())) {
//                    System.out.println("The disc " + item[i].getTitle() + " has been deleted because of duplication");
//                    item[i] = null;
//                    assert (item[i] == null);
//                   // qtyOrdered--;
//
//                }
//            }
//        }

    }

    public void removeMedia(int id) {
        for (int i = 0; i < itemOrdered.size(); i++) {
            if (itemOrdered.get(i).getId() == id) {
                itemOrdered.remove(i);
//                itemOrdered.get(i).setId(0);
//                itemOrdered.get(i).setCost(0);
//                itemOrdered.get(i).setTitle(null);
//                itemOrdered.get(i).setCategory(null);
            }
        }
    }

    public int findMedia(String title) {
        for (int i = 0; i < itemOrdered.size(); i++) {
            if (title.equals(itemOrdered.get(i).getTitle())) {
                return i;
            }
        }
        return -1;
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < itemOrdered.size(); i++) {
            if (itemOrdered.get(i).getTitle() != null) {

                total = total + itemOrdered.get(i).getCost();
            }
        }
        return total;
    }

    public void getItemOrder() {
        for (int i = 0; i < itemOrdered.size(); i++) {
            System.out.println("\nID: " + itemOrdered.get(i).getId());
            System.out.println("Title: " + itemOrdered.get(i).getId());
            System.out.println("Category: " + itemOrdered.get(i).getCategory());
            System.out.println("Cost: " + itemOrdered.get(i).getCost());
        }
    }
//    public DigitalVideoDisc getALuckyItem()
//    {
//        if(qtyOrdered == 0)
//        {
//            System.out.println("Order is empty!");
//            return null;
//        }
//        int value = (int)(Math.random()*qtyOrdered);
//        return itemOrdered[value];
//    }
}