
package romo.it2b;

import java.util.Scanner;

public class Loan {
    
    
    public void getLoan(){
        
        
     
        Scanner sc = new Scanner(System.in);
        
        Loan[] lc = new Loan[100];
        
            System.out.print("Enter number of Applications: ");
            int numl = sc.nextInt();
            
            for(int i = 0; i < numl; i++ ){
            
                System.out.println("Enter details of application "+(i+1)+":");
                System.out.print("ID: ");
                int id = sc.nextInt();
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Monthly Income: ");
                double mIncome = sc.nextDouble();
                System.out.print("Credit Score: ");
                double cScore = sc.nextDouble();
                System.out.print("Existing Loans: ");
                double eIncome = sc.nextDouble();
                
                lc[i] = new Loan();
                lc[i].addLoan(id, name, mIncome, cScore, eIncome);
                
                boolean valid = true;
                
                if(lc[i].mIncome < 30000){
                boolean valid = false;
                    System.out.println("Monthly Income must be 30,000 PHP");
                
                }
                if(lc[i].cScore < 650 ){
                
                boolean valid = false;
                    System.out.println("Credit score must be at least 650");
                }
                
                if(lc[i].eLoan > 500000){
                
                    boolean valid = false;
                    System.out.println("Existing Loan must not exceed 500000 PHP");
                
                }
                
                if(valid){
                
                    System.out.println("loan Approved! ");
                
                }
                
                else {
                
                    System.out.println("Loan not Approved! ");
                
                }
                
                sc.close();
                
                
                
            }
            
            System.out.println("ID      Name        Monthly Income      Credit Score        Existing Loans      Loans Approved");
            
            for(int i = 0; i < numl; i++ ){
            
            lc[i].viewLoan();
            
            }
            


}
    
}
