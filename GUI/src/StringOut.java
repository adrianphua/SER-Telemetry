import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class StringOut extends Element
{
    String input;
    int x;
    int y;
    String value;
    public StringOut(String in, int value, int x, int y, Color color, boolean filled)
    {
        super(color, filled);
        input = in;
        this.x = x;
        this.y = y;
        this.value = "" + value;
    }


    @Override
    public void draw(Graphics g)
    {
        Font Font = g.getFont();
        g.setFont(new Font("TimesRoman", Font.PLAIN, 80));
        g.drawString(value, x, y);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        g.drawString(input, x + 30, y + 5);
        
        
    }

}
