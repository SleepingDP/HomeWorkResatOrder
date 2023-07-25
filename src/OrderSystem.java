import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderSystem {
    private Scanner scanner = new Scanner(System.in);
    private Map<String, OrderItem> menuItems = new HashMap<>();
    private Cuisine selectedCuisine;
    private UI ui = new UI();

    public void addItemToMenu(Meal meal, Cuisine cuisine) {
        menuItems.put(meal.getName(), meal);
        cuisine.addMenuItem(meal);
    }

    public void addItemToMenu(Drink drink, Cuisine cuisine) {
        menuItems.put(drink.getName(), drink);
        cuisine.addMenuItem(drink);
    }
    public void startOrdering() {
        ui.printWelcomeMessage();
        ui.printAvailableCuisines();
        for (Cuisine cuisine : Cuisine.values()) {
            System.out.print(cuisine + " ");
        }
        System.out.println();
        ui.printChooseCuisine();
        String cuisineInput = scanner.nextLine().toUpperCase();
        selectedCuisine = Cuisine.valueOf(cuisineInput);

        ui.printAvailableItems();
        for (OrderItem item : selectedCuisine.getMenuItems()) {
            System.out.println(item);
        }

       ui.printChooseLunch();
        String mealName = scanner.nextLine();
        OrderItem meal = menuItems.get(mealName);
        if (meal == null) {
            ui.printLunchIsNotAvailable();
            return;
        }

        ui.printChooseDrink();
        String drinkName = scanner.nextLine();
        OrderItem drink = menuItems.get(drinkName);
        if (drink == null) {
            ui.printDrinkIsNotAvailable();
            return;
        }

        ui.requestAddInIce();
        boolean hasIceCubes = scanner.nextLine().equalsIgnoreCase("да");

        ui.requestAddInLemon();
        boolean hasLemon = scanner.nextLine().equalsIgnoreCase("да");

        // объект заказа
        Order order = new Order(meal,  drink, hasIceCubes, hasLemon);
        System.out.println(order);
    }
}
