import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class StringOut extends Element
{
    int x;
    int y;
    String value;
    public StringOut(int value, int x, int y, Color color, boolean filled, String title)
    {
        super(color, filled, title);
        this.x = x;
        this.y = y;
        this.value = "" + value;
    }


    @Override
    public void draw(Graphics g)
    {

        g.setFont(new Font("TimesRoman", Font.PLAIN, 80));
        g.drawString(value, x, y);

        
        
    }

}
