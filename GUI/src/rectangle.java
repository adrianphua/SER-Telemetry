import java.awt.Color;
import java.awt.Point;


public class rectangle extends polygon
{


    public rectangle(Point pointUL, int width, int height, Color color, boolean filled, String title)
    {
        super(color, filled, title);
        

        this.location = new Point[4];

        location[0] = pointUL;
        location[1] = new Point(pointUL.x , pointUL.y + height);
        location[2] = new Point(pointUL.x + width, pointUL.y + height);
        location[3] = new Point(pointUL.x + width, pointUL.y);
        
        
    }
    
    public Point getCenter()
    {
        Point center = new Point((location[2].x - (location[2].x - location[0].x)), location[2].y + 20);
        return center;
    }

}