public class Circle extends Shape {//extending child class from superclass

    private double radius;//define radius here with private data

    public Circle()//default constructor
    {
        super();//calling super constructor
        radius = 1.0;
    }
    public Circle(double radius)//calling super constructor with radius parameter
    {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled)//calling super constructor with radius parameter and color as well as boolean filled
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {//getters to get radius
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }//setters for setting radius

    public  double getArea()//getArea abstract method defining from abstract super class
    {
      double area = Math.PI * radius * radius;
      return area;
    }
    public  double getPerimeter()//getPerimeter  abstract method defining from abstract super class
    {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    @Override
    public String toString()//tostring method defined and return value
    {
        return "Circle[Shape[color="+color+",filled="+filled+"].radius="+radius+"]";
    }


}
