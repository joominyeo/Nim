import javax.swing.*;
import java.awt.*;
/**
 * Scoreboard11 updates Panel11 and updates labels.
 * @author Cai Yeo
 * @author Caleb Shen
 * @version 1/21/2015
 * @since 6
 */
public class Scoreboard11 extends JPanel
{
    private JLabel label1, label2, label3;
    private int total, one, two;
    private boolean leftTurn;
    /**
     * Scoreboard11() places stat labels on the upper part of the panel.
     */
    public Scoreboard11()
    {
        setLayout(new GridLayout(1, 5));
        total=12;
        leftTurn=true;
        add(new JLabel("One: ", SwingConstants.RIGHT));
        label1 = new JLabel("0");
        label1.setHorizontalAlignment(SwingConstants.LEFT);
        add(label1);
        label1.setBackground(Color.green);
        label2 = new JLabel("Nim");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
        add(label2);
        add(new JLabel("Two: ", SwingConstants.RIGHT));
        label3 = new JLabel("0");
        label3.setHorizontalAlignment(SwingConstants.LEFT);
        add(label3);
    }

    /**
     * Updates the stat panel on the upper part of the panel.
     * The update is dependant on the input of the .
     * 
     * @param   int     integer value that allows the panel to update the "stones-taken" accordingly.
     */
    public void update(int n) //n is an integer
    {
        if(n==1)
        {
            if(leftTurn)
            {
                one+=1;
                label1.setText(""+one);
                label1.setBackground(new JButton().getBackground());
                label3.setBackground(Color.green);
            }
            else{
                two+=1;
                label3.setText(""+two);
                label3.setBackground(new JButton().getBackground());
                label1.setBackground(Color.green);
            }
            total-=1;
        } 
        if(n==2)
        {
            if(leftTurn)
            {
                one+=2;
                label1.setText(""+one);
                label1.setBackground(new JButton().getBackground());
                label3.setBackground(Color.green);
            }
            else{
                two+=2;
                label3.setText(""+two);
                label3.setBackground(new JButton().getBackground());
                label1.setBackground(Color.green);
            }
            total-=2;
        }
        if(n==3)
        {
            if(leftTurn)
            {
                one+=3;
                label1.setText(""+one);
                label1.setBackground(new JButton().getBackground());
                label3.setBackground(Color.green);
            }
            else{
                two+=3;
                label3.setText(""+two);
                label3.setBackground(new JButton().getBackground());
                label1.setBackground(Color.green);
            }
            total-=3;
        }
        if(leftTurn)
            leftTurn=false;
        else
            leftTurn=true;
        if(total==1)
        {
            if(leftTurn)
            label2.setText("Nim - Player Two Wins!");
            else
            label2.setText("Nim - Player One Wins!");
            total=0;
        }
    }
}