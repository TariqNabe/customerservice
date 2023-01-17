public class MainClassForstudent
{
    public static void main(String[]args)
    {
        StudentA a = new StudentA(70, 50, 100);

        System.out.println(a.getPercentage());

        StudentB b = new StudentB(90, 75, 64, 86);

        System.out.println(b.getPercentage());
    }
}
