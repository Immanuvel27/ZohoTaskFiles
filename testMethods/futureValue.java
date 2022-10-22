package testMethods;
import java.util.*;
class futureValue {
    public static double FV(double amount,double rate,double n){
        double pow=1,sq=1+rate,Fv;
        for(int i=0;i<n*12;i++){
        pow*=sq;
        }
        Fv=amount*pow;
        return(Fv);
    }
    public static void main(String[] args) {
       Scanner cin=new Scanner(System.in);
       System.out.println("enter the amount:");
       double amount=cin.nextDouble();
       System.out.println("enter the rate:");
       double rate=cin.nextDouble();
       System.out.println("enter the Number of years:");
       double n=cin.nextDouble();
       
       rate/=100;
       System.out.println("years"+"\t"+"Future value");
       for(int i=1;i<=n;i++){
          double FV=FV(amount,rate/12,i);
          System.out.println(i+"\t"+FV);
       }
    }
}
