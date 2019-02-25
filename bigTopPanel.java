/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author jetor
 */
public class bigTopPanel extends JPanel
{
    public playerOne p1 = new playerOne();
    public playerTwo p2 = new playerTwo();
    public int playerOneWins;
    public int playerTwoWins;
    
    
    public bigTopPanel()
    {                    
        add(p1, BorderLayout.WEST);
        add(p2, BorderLayout.EAST);
    }
    
    public void resetInfo(){
        playerOneWins = 0;
        playerTwoWins = 0;
    }
    public int getPlayerOneWins(){
        int playerOneWins;
        playerOneWins = p1.getWins();
        return playerOneWins;
    }
    public int getPlayerTwoWins(){
        int playerTwoWins;
        playerTwoWins = p2.getWins();
        return playerTwoWins;
    }
    
    public static void main(String[] args){
        new bigTopPanel();
    }
}