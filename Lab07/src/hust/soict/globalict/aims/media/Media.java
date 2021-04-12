package hust.soict.globalict.aims.media;

public abstract class Media {
    private String title;
    private String category;
    private float cost;
    private int id;

    public Media() {

    }

    public Media(String title, String category, float cost, int id) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public String getCategory() {
        return category;
    }

//    public void setCategory(String category) {
//        this.category = category;
//    }

    public float getCost() {
        return cost;
    }

//    public void setCost(float cost) {
//        this.cost = cost;
//    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }
}
