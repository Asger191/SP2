package SP2;

public abstract class Title {

    String title;
    String literatureType;
    int copies;
    public double rate;


    public Title (String title, String literatureType, int copies){
    this.title = title;
    this.copies = copies;
    this.rate = 0.0675574;
    this.literatureType = literatureType;
    }

   public double calculateRoyalty(){
    return (double) Math.round(calculatePoints() * rate * 100) / 100;
    }

    abstract double calculatePoints();

    abstract double calculateLiteraturePoints();





}
