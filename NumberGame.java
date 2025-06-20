    import java.util.Random;
    import java.util.Scanner;
    class NumberGenerater{
        public int RandomNum(){
        int r=(int)(Math.random()*100)+1;
        return r;
    }
    public int getUserGuess(){
        int userguess;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your guess (1 - 100):");
        userguess=input.nextInt();
        return userguess;
        }
}
    public class NumberGame{
        public static void main(String args[])
        {
            NumberGenerater numgame=new NumberGenerater();
            
            int count=0;
            boolean playAgain=true;

            while(playAgain){
                int a=numgame.RandomNum();
                for(int i=1;i<=5;i++){
                    
                    int b=numgame.getUserGuess();
                
                    if(a==b){
                    System.out.println("Random Number Matched !.....");
                    count++;
                    System.out.println("Computer Generated NO. :"+a);
                    System.out.println("User's Guess NO. :"+b);
                    a=numgame.RandomNum();
                    
                    }
                    else if(a>b){
                        System.out.println("Too Low !...");
                            }
                    else{
                        System.out.println("Too high !...");
                    }       
         }
         System.out.println("Computer Generated NO. :"+a);
         System.out.println("You won "+count+ "  of 5 !...");

         System.out.print("\nDo you want to play another round? (yes/no): ");
         Scanner input=new Scanner(System.in);
         String response = input.next().toLowerCase();
         playAgain = response.equals("yes");
}
            

        }
    }