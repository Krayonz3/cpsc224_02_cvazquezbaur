/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.AbstractBorder;


/**
 *
 * @author jetor
 */
public class playerTwo extends JPanel
{
    private JTextField setName;
    private JLabel name;
    private JLabel wins;
    private JLabel losses;
    public JLabel inputWins;
    public JLabel inputLosses;
    int numWins = 0;
    
    public playerTwo()
    {
        setLayout(new GridLayout(3,2));
        
        JTextField setName = new JTextField("Player 2 (O): ", 8);
        setName.setEditable(true);
        
        name = new JLabel("Name: ");
        wins = new JLabel("Wins: ");
        losses = new JLabel("Losses: ");
        Object playerTwoWins = 0;
        
        inputWins = new JLabel (String.valueOf(playerTwoWins));
        Object playerOneWins = 0;
        inputLosses = new JLabel (String.valueOf(playerOneWins));
        
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
