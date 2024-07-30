import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int chances=8;
            int finals=0;
            boolean playAgain=true;
            System.out.println("Nameste buddy!");
            System.out.println("You have about " +chances+ " Chances to win the game");
            while(playAgain){
                int rand=getrandN(1,100);
                boolean guess=false;
                for(int i=0;i<chances;i++)
                {
                    System.out.println("Chance " +(i+1)+ " Enter Your Number");
                    int user=sc.nextInt();
                    if(user==rand)
                    {
                        guess=true;
                        finals+=1;
                        System.out.println("Hurryy! You Won it");
                        break;
                    }
                    else if(user>rand)
                    {
                        System.out.println("Too High");

                    }
                    else
                    {
                        System.out.println("Too low");
                    }
                    if(guess==false)
                    {
                        System.out.println("Sorry buddy, You Lost the chances ");
                    }
                    System.out.println("Do you want play Again(Y/N)");
                    String pA=sc.next();
                    playAgain=pA.equalsIgnoreCase("y");
                }
                System.out.println("That's It Buddy, I Hope you Enjoyed it");
                System.out.println("Here is your Score: "+finals +" Thankyou");}
        }}
            public static int getrandN(int min,int max){
                return (int)(Math.random()*(max-min+1)+min);
                
            }
        }
        
    

