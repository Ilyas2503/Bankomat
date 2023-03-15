import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposite(20000);

        System.out.println("Нажмите на ENTER ");
        Scanner scanner = new Scanner(System.in);
        String y = scanner.nextLine();


        while(true){
            try{
                System.out.println("---------------------");
                System.out.println("Текущая сумма на вашей карте: " +
                        "" + bankAccount.getAmount());
                bankAccount.withDraw(6000);
            }catch (LimitException s){
                System.out.println(s.getMessage());
                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                    System.out.println("---------------------");
                    System.out.println("Текущая сумма на вашей карте: " + bankAccount.getAmount());

                }catch (LimitException limitException){
                    limitException.printStackTrace();
                }
                break;
            }
        }
    }
}