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
    public void start() {
        while(true){
            int choice = menu.showMainMenu();
                switch (choice) {
                    case 1:
                        choice = productMenu.showBurgersMenu();
                        data.burgersMenu("BURGERS", choice);
                        break;
                    case 2:
                        choice = productMenu.showFrozenMenu();
                        data.frozenMenu("SHAKES & FROZEN CUSTARD", choice);
                        break;
                    case 3:
                        choice = productMenu.showDrinksMenu();
                        data.drinksMenu("DRINKS", choice);
                        break;
                    case 4:
                        choice = productMenu.showBeerMenu();
                        data.beerMenu("BEER", choice);
                        break;
                    case 5:
                        order.showOrder();
                        break;
                    case 6:
                        order.orderCancel();
                        break;
                    default:
                        System.out.println("원하는 메뉴의 번호를 입력해주세요.\n");
                        break;
                }

        }
    }


}
