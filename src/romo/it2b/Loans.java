
package romo.it2b;

public class Loans {
    
    String name;
    int id;
    double mIncome, cScore, eLoans;
   
    public void addLoan(String name, int id, double mIncome,double cScore,double eLoans){
    
    this.name = name;
    this.id = id;
    this.mIncome = mIncome;
    this.cScore = cScore;
    this.eLoans = eLoans;
    
    }
    
    public void viewLoan(){
       
        String userStatus = () ? "Approved" : "Denied"; 
        String Lstatus = ( ); 
     
    
        System.out.printf("%-10d    %-10s    %-10.2f    %-10.2f    %-10.2f    %-10s  \n",this.id, this.name, this.mIncome, this.cScore, this.eLoans);
    
    }
    
}


