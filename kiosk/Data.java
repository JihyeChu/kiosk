package aloneKiosk.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private String detailMenu;
    private int choice;
    Order order = new Order();

    private List<Menu> mainMenu(){
        List<Menu> mainMenu = new ArrayList<Menu>();

        mainMenu.add(new Menu("Burgers ", "앵거스 비프 통살을 다져만든 버거"));
        mainMenu.add(new Menu("Frozen Custard", "매장에서 신선하게 만드는 아이스크림"));
        mainMenu.add(new Menu("Drinks", "매장에서 직접 만드는 음료"));
        mainMenu.add(new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주"));

        return mainMenu;
    }

    public void burgersMenu(String detailMenu, int choice){
        this.detailMenu = detailMenu;
        this.choice = choice;
        List<ProductMenu> burgersMenu = new ArrayList<>();
        burgersMenu.add(new ProductMenu("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgersMenu.add(new ProductMenu("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgersMenu.add(new ProductMenu("Shroom Burger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"));
        burgersMenu.add(new ProductMenu("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgersMenu.add(new ProductMenu("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        order.showList(burgersMenu.get(choice-1).getName(), burgersMenu.get(choice-1).getPrice(), burgersMenu.get(choice-1).getExplanation());
    }


}
