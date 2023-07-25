import java.util.ArrayList;
import java.util.List;

public enum Cuisine {
    POLISH,
    MEXICAN,
    ITALIAN;

    private List<OrderItem> menuItems = new ArrayList<>();

    public void addMenuItem(OrderItem item) {
        menuItems.add(item);
    }


    public void addMenuItem(Drink drink) {
        menuItems.add(drink);
    }

    public List<OrderItem> getMenuItems() {
        return menuItems;
    }
}
