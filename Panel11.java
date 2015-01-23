import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Panel11 places fields and buttons in the JPanel.
 * It also waits for the user input and updates the image, and scores.
 * @author Cai Yeo
 * @author Caleb Shen
 * @version 1/21/2015
 * @since 6
 */
public class Panel11 extends JPanel
{
    private Display11 display;
    private Scoreboard11 scoreboard;
    /**
     * The Panel11() constructor creates and places the "One", "Two", and the "Three" buttons.
     */
    public Panel11()
    {
        setLayout(new BorderLayout());

        scoreboard = new Scoreboard11();
        add(scoreboard, BorderLayout.NORTH);

        display = new Display11();
        add(display, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        add(panel, BorderLayout.SOUTH);
        
        JButton button1 = new JButton("One");
        button1.addActionListener(new Listener1());
        panel.add(button1);
        
        JButton button2 = new JButton("Two");
        button2.addActionListener(new Listener2());
        panel.add(button2);
        
        JButton button3 = new JButton("Three");
        button3.addActionListener(new Listener3());
        panel.add(button3);
    }
    /**
     * Listener for "One" button.
     */
    private class Listener1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            scoreboard.update(display.one());
        }
    }
    /**
     * Listener for "Two" button.
     */
    private class Listener2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            scoreboard.update(display.two());
        }
    }
    /**
     * Listener for "Three" button.
     */
    private class Listener3 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            scoreboard.update(display.three());
        }
    }
}