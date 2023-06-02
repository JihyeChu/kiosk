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

    public void frozenMenu(String detailMenu, int choice) {
        this.detailMenu = detailMenu;
        this.choice = choice;
        List<ProductMenu> frozenMenu = new ArrayList<>();
        frozenMenu.add(new ProductMenu("Shakes", 5.9, "바닐라, 초콜렛, 솔티드 카라멜, 블랙 & 화이트, 스트로베리, 피넛버터 커피"));
        frozenMenu.add(new ProductMenu("Classic Shakes", 6.2, "쫀득하고 진한 커스터드가 들어간 클래식 쉐이크"));
        frozenMenu.add(new ProductMenu("Floats", 6.2, "부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료"));
        frozenMenu.add(new ProductMenu("Frozen Custard", 5.2, "매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림"));
        order.showList(frozenMenu.get(choice-1).getName(), frozenMenu.get(choice-1).getPrice(), frozenMenu.get(choice-1).getExplanation());
    }

    public void drinksMenu(String detailMenu, int choice) {
        this.detailMenu = detailMenu;
        this.choice = choice;
        List<ProductMenu> drinksMenu = new ArrayList<>();
        drinksMenu.add(new ProductMenu("Shack-made Lemonade", 3.9, "매장에서 직접 만드는 상큼한 레몬에이드"));
        drinksMenu.add(new ProductMenu("Fresh Brewed Iced Tea", 3.4, "직접 유기능 홍차를 우려낸 아이스티"));
        drinksMenu.add(new ProductMenu("Fifty/Fifty", 3.5, "레몬에이드와 아이스티의 만남"));
        drinksMenu.add(new ProductMenu("Fountain Soda", 2.7, "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프"));
        drinksMenu.add(new ProductMenu("Abita Root Bear", 4.4, "청량감 있는 독특한 미국식 무알콜 탄산음료"));
        drinksMenu.add(new ProductMenu("Bottled Water", 1.8, "지리산 암반대수층으로 만든 프리미엄 성수"));
        order.showList(drinksMenu.get(choice-1).getName(), drinksMenu.get(choice-1).getPrice(), drinksMenu.get(choice-1).getExplanation());
    }

    public void beerMenu(String detailMenu, int choice) {
        this.detailMenu = detailMenu;
        this.choice = choice;
        List<ProductMenu> beerMenu = new ArrayList<>();
        beerMenu.add(new ProductMenu("ShackMeister Ale", 7.2, "쉐이크쉑을 위해 핸드앤몰트에서 특별히 양조한 에일 맥주"));
        beerMenu.add(new ProductMenu("Slow IPA", 7.2, "슬로우 IPA"));
        beerMenu.add(new ProductMenu("Gorillager", 7.2, "고릴라거"));
        order.showList(beerMenu.get(choice-1).getName(), beerMenu.get(choice-1).getPrice(), beerMenu.get(choice-1).getExplanation());
    }

}
