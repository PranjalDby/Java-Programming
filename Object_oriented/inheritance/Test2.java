package inheritance;
// You are using Java
abstract class Account {
    //type your code here
    public String AccountHolder;
    public double principalAmount;
    public abstract double calculateInterest();
}

class FixedDeposit extends Account {
   //type your code here
   int duration;
   double roi;
   FixedDeposit(String name,double pa,int duration,double roi){
       this.AccountHolder = name;
       this.principalAmount = pa;
       this.duration = duration;
       this.roi = roi;
   }
   @Override
   public double calculateInterest(){
       return (this.principalAmount * this.duration * this.roi)/100;
   }
}

public class Test2 {
    public static void main(String[] args) {
        
    }
}
