import java.io.*;
public class ChapterThree {
    
    static public class BankAccount{
        private String password;
        private double balance;
        public static final double OVERDRAWN_PENALTY = 20.00;
        
        //constructors
        /**Default constructor.
         * Constructs bank account with default values.*/
        public BankAccount(String acctPassword, double acctBalance){
            password = acctPassword;
            balance = acctBalance;
        }
        //accesor
        /**@return balance of this account*/
        public double getBalance(){
            return balance;
        }

        //mutators
        /** Deposits amount in the bank account with given password. 
         @param acctPassword the password of this bank account
         @param amount the amount to be deposited*/
         public void deposit(String acctPassword, double amount){

         }

         /** Withdraws amount from bank account with given password
          * Assess penalty if balance is less than amount.
          * @param acctPassword te password of this bank account.
          * @param amount the amount to be withdrawn
          */

          public void withdraw(String acctPassword, double amount){

          }
        
    }
    public static class Driver{

    }
    public static class Person{
        /**
         * for an instance method, the object is called an implicit parameter
         * implicitly is obj.method(params)
         */
        private String name;
        private int age;

        public Person(String aName, int anAge){
            name = aName;
            age = anAge;
        }
        public String toString(){
            return name + " " + age;
        }
        public void printPerson(){
            System.out.println(this);
        }
    }
    public static void set(int x, int y){
        x = 3;
        y = 4;
    }
    public static void multipleChoiceChapter3(){
        /**
         * 1. C **D
         * 2. B or E depends on question
         * 3. B **C
         * 4. E **C
         * 5. B
         * 6. C
         * 7. E
         * 8. D **E
         * 9. A
         * 10. A
         * 11. C
         * 12. B
         * 13. E
         * 14. C
         * 15. D
         * 16. E
         * 17. B **D
         * 18. D **B
         * 19. E
         * 20. D
         * 21. A
         * 22. B **A
         * 23. C
         */
    }
    public static void main(String[]args){
        BankAccount arjun = new BankAccount("Arjun", 209.293);
        System.out.println(arjun.getBalance());
        Person p = new Person("Arjun", 15);
        p.printPerson();
        int a = 8, b = 9;
        set(a,b);
        System.out.println(a+b);
    }
}

