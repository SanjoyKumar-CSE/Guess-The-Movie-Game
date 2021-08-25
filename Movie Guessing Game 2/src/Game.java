
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public void game()
    {
        Scanner sc = new Scanner(System.in);
        TitleLock myObj = new TitleLock();
        myObj.lockTheTitle();
        //System.out.println(myObj.pickedMovie);
        int wrongInput = 0;
        boolean isGameOver = false;
        int lengthOfPickedMovie = myObj.pickedMovie.length();
        ArrayList<Character> wrongChar = new ArrayList<>();
        ArrayList<Character> lckString = new ArrayList<>();
        for (int i = 0; i < lengthOfPickedMovie; i++) lckString.add(myObj.lockString.charAt(i));
        while(!isGameOver)
        {
            System.out.print("You are guessing: ");
            for(int i = 0; i < lengthOfPickedMovie ; i++)
            {
                System.out.print(lckString.get(i));
            }
            System.out.println();
            System.out.print("You have guessed (" + wrongInput + ") wrong letters: ");
            if(wrongChar.size() > 0)
            {
                for (Character character : wrongChar) System.out.print(character + " ");
            }
            System.out.println();
            System.out.print("Guess a letter: ");
            char ch = sc.next().charAt(0);
            if(myObj.pickedMovie.indexOf(ch) == -1)
            {
                wrongInput += 1;

                wrongChar.add(ch);
            }
            else
            {
                for(int i = 0; i < lengthOfPickedMovie; i++)
                {
                    if(myObj.pickedMovie.charAt(i) == ch)
                    {
                        lckString.set(i,ch);
                    }
                }
                int numberOfLock = 0;
                for(int i = 0; i < lengthOfPickedMovie; i++)
                {
                    if(lckString.get(i)=='_')numberOfLock += 1;
                }
                if(numberOfLock == 0)
                {
                    System.out.println("You Win!");
                    System.out.println("You have guessed '" + myObj.pickedMovie + "' correctly.");
                    isGameOver = true;
                }
            }
            if(wrongInput == 10){
                System.out.println("You are Looser");
                System.out.println("Game Over !");
                isGameOver = true;
            }

        }
    }
}