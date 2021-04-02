package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book() {

    }

    public void addAuthor(String authorName) {
        if (authorName != null) {
            setAuthors(authors);
        }
    }

    public void removeAuthor(String authorName) {
        if (findAuthor(authorName) != -1) {
            authors.remove(findAuthor(authorName));
        }
    }

    public int findAuthor(String authorName) {
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).equals(authorName)) {
                return i;
            }
        }
        return -1;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
