package SP2;

public class AudioBook extends Title {

    int durationInMinutes;


    AudioBook(String title, String literaturType, int copies, int durationInMinutes) {
        super(title, literaturType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    double calculatePoints() {
        return (durationInMinutes * 0.5) * calculateLiteraturePoints() * copies ;
    }

    double calculateLiteraturePoints() {

        if ("BI".equals(literatureType)) {
            return 1.5;
        } else if ("TE".equals(literatureType)) {
            return 1.5;
        } else if ("LYRIK".equals(literatureType)) {
            return 3;
        } else if ("SKØN".equals(literatureType)) {
            return 0.85;
        } else if ("FAG".equals(literatureType)) {
            return 0.5;
        } else return 0;
    }
}