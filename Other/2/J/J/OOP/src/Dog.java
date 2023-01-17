class Dog extends Animal
{
    public String type="mammal";
    public void printType()
    {
        System.out.println("I am a " + type);
        System.out.println("I am an " + super.type);
    }
}


//class Dog extends Animal
//{
//    public void displayInfo()
//    {
//        System.out.println("I am a dog.");
//    }
//}


//class Dog extends Animal
//{
//    public void getInfo()
//    {
//        System.out.println("My name is " + name);
//    }
//}


//// Dog inherits animal
// class Dog extends Animal
//{
//    // overriding the eat() method @Override
//    public void eat()
//    {
//        super.eat();
//        System.out.println("I eat dog food");
//    }
//// new method in subclass
//    public void bark()
//    {
//        System.out.println("I can bark");
//    }
//}
