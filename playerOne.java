package tictactoe;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.AbstractBorder;

/**
 *
 * @author jetor
 */
public class playerOne extends JPanel
{
    private JTextField setName;
    private JLabel name;
    private JLabel wins;
    private JLabel losses;
    public JLabel inputWins;
    public JLabel inputLosses;
    int numWins;
    
    public playerOne()
    {
        setLayout(new GridLayout(3,2));
        
        JTextField setName = new JTextField("Player 1 (X): ", 8);
        setName.setEditable(true);
        
        name = new JLabel("Name: ");
        wins = new JLabel("Wins: ");
        losses = new JLabel("Losses: ");
        Object playerOneWins = 0;
        
        inputWins = new JLabel (String.valueOf(playerOneWins));
        Object playerTwoWins = 0;
        inputLosses = new JLabel (String.valueOf(playerTwoWins));
        
        //inputWins = new JLabel
        
        add(name);
        add(setName);
        add(wins);
        add(inputWins);
        add(losses);
        add(inputLosses);
    }
    
    public int getWins(){
        
        return numWins;
    }
    
}
