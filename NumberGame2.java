package NumberGame;
import java.util.Random;
import java.util.Scanner;
class NumberGame2 {
    public int number;
    public int inputNumber;
    public int numberOfGuesses;
    NumberGame2(){   
        Random rand= new Random();
        this.number=rand.nextInt(100);
    }
    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }
    int takeUserInput(){
      System.out.println("Guess the User Input");
      Scanner sc = new Scanner(System.in);
      inputNumber=sc.nextInt();
      return inputNumber;
    }
    boolean isCorrectNumber(int n){
        numberOfGuesses++;
        if(n==number){
          
            System.out.println("You have Guessed the correct Number" + number + "In" + numberOfGuesses + "Attempts");
            return true;
                    
        }else if(n>number){
            System.out.println("Number is too high");
        }else if(n<number){
            System.out.println("Number is too low");
        }
        return false;        
    }

   
    public static void main(String args[]){
        boolean b = false;
        NumberGame2 num = new NumberGame2();
        while(! b){
        int num1= num.takeUserInput();
        boolean ans1= num.isCorrectNumber(num1);
        System.out.print(ans1);
    }
   
}
}

