import java.util.*;
public class shopping_bill {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int carrot=s.nextInt();
        int beans=s.nextInt();
        int apple=s.nextInt();
        int orange=s.nextInt();
        int grapes=s.nextInt();
        int amount_paid=s.nextInt();
        double discount=0;
        int total_count=carrot+beans+apple+orange+grapes;
        double total_price=carrot*15+beans*20+apple*15+orange*25+grapes*30;
        shopping_bill.total_amount(total_price);
        shopping_bill.balance_amount(total_price,amount_paid);
        shopping_bill.discount(total_count,discount);
    }
    public static void total_amount(double total_price){
        System.out.println("Total price is "+total_price);
    }
    public static void balance_amount(double total_price,int amount_paid){
        System.out.println("Balance amount is "+(amount_paid-total_price));
    }
    public static void discount(double total_count,double discount){
        if(total_count>=5){
            discount=(total_count*50)/100;
            System.out.printf("Discount is "+"%.2f",(discount));
        }
        else{
            System.out.println("No discount");
        }
    }
}
