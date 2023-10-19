public class Task2
{
    public static void main(String[] args)
    {
        float earthWeight = 75;
        float marsWeight;

        double marsWeightD;

        int marsWeightI;

        char marsWeightC;

        marsWeight = (earthWeight * 0.38F);
        System.out.println(marsWeight);

        marsWeightD =marsWeight;
        System.out.printf("%.4f %n", marsWeight);

        marsWeightI=(int)marsWeightD;

        marsWeightC=(char)marsWeightI;
        System.out.println(marsWeightC);

        int amooAdd = (marsWeightC + 20);
        System.out.println("test "+ amooAdd);







    }
}
