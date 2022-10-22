package testMethods;

import java.util.*;
class HelloWorld {
    public static boolean isPrime(int n){
        boolean flag=false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=false;
                break;
            }else{
                flag=true;
            }
            
        }
        if(flag==true){
        for(int i=2;i<n+2;i++){
            if((n+2)%i==0){
                flag=false;
            }else{
                flag=true;
            }
        }
        }
        return(flag);
    }
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Enter the numnber:");
        int n=cin.nextInt();
        for(int i=0;i<n;i++){
            boolean res=isPrime(i);
            if(res==true){
                System.out.println(i+" "+(i+2));
            }
        }
    }
}

