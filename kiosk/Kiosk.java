package aloneKiosk.kiosk;

public class Kiosk {
    private Menu menu;
    private ProductMenu productMenu;
    private Data data;
    private Order order;
    public Kiosk(){
        menu = new Menu();
        productMenu = new ProductMenu();
        data = new Data();
        order = new Order();
    }
    public void start(){
        while(true){
            int choice = menu.showMainMenu();
            switch (choice){
                case 1:
                    choice = productMenu.showBurgersMenu();
                    data.burgersMenu("Burgers", choice);
                    break;
                case 2:
                    choice = productMenu.showFrozenMenu();
                    break;
                case 3:
                    productMenu.showDrinksMenu();
                    break;
                case 4:
                    order.showOrder();

            }

        }
    }


}
