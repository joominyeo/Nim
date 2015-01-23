import javax.swing.*;
import java.awt.*;
import java.lang.*;
/**
 * Display11 receives input from the player and updates the images on the Panel.
 * @author Cai Yeo
 * @author Caleb Shen
 * @version 1/21/2015
 * @since 6
 */
public class Display11 extends JPanel
{
    private JLabel label;
    private int current;
    protected ImageIcon createImageIcon(String path, String description)
    {
        java.net.URL imgURL = getClass().getResource(path);
        if(imgURL != null)
            return new ImageIcon(imgURL, description);
        else{
            System.err.println("Could not find file: " + path);
            return null;
        }
    }

    /**
     * Display11() constructs the display panel.
     */
    public Display11()
    {
        setLayout(new GridLayout(1, 1));
        current = 12;
        label = new JLabel(createImageIcon("stones12.jpg", "twelve stones"));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);
    }

    /**
     * receives instruction on what to
     * 
     * @param   x       integer input that determines which icon to output.
     * @return  icon    icon corresponding to the input, x.
     */
    private ImageIcon icon(int x)
    {
        if(x==1)
            return createImageIcon("stones1.jpg", "one stone");
        if(x==2)
            return createImageIcon("stones2.jpg", "two stones");
        if(x==3)
            return createImageIcon("stones3.jpg", "three stones");
        if(x==4)
            return createImageIcon("stones4.jpg", "four stones");
        if(x==5)
            return createImageIcon("stones5.jpg", "five stones");
        if(x==6)
            return createImageIcon("stones6.jpg", "six stones");
        if(x==7)
            return createImageIcon("stones7.jpg", "seven stones");
        if(x==8)
            return createImageIcon("stones8.jpg", "eight stones");
        if(x==9)
            return createImageIcon("stones9.jpg", "nine stones");
        if(x==10)
            return createImageIcon("stones10.jpg", "ten stones");
        if(x==11)
            return createImageIcon("stones11.jpg", "eleven stones");
        return null;
    }

    /**
     * "subtracts" one stone value from the existing image.
     * 
     * @return  value   1 if possible, 0 if not
     */
    public int one()
    {
        if(current>1)
        {
            label.setIcon(icon(current-1));
            current-=1;
            return 1;
        }
        return 0;
    }

    /**
     * "subtracts" two stones value from the existing image
     * 
     * @return  value   2 if possible, 0 if not
     */
    public int two()
    {
        if(current>2)
        {
            label.setIcon(icon(current-2));
            current-=2;
            return 2;
        }
        return 0;
    }

    /**
     * "subtracts" three stones value from the existing image
     * 
     * @return  value   3 if possible, 0 if not
     */
    public int three()
    {
        if(current>3)
        {
            label.setIcon(icon(current-3));
            current-=3;
            return 3;
        }
        return 0;
    }
}