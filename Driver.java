import javax.swing.JFrame;
/**
 * Lab11 Driver creates and initiates Panel11
 * @author Cai Yeo
 * @author Caleb Shen
 * @version 1/21/2015
 * @since 6
 */
public class Driver
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Nim");
        frame.setSize(1200, 500);
        frame.setLocation(50, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Panel11());
        frame.setVisible(true);
    }
}