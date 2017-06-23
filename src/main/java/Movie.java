public class Movie {
    private int sumOfRate = 0;
    private int countOfRate = 0;

    public Integer averageRating() {
        return sumOfRate / countOfRate;
    }

    public void rate(int rate) {
        sumOfRate += rate;
        countOfRate++;
    }
}
