public class Ford extends Car{
    private int year;

    public Ford(int speed, double regularPrice, String color, int year) {
        super(speed, regularPrice, color);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString()+ "Ford{" +
                "year=" + year +
                '}';
    }
}
