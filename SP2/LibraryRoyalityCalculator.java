package SP2;

public class LibraryRoyalityCalculator{
    public static void main(String[] args) {

        Author a1 = new Author("Jan");
        Title Book1 = new AudioBook("Darkness", "SKØN", 5, 120);
        Title Book2 = new PrintedBook("Light", "LYRIK", 10, 7);
        Title Book3 = new PrintedBook("Love", "BI", 120, 25);

        Author a2 = new Author("Kong");
        Title Book4 = new AudioBook("Kong", "LYRIK", 10000, 4);
        Title Book5 = new PrintedBook("King", "FAG", 30, 3);
        Title Book6 = new PrintedBook("Basco", "TE", 120, 25);


        a1.addTitle(Book1);
        a1.addTitle(Book2);
        a1.addTitle(Book3);

        a2.addTitle(Book4);
        a2.addTitle(Book5);
        a2.addTitle(Book6);

        double totalPayOut = 0;
        for(Title title : a1.getTitles()){
            totalPayOut += title.calculateRoyalty();
        }

        System.out.println("Author " + a1 + ": " + totalPayOut + "kr");

        totalPayOut = 0;
        for(Title title : a2.getTitles()){
            totalPayOut += title.calculateRoyalty();
        }

        System.out.println("Author " + a2 + ": " + totalPayOut + "kr");


    }


}
