import java.util.Scanner;

class bankaccount{
    int a_n = 1005;
    int bal = 10000;
    void check(int ch){
        if(ch == a_n){
            System.out.println("you have an account");
            System.out.println();
        }
        else{
            System.out.println("you dont have account");
            System.out.println();
            
        }
    }
}
class depo extends bankaccount{
    void depos(int m){
        bal+=m;
        System.out.println("Successfully deposited ");
        System.out.println("CURRENT BALANCE:"+bal);
        System.out.println();
    }
}
class withdraw extends bankaccount{
    void wd1(int m){
        if((bal - m) < 0){
            System.out.println("insuffienct balance");
            System.out.println();
        }
        else{
            bal-=m;
            System.out.println("Successfully withdrawn");
            System.out.println("CURRENT BALANCE:"+bal);
            System.out.println();
        }
    }
}
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ACCOUNT CHECK");
        int n = sc.nextInt();
        bankaccount ob1 = new bankaccount();
        if(n==ob1.a_n){
            System.out.println();
            System.out.println("ENTER THE CHOICE");
        System.out.println("1.ACCOUNT CHECK");
        System.out.println("2.DEPOSIT MONEY");
        System.out.println("3.WITHDRAW MONEY");
        System.out.println("4.EXIT");
        int o = sc.nextInt();
        while(o!=4){
            
            Scanner x = new Scanner(System.in);
            if(o==1){
                
                System.out.println("ENTER THE ACCOUNT NUMBER");
                int z = x.nextInt();
                ob1.check(z);
                System.out.println();
            }
            else if(o==2){
                depo ob2 = new depo();
                System.out.println("ENTER THE DEPOSIT MONEY");
                int z = x.nextInt();
                ob2.depos(z);
                System.out.println();
            }
            else if (o==3){
                withdraw ob3 = new withdraw();
                System.out.println("ENTER THE MONEY WITHDRAWAL");
                int z = x.nextInt();
                ob3.wd1(z);
                System.out.println();
            }
            else if (o==4){
                System.out.println("THANK YOU");
                System.out.println();
                break;
            }
            else{
                System.out.println("You entered wrong choice");
            }
            System.out.println("ENTER THE CHOICE");
        System.out.println("1.ACCOUNT CHECK");
        System.out.println("2.DEPOSIT MONEY");
        System.out.println("3.WITHDRAW MONEY");
        System.out.println("4.EXIT");
             o = sc.nextInt();
    }

        }
        else{
            System.out.println("Enter the correct account number \nThank you");
        }
        
}
    
}
