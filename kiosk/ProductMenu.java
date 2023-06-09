package aloneKiosk.kiosk;

import java.util.Scanner;

public class ProductMenu extends Menu{
    private double price;
    private String name;
    private String explanation;
//    public double price;
//    public String name;
//    public String explanation;

    private int choice;
    private String detailMenu;

    private Scanner sc;
    ProductMenu () {}

    public ProductMenu(String name, double price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

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

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("[ BURGERS MENU ]");
        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        System.out.println("4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("-------------------------------------------------------------------------");

        choice = sc.nextInt();
        return choice;
    }

    public int showFrozenMenu() {
        sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("[ SHAKES & FROZEN CUSTARD MENU ]");
        System.out.println("1. Shakes               | W 5.9 | 바닐라, 초콜렛, 솔티드 카라멜, 블랙 & 화이트, 스트로베리, 피넛버터 커피");
        System.out.println("2. Classic Shakes       | W 6.2 | 쫀득하고 진한 커스터드가 들어간 클래식 쉐이크");
        System.out.println("3. Floats               | W 6.2 | 부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료");
        System.out.println("4. Frozen Custard       | W 5.2 | 매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림");
        System.out.println("-------------------------------------------------------------------------");

        choice = sc.nextInt();
        return choice;
    }

    public int showDrinksMenu() {
        sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("[ DRINKS MENU ]");
        System.out.println("1. Shack-made Lemonade      | W 3.9 | 매장에서 직접 만드는 상큼한 레몬에이드");
        System.out.println("2. Fresh Brewed Iced Tea    | W 3.4 | 직접 유기능 홍차를 우려낸 아이스티");
        System.out.println("3. Fifty/Fifty              | W 3.5 | 레몬에이드와 아이스티의 만남");
        System.out.println("4. Fountain Soda            | W 2.7 | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프");
        System.out.println("5. Abita Root Bear          | W 4.4 | 청량감 있는 독특한 미국식 무알콜 탄산음료");
        System.out.println("6. Bottled Water            | W 1.0 | 지리산 암반대수층으로 만든 프리미엄 성수");
        System.out.println("-------------------------------------------------------------------------");

        choice = sc.nextInt();
        return choice;
    }

    public int showBeerMenu() {
        sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("[ BEER MENU ]");
        System.out.println("1. ShackMeister Ale     | W 7.2 | 쉐이크쉑을 위해 핸드앤몰트에서 특별히 양조한 에일 맥주");
        System.out.println("2. Slow IPA             | W 7.2 | 슬로우 IPA");
        System.out.println("3. Gorillager           | W 7.2 | 고릴라거");
        System.out.println("-------------------------------------------------------------------------");

        choice = sc.nextInt();
        return choice;
    }


}



