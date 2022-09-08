import java.util.Objects;

public class Menu {

    private int menuNumber;

    private float price;

    private String main_Dish;

    private String side_Dish;

    private String beverage;


    public Menu(int menuNumber, float price, String main_Dish, String side_Dish, String beverage) {
        this.menuNumber = menuNumber;
        this.price = price;
        this.main_Dish = main_Dish;
        this.side_Dish = side_Dish;
        this.beverage = beverage;
    }

    public int getMenuNumber() {
        return menuNumber;
    }

    public void setMenuNumber(int menuNumber) {
        this.menuNumber = menuNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getMain_Dish() {
        return main_Dish;
    }

    public void setMain_Dish(String main_Dish) {
        this.main_Dish = main_Dish;
    }

    public String getSide_Dish() {
        return side_Dish;
    }

    public void setSide_Dish(String side_Dish) {
        this.side_Dish = side_Dish;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu menu = (Menu) o;

        if (menuNumber != menu.menuNumber) return false;
        if (Float.compare(menu.price, price) != 0) return false;
        if (!Objects.equals(main_Dish, menu.main_Dish)) return false;
        if (!Objects.equals(side_Dish, menu.side_Dish)) return false;
        return Objects.equals(beverage, menu.beverage);
    }

    @Override
    public int hashCode() {
        int result = menuNumber;
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (main_Dish != null ? main_Dish.hashCode() : 0);
        result = 31 * result + (side_Dish != null ? side_Dish.hashCode() : 0);
        result = 31 * result + (beverage != null ? beverage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuNumber=" + menuNumber +
                ", price=" + price +
                ", main_Dish='" + main_Dish + '\'' +
                ", side_Dish='" + side_Dish + '\'' +
                ", beverage='" + beverage + '\'' +
                '}';
    }
}
