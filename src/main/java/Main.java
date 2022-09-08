import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        Menu meal1 = new Menu(1, 7.80f, "Hamburger ", "Pommes ", "Softdrink");
        Menu meal2 = new Menu(2, 8.20f, "Cheeseburger ", "Pommes ", "Softdrink");
        Menu meal3 = new Menu(3, 9.90f, "Double-Cheeseburger ", "Pommes ", "Softdrink");
        Menu meal4 = new Menu(4, 17.80f, "IlkerDosSantos Crunchy Chicken ", "Coleslaw + Pommes ", "Special drink");

        OrderSystem ilkerDosSantosFoodTruck = new OrderSystem();

        ilkerDosSantosFoodTruck.addMenu(meal1);
        ilkerDosSantosFoodTruck.addMenu(meal2);
        ilkerDosSantosFoodTruck.addMenu(meal3);
        ilkerDosSantosFoodTruck.addMenu(meal4);

        ilkerDosSantosFoodTruck.placeOrder(1);



    }
}