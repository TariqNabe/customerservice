class StudentA extends Marks
{
    int marks1, marks2, marks3;
    StudentA(int m1, int m2, int m3)
    {
        marks1=m1;
        marks2=m2;
        marks3=m3;
    }
    public float getPercentage()
    {
        float total=((marks1+marks2+marks3)/(float)400)*100;
        return total;
    }
}
