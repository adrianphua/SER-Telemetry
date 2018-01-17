import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;

public abstract class polygon extends Element
{
    String title;

    public polygon(Color color, boolean filled, String title)
    {
        super(color, filled, title);
        this.title = title;
    }
    
    public abstract Point getCenter();

    @Override
    public void draw(Graphics graphics)
    {
        int numOfPoints = location.length;

        int[] xPoints = new int[numOfPoints];
        int[] yPoints = new int[numOfPoints];
        
        Point centerTitle = getCenter();
        graphics.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        
        graphics.drawString(title, centerTitle.x, centerTitle.y);

        for (int i = 0; i < numOfPoints; i++)
        {
            xPoints[i] = location[i].x;
            yPoints[i] = location[i].y;
        }
        

        graphics.setColor(this.getColor());
        

        if (this.isFilled())
        {
            graphics.fillPolygon(xPoints, yPoints, numOfPoints);
        } 
        else
        {
            graphics.drawPolygon(xPoints, yPoints, numOfPoints);
        }
    }
}
