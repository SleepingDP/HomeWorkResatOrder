public class MenuService {
    public static void initializeMenu(OrderSystem orderSystem) {
        orderSystem.addItemToMenu(new Meal("Пельмени", "тортик", 3.0), Cuisine.POLISH);
        orderSystem.addItemToMenu(new Meal("Голубцы", "кексик", 2.0), Cuisine.POLISH);

        orderSystem.addItemToMenu(new Meal("Такос", "сухарик", 4.0), Cuisine.MEXICAN);
        orderSystem.addItemToMenu(new Meal("Гуакамоле", "шоколадка", 6.0), Cuisine.MEXICAN);

        orderSystem.addItemToMenu(new Meal("Паста", "сливки", 8.0), Cuisine.ITALIAN);
        orderSystem.addItemToMenu(new Meal("Пицца", "яблоко", 10.0), Cuisine.ITALIAN);

        orderSystem.addItemToMenu(new Drink("Итальянский напиток", 5.0), Cuisine.ITALIAN);
        orderSystem.addItemToMenu(new Drink("Мексиканский напиток", 5.0), Cuisine.MEXICAN);
        orderSystem.addItemToMenu(new Drink("Польский напиток", 5.0), Cuisine.POLISH);

    }
}