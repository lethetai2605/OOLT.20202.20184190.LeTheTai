package hust.soict.hedspi.aims.media;

import java.util.*;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    private String content;
    private List<String> contentTokens = new ArrayList<String>();
    private Map<String, Integer> wordFrequency = new TreeMap<String, Integer>();

    public Book() {

    }
    public Book(String title, String category, float cost, int id)
    {
        super(title, category, cost, id);
    }
    public void addAuthor(String authorName) {
        if (authorName != null) {
            this.authors.add(authorName);

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

    public void processContent() {
        if (this.content == null) {
            return;
        }
        String words[] = this.content.split("[ .?,:-]+");
        for (int i = 0; i < words.length; i++) {
            int j = 1;
            if (this.wordFrequency.containsKey(words[i])) {
                j = this.wordFrequency.get(words[i]) + 1;
            }
            this.wordFrequency.put(words[i], j);
            this.contentTokens.add(words[i]);
        }
        Collections.sort((List<String>) this.contentTokens);
    }
    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void setContent(String content) {
        this.content = content;
        this.processContent();
    }
    @Override
    public String toString() {
        return  "Authors: " + authors +
                "\nNum of Token=" + content.length() +
                "\nList Token=" + contentTokens +
                "\nWord Frequency=" + wordFrequency;
    }
}
