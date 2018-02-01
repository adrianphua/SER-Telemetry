import java.awt.Color;
import java.awt.Point;


public class Circle extends Oval
{

    public Circle(Point pointUL, int diameter, Color color, boolean filled, String title)
    {
        super(pointUL, diameter, diameter, color, filled, title);
    }

    public int getDiameter()
    {
        return getDiameter1();
    }
}
