package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitalVideoDisc() {

    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title) {
        this.title = title;
        this.category = category;
    }

    public DigitalVideoDisc(String director, String category, String title) {
        this.director = director;
        this.category = category;
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.director = director;
        this.category = category;
        this.length = length;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean search(String title) {
        String[] arrTok = title.trim().split(" ");

        for (int i = 0; i < arrTok.length; i++) {
            if (this.title.matches("(.*)" + arrTok[i] + "(.*)")) {
                return true;
            }
        }
        return false;
    }
}