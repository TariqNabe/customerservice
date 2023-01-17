public class J
{
    // Declare instance variables.
    public String name = "John";
    String schoolName = "RSVM";
    // Declaration of constructor.
    J() {
        int id = 1234;
        System.out.println("Id of Student: " +id);
    }
    // Declaration of user-defined method in instance area.
    public void mySchool()
    {
    // Declaration of local variable.
        System.out.println("Name of School: " +schoolName+"\nThe student name is: "+name);
    }
    public void mySchool1()
    {
        System.out.println("Name of School:" +schoolName);// Not possible because local variable cannot access from outside the method, constructor, or block.
    }
    public static void main(String[] args)
    {
// Create the object of class 'School'.
        J sc = new J();
        sc.mySchool();
    }
}