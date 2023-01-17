import java.util.Scanner;
public class HWO
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Students[] s = new Students[5];
        int i=0;
        while(i<s.length)
        {
            s[i] = new Students();
            System.out.print("Enter name of student "+(i+1)+" :");
            s[i].name=in.next();
            System.out.print("Enter Roll No "+(i+1)+" :");
            s[i].rollNo=in.nextInt();
            System.out.print("Enter mobile number of student "+(i+1)+" :");
            s[i].mN=in.nextInt();
            System.out.print("Enter marks of student "+(i+1)+" :");
            s[i].marks=in.nextInt();
            i++;
        }
        for (i=0;i<s.length;i++)
        {
            System.out.println(s[i].name+" in roll number "+s[i].rollNo
                    +", has a mobile number: "+s[i].mN+", marks: "+s[i].marks);
        }
        int max=s[0].marks;
        for (i=0;i<s.length;i++)
        {
            if(max<s[i].marks)
            {
                max=s[i].marks;
            }
        }
        int search=max;
        int j;
        for(j=0;j<s.length;j++)
        {
            if(search==s[j].marks)
            {
                System.out.println("The highest mark is "+max+" ,for the student "+s[j].name);
                break;
            }
        }
    }
}

//Write a Java Program to get the details of 5 Students in a class.
//        The details will be Name, Roll No, Mobile Number, Marks.
//        Use Class & Object concept
//        After getting the values you have to print which student scored highest marks.

