import java.util.List;
import java.util.Scanner;

public class UI {
    private Scanner scanner;

    public void printWelcomeMessage() {
        System.out.println("Добро пожаловать в систему заказа еды в ресторане!");
    }
    public void printAvailableCuisines() {
        System.out.println("Доступные кухни: ");
    }
    public void printChooseCuisine(){
        System.out.println("Выберите кухню: ");
    }
    public void printAvailableItems() {
        System.out.println("Доступные обеды и напитки:");
        }


    public void printChooseLunch(){
        System.out.println("Выберите обед: ");
    }
    public void printLunchIsNotAvailable(){
        System.out.println("Выбранный обед недоступен.");
    }
    public void printChooseDrink(){
        System.out.println("Выберите напиток: ");
    }
    public void printDrinkIsNotAvailable(){
        System.out.println("Выбранный напиток недоступен.");
    }
    public void requestAddInIce(){
        System.out.print("Добавить лед? (да/нет): ");
    }
    public void requestAddInLemon(){
        System.out.print("Добавить лимон? (да/нет): ");
    }

}
