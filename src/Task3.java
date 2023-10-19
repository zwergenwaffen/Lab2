import java.util.Random;

public class Task3
{
    public static void main(String[] args)
    {
        int randomNumber = (int) (Math.random()*(100-1));

        if(randomNumber%2==0)
        {
            System.out.println("Rand number is odd and " + randomNumber);
        }
        else {System.out.println("Rand number isnt odd and " + randomNumber);};
    }
}
