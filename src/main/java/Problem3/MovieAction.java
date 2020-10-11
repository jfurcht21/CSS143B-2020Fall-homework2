package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super(rating, title);
    }

    public MovieAction(MovieAction anotherMovie) {
        // homework
        // tip: use the 'super' keyword
        super(anotherMovie);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        int lateFee = 0;
        if(numOfDaysPastDue <= 0)
        {
            return 0;
        }
        if(numOfDaysPastDue > 0 && numOfDaysPastDue < 5)
        {
            lateFee = numOfDaysPastDue * lateFeePerDayInDollar;
            return lateFee;
        }
        if(numOfDaysPastDue >= 5)
        {
            lateFee = 2 * (numOfDaysPastDue * lateFeePerDayInDollar);
            return lateFee;
        }
        return lateFee;
    }
}
