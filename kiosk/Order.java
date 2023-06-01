package aloneKiosk.kiosk;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order{
    private int choice;
    private Scanner sc;
    private StringBuffer sb;
    private List<ProductMenu> basket = new ArrayList<>();

    public Order(){}



    public void showList(String name, double price, String explanation){
        sc = new Scanner(System.in);
        sb = new StringBuffer();
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
            basket.add(new ProductMenu(name, price, explanation));
            System.out.println(name + "가 장바구니에 추가되었습니다.\n");
            System.out.println("-----------------------------------------------------");
            System.out.println(basket.size());
            for(int i=0; i<basket.size(); i++){
                System.out.println(basket.get(i).getName());
            }
        }else {
            System.out.println("주문이 취소되었습니다.\n처음으로 돌아갑니다.");
            System.out.println("-----------------------------------------------------");
            System.out.println();
        }
    }



    public void showOrder(){
        sb = new StringBuffer();
        System.out.println(basket.size());
        if(basket.size() != 0){
            sb.append("\n-----------------------------------------------------\n");
            sb.append("아래와 같이 주문 하시겠습니까? \n");
            sb.append("[ Orders ] \n");
            for (int i=0; i<basket.size(); i++){
//            sb.append(basket.get(i));
                System.out.println(basket.get(i));
            }
            System.out.println(sb);
            sb.append("\n-----------------------------------------------------\n");
        }else{
            System.out.println("장바구니가 비었습니다. \n");
        }

    }


}
