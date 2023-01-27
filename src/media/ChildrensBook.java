package media;

public class ChildrensBook extends Book {

    private String recommendedAgeInfo;




    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }

    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    public ChildrensBook(String title, String author, int price, String recommendedAgeInfo) { //Construkor
        super(title, author, price);
        this.recommendedAgeInfo = recommendedAgeInfo;
    }
}
