public class Main {
    public static void main(String[] args) {
        OrderSystem orderSystem = new OrderSystem();
        MenuService.initializeMenu(orderSystem);
        orderSystem.startOrdering();
    }
}

