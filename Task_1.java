import java.util.*;

class Task_1 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        Random rn=new Random();
        while(true){
            int actual=rn.nextInt(100)+1;
            int attemts=10;
            int score=100;
            System.out.println("Welcome to the Number Gussing Game!");      
            while (attemts>0){
                System.out.print("Guess the number between 1 and 100 : ");
                int guess=sc.nextInt();
                if(guess==actual){
                    System.out.println("Congratulations your guess is correct\nYour score is "+score);
                    break;
                }
                else if(guess<actual){
                   if(attemts==1){
                        System.out.println("Your guess is too low");
                        attemts--;
                        score-=10;
                   }
                   else{
                        System.out.println("Your guess is too low\nTry again");
                        attemts--;
                        score-=10;
                   }
                }
                else{
                    if(attemts==1){
                        System.out.println("Your guess is too high");
                        attemts--;
                        score-=10;
                    }
                    else{
                        System.out.println("Your guess is too high\nTry again");
                        attemts--;
                        score-=10;
                    }
                }
            }
            if(attemts==0){
                System.out.println("You lost the game\nThe actual number is "+actual+"\nYour score is "+score);
            }
            System.out.println("Do you want to play again (yes|no)");
            String opt=sc.next().toLowerCase();
            if (opt.equals("no")) {
                System.exit(0);
            }
        }
    }
}