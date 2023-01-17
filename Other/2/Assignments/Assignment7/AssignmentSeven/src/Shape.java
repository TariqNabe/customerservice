
/*

Tareq
Nov 13th, 22
Assignment 7.
Nazim Ashraf
 */

public abstract class Shape {//abstract class
    protected String color;//protected data variables
    protected boolean filled;//protected data variables

    public Shape()//default constructor
    {
         color = "red";
         filled = true;
    }
    public Shape(String color, boolean filled)// constructor with color and boolean whether it's filled or not.
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }//method to get color, getters

    public void setColor(String color) {
        this.color = color;
    }//method to set color, setters

    public boolean isFilled() {//boolean method to check if it is true or no
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }//setter method for filled or not
    public abstract double getArea();//abstract method to implemented in child class
    public abstract double getPerimeter();//abstract method to implemented in child class

    @Override
    public String toString()//tostring method to return back data
    {
        return "Shape[color= "+ this.color +", filled= " + this.filled + "]";
    }



}
