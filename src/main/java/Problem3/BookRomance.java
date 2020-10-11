package Problem3;

public class BookRomance extends Book {

    private int lateFeePerDayInDollar = 4;

    public BookRomance(String title, String author) {
        // homework
        // tip: use the 'super' keyword
        super(title, author);
    }

    public BookRomance(BookRomance anotherBook) {
        // homework
        // tip: use the 'super' keyword
        super(anotherBook);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        if(numOfDaysPastDue <= 0)
        {
            return 0;
        }
        int lateFee;
        lateFee = numOfDaysPastDue * lateFeePerDayInDollar;
        return lateFee;
    }
}
