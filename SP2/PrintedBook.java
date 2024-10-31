package SP2;

public class PrintedBook extends Title {
    int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
    super(title, literatureType, copies);
    this.pages = pages;
    }

     double calculatePoints(){
        return pages * calculateLiteraturePoints() * copies;
     }



    double calculateLiteraturePoints() {
        if("BI".equals(literatureType)){
            return 3;
        }
        else if("TE".equals(literatureType)) {
            return 3;
        }
        else if("LYRIK".equals(literatureType)) {
            return 6;
        }
        else if("SKØN".equals(literatureType)) {
            return 1.7;
        }
        else if("FAG".equals(literatureType)) {
            return 1;
        }
        else {
            return 0;
        }
    }
}




