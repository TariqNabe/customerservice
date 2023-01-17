class TestAbstraction1{
    public static void main(String args[])
    {
        Shape s = new Circle1();//In a real scenario, object is
        s.draw();
        s = new Rectangle();
        s.draw();

    }
}