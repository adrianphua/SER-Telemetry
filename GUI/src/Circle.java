import java.awt.Color;
import java.awt.Point;


public class Circle extends Oval
{

    public Circle(Point pointUL, int diameter, Color color, boolean filled)
    {
        super(pointUL, diameter, diameter, color, filled);
    }

    public int getDiameter()
    {
        return getDiameter1();
    }
}
