package hust.soict.hedspi.aims.media;

public abstract class Media implements Comparable<Media> {
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
    @Override
    public boolean equals(Object obj)
    {
        return ((Media) obj).getId() == this.id;
    }
    @Override
    public int compareTo(Media media) {
        if (media.getTitle() == null) {
            return 0;
        }
//        }
//        if(this.id > hust.soict.hedspi.aims.media.)
        return this.title.compareTo(media.getTitle());
    }

}
