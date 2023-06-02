package aloneKiosk.kiosk;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Order {
    private int choice;
    private Scanner sc;
    private StringBuffer sb;

    private int waitingNum = 0;
    static List<ProductMenu> basket;
    public Order(){
        basket = new ArrayList<>();
    }



    public void showList(String name, double price, String explanation){
        sc = new Scanner(System.in);
        sb = new StringBuffer();
        sb.append("-------------------------------------------------------------------------\n");
        sb.append(name + "\t");
        sb.append(price + "\t");
        sb.append(explanation + "\t");
        sb.append("\n-------------------------------------------------------------------------\n");
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
            System.out.println("-------------------------------------------------------------------------");
            System.out.println(name + "가 장바구니에 추가되었습니다.");
            System.out.println("-------------------------------------------------------------------------");
        }else {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("주문이 취소되었습니다.\n처음으로 돌아갑니다.");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println();
        }
    }

    public void showOrder(){
        sc = new Scanner(System.in);
        sb = new StringBuffer();
        double total = 0.0;
        if(basket.size() != 0){
            sb.append("-------------------------------------------------------------------------\n");
            sb.append("아래와 같이 주문 하시겠습니까? \n");
            sb.append("\n[ Orders ]\n");
            for (int i=0; i<basket.size(); i++){
                ProductMenu product = basket.get(i);
                sb.append(String.format("%d. %-17s | W %.1f | %s\n", (i+1), product.getName(), product.getPrice(), product.getExplanation()));
            }
            System.out.println(sb);
            System.out.println("[ Total ]");
            for (int i=0; i<basket.size(); i++){
                ProductMenu product = basket.get(i);
                total = total + product.getPrice();
            }
            System.out.printf("W %.1f \n",  total);
            System.out.println("\n1. 주문 \t\t 2. 메뉴판" );
            choice = sc.nextInt();
            orderComplete(choice);
            System.out.println("-------------------------------------------------------------------------");
        }else{
            System.out.println("장바구니가 비었습니다. \n");
        }
    }

    public void orderComplete(int choice){
        if(choice == 1){
            System.out.println("\n주문이 완료되었습니다.\n");
            System.out.println("대기번호는 [ " + (++waitingNum) + " ] 번 입니다.");
            basket.clear();
            System.out.println("(3초후 메뉴판으로 이동합니다.)\n");
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                e.getMessage();
            }
        }else{
            System.out.println("메뉴판을 선택하셨습니다.\n메뉴판으로 이동합니다.");
        }
    }

    public void orderCancel(){
        sc = new Scanner(System.in);
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인 \t\t 2. 취소");
        choice = sc.nextInt();
        if(choice == 1){
            System.out.println("진행하던 주문이 취소되었습니다.");
            basket.clear();
        }else {
            System.out.println("메뉴판으로 돌아갑니다.");
        }

    }
}
