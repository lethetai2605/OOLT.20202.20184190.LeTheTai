package OrderDVD;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 4;

    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < itemOrdered.length; i++) {

            if (itemOrdered[i] == null) {
                qtyOrdered++;
                itemOrdered[i] = disc;
                System.out.println("The disc " + disc.getTitle() + " has been added");
                break;
            }
        }
        if (qtyOrdered > 1) {
            removeDigitalVideoDisc(itemOrdered);
        }
        if (qtyOrdered == itemOrdered.length) {
            System.out.println("The order is almost full");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc item[]) {
        int n = item.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (item[i] == null || item[j] == null) {
                    break;
                }
                if (item[i].getTitle().equals(item[j].getTitle())) {
                    System.out.println("The disc " + item[i].getTitle() + " has been deleted because of duplication");
                    item[i] = null;
                    assert (item[i] == null);
                    qtyOrdered--;

                }
            }
        }

    }

    public DigitalVideoDisc findDVDByTitle(String title) {
        for (int i = 0; i < itemOrdered.length; i++) {
            if (title.equals(itemOrdered[i].getTitle())) {
                return itemOrdered[i];
            }
        }
        return null;
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < itemOrdered.length; i++) {
            if (itemOrdered[i] == null) {
                break;
            } else {
                total = total + itemOrdered[i].getCost();
            }
        }
        return total;
    }
}
