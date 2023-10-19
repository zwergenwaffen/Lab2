public class Task4
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 10;
        int container = 0;

        int amountOfBricks = (a*10)+ (int) (Math.random()*(b*10));
        int containerCapacity = a+(int) (Math.random()*b);

        int fullContainers = amountOfBricks/containerCapacity;
        int moreBricks = amountOfBricks%containerCapacity;

        container = fullContainers;
        if(moreBricks !=0)
        {
            container++;
            // containerCapacity = moreBricks;
        }

        System.out.println("Total number of containers:" + container);
        System.out.println("Fll: " + fullContainers);
    }
}
