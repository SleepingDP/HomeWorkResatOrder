public class Meal implements OrderItem {
    private String mainCourse;
    private String dessert;
    private double price;

    public Meal(String mainCourse, String dessert, double price) {
        this.mainCourse = mainCourse;
        this.dessert = dessert;
        this.price = price;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public String getDessert() {
        return dessert;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return   mainCourse + " + " + dessert;
    }

    @Override
    public String toString() {
        return "\uD83C\uDF54 " + getName() + " - " + price + " eur.";
    }
}


