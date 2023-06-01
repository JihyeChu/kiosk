package aloneKiosk.kiosk;

import java.util.Scanner;

public class Menu {
    private String name;
    private String explanation;
    private String choice;
    private Scanner sc;
    public Menu(String name, String explanation){
        this.name = name;
        this.explanation = explanation;
    }

    public Menu() {}

    public String getName(){
        return name;
    }

    public String getExplanation(){
        return explanation;
    }


    public int showMainMenu() {
        sc = new Scanner(System.in);
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();

        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거");
        System.out.println("2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림");
        System.out.println("3. Drinks          | 매장에서 직접 만드는 음료");
        System.out.println();

        System.out.println("[ ORDER MENU ]");
        System.out.println("4. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("5. Cancel      | 진행중인 주문을 취소합니다.");

        choice = sc.nextLine();
        return Integer.parseInt(choice);
    }


}
