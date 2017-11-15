import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Panel extends JPanel
{

    private ArrayList<Element> elementList = new ArrayList<Element>();
    
    public void addElement(Element element)
    {
        elementList.add(element);
    }
    
    @Override
    protected void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics);
        
        //loop through shapelist and draw each shape
        for (Element element : elementList)
        {
            element.draw(graphics);
        }
    }
}
