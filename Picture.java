/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square square1;
    private Square square2;
    private Triangle triangle1;
    private Circle circle;
    private Person person;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        square1 = new Square();
        square2 = new Square();
        triangle1 = new Triangle();  
        circle = new Circle();
        person = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            square1.changeColor("brown");
            square1.makeVisible();
            
            square2.changeColor("blue");
            square2.changeSize(1000);
            square2.makeVisible();
            
            triangle1.changeColor("green");
            triangle1.makeVisible();
            
            circle.changeColor("yellow");
            circle.makeVisible();
            
            
            person.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        square1.changeColor("black");
        triangle1.changeColor("black");
        circle.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        square1.changeColor("brown");
        triangle1.changeColor("green");
        circle.changeColor("yellow");
    }
}
