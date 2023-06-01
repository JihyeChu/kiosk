package aloneKiosk.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Buy {
    ProductMenu productMenu = new ProductMenu();
    private List<ProductMenu> basket;
    private int choice;
    private Scanner sc;

    public Buy(){}



    public void showList(String name, double price, String explanation){
        sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("\n-----------------------------------------------------\n");
        sb.append(name + "\t");
        sb.append(price + "\t");
        sb.append(explanation + "\t");
        sb.append("\n-----------------------------------------------------\n");
        System.out.println(sb);
        System.out.println();
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. YES \t\t 2. NO" );
        choice = sc.nextInt();
        buyYesOrNo(choice, name, price, explanation);
    }

    public void buyYesOrNo(int choice, String name, double price, String explanation) {
        if(choice == 1){
            basket = new ArrayList<>();
            basket.add(new ProductMenu(name, price, explanation));
            System.out.println(name + "가 장바구니에 추가되었습니다.\n");
            System.out.println("-----------------------------------------------------");
        }else {
            System.out.println("주문이 취소되었습니다.\n처음으로 돌아갑니다.");
            System.out.println("-----------------------------------------------------");
            System.out.println();
        }
    }
}
