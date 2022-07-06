public class Film{
    int rank;
    String name;
    int year;
    double IMDbRating;
    public Film(int rank, String name, int year, double iMDbRating) {
        this.rank = rank;
        this.name = name;
        this.year = year;
        IMDbRating = iMDbRating;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getIMDbRating() {
        return IMDbRating;
    }
    public void setIMDbRating(double iMDbRating) {
        IMDbRating = iMDbRating;
    }
    @Override
    public String toString() {
        return "Film [IMDbRating=" + IMDbRating + ", name=" + name + ", rank=" + rank + ", year=" + year + "]";
    }

}