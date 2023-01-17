public class Square extends Rectangle{//extending child class from superclass

    public Square()//default constructor
    {
        super();//calling default constructor of its super class
    }
    public Square(double side)// constructor with side parameter
    {
        super(side, side);
    }
    public Square(double side, String color, boolean filled)// constructor with side parameter and color as well as boolean
    {
        super(side, side, color, filled);
    }
    public double getSide() {//getters for get side
        return this.getWidth();
    }
    public void setSide(double side) {//setter for setting side
        super.setWidth(side);
        super.setLength(side);
    }
    public void setWidth(double side) {//setter to set width
        super.setWidth(side);
    }
    public void setLength(double side) {//setter for setting length
        super.setLength(side);
    }
    @Override
    public String toString()//tostring method to return value.
    {
        return "Square[Rectangle[shape[color="+color+",filled="+filled+"].width="+this.getWidth()+",length="+this.getLength()+"]]";
    }
}
