public class Rectangle extends Shape  {//extending child class from superclass
    private double width;//private width variable for Rectangle object
    private double length;//private length variable for Rectangle

    public Rectangle()//default constructor
    {
        super();//to call superclass constructor
        width = 1.0;//defines width
        length = 1.0;//defines length
    }

    public Rectangle(double width, double length)//constructor with width and length parameters
    {
        super();//to call superclass constructor
        this.width = width; //the current width will be set with the given width.
        this.length = length;//the current length will be set with the given length.
    }
    public Rectangle(double width, double length, String color, boolean filled)//constructor with width and length parameters and color as well boolean fileld
    {
        super(color, filled);// calling the overloading constructor of its parent with color and filled properties .
        this.width = width; //the current width will be set with the given width.
        this.length = length;//the current length will be set with the given length
    }

    public double getWidth() {
        return width;
    }//getters to get width

    public void setWidth(double width) {
        this.width = width;
    }//setter to set width

    public double getLength() {
        return length;
    }//getter to get length and sets it

    public void setLength(double length) {
        this.length = length;
    }//setter to set length

    public  double getArea()//defined getter from abstract class
    {
        double area = length * width;
        return area;
    }
    public  double getPerimeter()//defined getter from abstract class
    {
        double perimeter = 2 * (length + width);;
        return perimeter;
    }

    @Override
    public String toString()//toString method to return value.
    {
        return "Rectangle[Shape[color="+color+",filled="+filled+"].width="+width+",length="+length+"]";
    }
}
