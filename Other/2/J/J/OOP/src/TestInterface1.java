class TestInterface1{
    public static void main(String args[])
    {
        //In real scenario, object is provided by method e.g. getDrawable()
        Drawable d = new Circle();
        d.draw();
        Drawable d1 = new Rectangle();
        d1.draw();
    }
}