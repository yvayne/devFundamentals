package SwingExample;
import javax.swing.JFrame;
/**
 * Write a description of class DrawingWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrawingWindow extends JFrame
{
    private DrawingPanel panel;
    public DrawingWindow(String title) {
        super(title);
        panel = new DrawingPanel();
        panel.setSize(50,100);
        //setLayout no usar es mala practica
        getContentPane().add(panel);
    }
    public static void main(String args[]) {
        DrawingWindow window = new DrawingWindow("Drawing Example");
        window.setSize(500,150);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
