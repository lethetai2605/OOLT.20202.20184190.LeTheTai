package OrderDVD;

public class CreateConstructor {
    public static void main(String[] args) {
        DigitalVideoDisc DVD1 = new DigitalVideoDisc();
        DigitalVideoDisc DVD2 = new DigitalVideoDisc("A", "B");
        DigitalVideoDisc DVD3 = new DigitalVideoDisc("A", "B", "C");
        DigitalVideoDisc DVD4 = new DigitalVideoDisc("A", "B", "C", 0, 0);
    }
}
