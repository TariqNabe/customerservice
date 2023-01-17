import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @org.junit.jupiter.api.Test
    void getColor() {//getter method test
        Shape r = new Rectangle();//rectangle object
        assertEquals("red", r.getColor());//rectangle class getter method to get color test

        Shape c = new Circle();//circle object
        assertEquals("red", c.getColor());//circle class getter method to get color test

        Shape s = new Square();//Square object
        assertEquals("red", s.getColor());//Square class getter method to get color test

    }

    @org.junit.jupiter.api.Test
    void setColor() {

    }

    @org.junit.jupiter.api.Test
    void isFilled() {
        Shape r = new Rectangle();//rectangle object
        assertEquals(true, r.isFilled());//isfilled method test to return expected value
        Shape r2 = new Rectangle(15,25,"red",false);
        assertEquals(false, r2.isFilled());

        Shape c = new Circle();//Circle object
        assertEquals(true, c.isFilled());//isfilled method test to return expected value
        Shape c2 = new Circle(12.2,"red",false);
        assertEquals(false, c2.isFilled());

        Shape s = new Square();//Square object
        assertEquals(true, s.isFilled());//isfilled method test to return expected value
        Shape s2 = new Square(12.2,"red",false);
        assertEquals(false, s2.isFilled());
    }

    @org.junit.jupiter.api.Test
    void setFilled() {
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Shape r = new Rectangle();//Rectangle object
        assertEquals(1.0, r.getArea());//test getarea by expected value insert
        Shape r2 = new Rectangle(15,25,"red",false);
        assertEquals(375, r2.getArea());

        Shape c = new Circle();//Circle object
        assertEquals(3.141592653589793, c.getArea());//test getarea by expected value insert
        Shape c2 = new Circle(2,"red",false);
        assertEquals(12.566370614359172, c2.getArea());

        Shape s = new Square();//Square object
        assertEquals(1.0, s.getArea());//test getarea by expected value insert
        Shape s2 = new Square(10,"red",false);
        assertEquals(100, s2.getArea());
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        Shape r = new Rectangle();//Rectangle object
        assertEquals(4, r.getPerimeter());
        Shape r2 = new Rectangle(2.0,2.0,"red",false);
        assertEquals(8.0, r2.getPerimeter());

        Shape c = new Circle();//Circle object
        assertEquals(6.283185307179586, c.getPerimeter());
        Shape c2 = new Circle(2.0,"red",false);
        assertEquals(12.566370614359172, c2.getPerimeter());

        Shape s = new Square();//Square object
        assertEquals(4.0, s.getPerimeter());
        Shape s2 = new Square(10,"red",true);
        assertEquals(40.0, s2.getPerimeter());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Shape r = new Rectangle();//Rectangle object
        assertEquals("Rectangle[Shape[color=red,filled=true].width=1.0,length=1.0]", r.toString());

        Shape c = new Circle();//Circle object
        assertEquals("Circle[Shape[color=red,filled=true].radius=1.0]", c.toString());
        Shape s = new Square();//Square object
        assertEquals("Square[Rectangle[shape[color=red,filled=true].width=1.0,length=1.0]]", s.toString());
    }
}