class SubClass extends HomeworkTwo
{
    SubClass()
    {
        System.out.println("This is constructor of abstract class");
    }
    @Override
    String a_method() {
        return "This is abstract method";
    }
    String non_abstract() {
        return "This is a normal method of abstract class";
    }
}
