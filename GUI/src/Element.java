import java.awt.Color;
import java.awt.Point;

public abstract class Element implements Drawable
{
    protected Point[] location;
    
    private Color color;
    
    private boolean filled;
    
    private String title;
    
    public Element(Color color, boolean filled, String title)
    {
        this.color = color;
        this.filled = filled;
        this.title = title;
    }
    public String getTitle()
    {
        return title;
    }
    
    public Color getColor()
    {
        return color;
    }
    public boolean isFilled()
    {
        return filled;
    }

    public Point[] getLocation()
    {
        return location;
    }
}
