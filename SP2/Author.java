package SP2;

import java.util.ArrayList;

public class Author{
    private String name;
    private ArrayList<Title> titles;

    public Author(String name) {
    this.name = name;
    this.titles = new ArrayList<>();
    }

   public void addTitle(Title title){
        titles.add(title);

    }

  public ArrayList<Title> getTitles() {
return titles;
  }

    public String toString(){
        return name;
    }
}
