import javax.swing.JPanel;
import java.awt.Color;
import java.awt.*;
/**
 * Write a description of class DrawingPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    public DrawingPanel(){
        setBackground(Color.BLUE);
    }
    @Override
public void paint(Graphics g){
    super.paint(g);
}

}

