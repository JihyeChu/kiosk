package aloneKiosk.kiosk;

public class Kiosk {
    Menu menu = new Menu();
    ProductMenu productMenu = new ProductMenu();
    Data data = new Data();
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
            }

        }
    }


}
