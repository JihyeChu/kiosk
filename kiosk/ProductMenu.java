package aloneKiosk.kiosk;

import java.util.Scanner;

public class ProductMenu extends Menu{
    private double price;
    private String name;
    private String explanation;

    private String choice;
    private String detailMenu;

    private Scanner sc;
    ProductMenu () {}

    public ProductMenu(String name, double price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }


//    public ProductMenu frozenMenu() {
//        detailMenu = "Frozen Custard";
//        List<ProductMenu> frozenMenu = new ArrayList<>();
//        frozenMenu.add(new ProductMenu("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
//
//        return this;
//    }
//
//    public ProductMenu drinksMenu() {
//        detailMenu = "Drinks";
//        return this;
//    }
//
//    public ProductMenu beerMenu() {
//        detailMenu = "Beer";
//        return this;
//    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getExplanation(){
        return explanation;
    }
    public int showBurgersMenu() {
        sc = new Scanner(System.in);

        System.out.println("[ Burgers MENU ]");
        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        System.out.println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println();

        System.out.println("[ ORDER MENU ]");
        System.out.println("6. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("7. Cancel      | 진행중인 주문을 취소합니다.");

        choice = sc.nextLine();
        return Integer.parseInt(choice);
    }

    public int showFrozenMenu() {
        sc = new Scanner(System.in);

        System.out.println("[ Frozen Custard MENU ]");
        System.out.println("1. Shakes               | W 5.9 | 바닐라, 초콜렛, 솔티드 카라멜, 블랙 & 화이트, 스트로베리, 피넛버터 커피");
        System.out.println("2. Shake of the Week    | W 6.5 | 특별한 커스터드 플레이버");
        System.out.println("3. Red Bean Shake       | W 6.5 | 신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크");
        System.out.println("4. Floats               | W 5.9 | 루트 비어, 퍼플 카우, 크림시클");
        System.out.println();

        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다.");

        choice = sc.nextLine();
        return Integer.parseInt(choice);
    }

    public int showDrinksMenu() {
        sc = new Scanner(System.in);

        System.out.println("[ Drinks MENU ]");
        System.out.println("1. Shack-made Lemonade      | W 3.9 | 매장에서 직접 만드는 상큼한 레몬에이드");
        System.out.println("2. Fresh Brewed Iced Tea    | W 3.4 | 직접 유기능 홍차를 우려낸 아이스티");
        System.out.println("3. Fifty/Fifty              | W 3.5 | 레몬에이드와 아이스티의 만남");
        System.out.println("4. Fountain Soda            | W 2.7 | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프");
        System.out.println("5. Abita Root Bear          | W 4.4 | 청량감 있는 독특한 미국식 무알콜 탄산음료");
        System.out.println("6. Bottled Water            | W 1.0 | 지리산 암반대수층으로 만든 프리미엄 성수");
        System.out.println();

        System.out.println("[ ORDER MENU ]");
        System.out.println("7. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("8. Cancel      | 진행중인 주문을 취소합니다.");

        choice = sc.nextLine();
        return Integer.parseInt(choice);
    }

//    public void showBeerMenu() {
//        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
//        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
//        System.out.println();
//
//        System.out.println("[ Beer MENU ]");
//        System.out.println("1. ShackMeister Ale     | W 9.8 | 쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주");
//        System.out.println("2. Magpie Brewing Co.   | W 6.8 | ");
//
//    }


}



