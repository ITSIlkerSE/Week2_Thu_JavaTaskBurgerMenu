import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderSystem {

    private Map<Integer, Menu> menus = new HashMap<>();


    public void addMenu(Menu menu) {
        menus.put(menu.getMenuNumber(), menu);

    }

    public void placeOrder(Integer number) {
        Menu menu = menus.get(number);
        System.out.println("Sie haben folgendes bestellt: " + menu);
    }


}


/*
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter password");
            String password = myScanner.nextLine();

            enterpassword = !isValid(password);
 */