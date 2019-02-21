package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jetor
 */
public class Game_Display implements ActionListener
{    
    JButton[][] buttons = new JButton[3][3]; 
    JFrame frame = new JFrame("TicTacToe");
    JButton start = new JButton("Start");
    JButton reset = new JButton("Reset");
    JOptionPane turn;
    int moveCounter = 9;
    boolean gameWon = false;
    int WhoseTurn = 1;
    
    public void initialize()
    {
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel menu = new JPanel(new BorderLayout());
        JPanel game = new JPanel(new GridLayout(3,3));
        
        frame.add(mainPanel);
        
        game.setPreferredSize(new Dimension(300,300));
        
        start.addActionListener(new Game_Display());
        reset.addActionListener(new Game_Display());
        
        for(int i = 0; i < 3; i++)                      //Create grid of buttons for tic tac toe game
         {
          for(int j = 0; j < 3; j++) 
            {

             buttons[i][j] = new JButton();                //Instantiating buttons 
             buttons[i][j].setText("");
             buttons[i][j].setVisible(true);

             game.add(buttons[i][j]); 
             buttons[i][j].addActionListener(new Game_Display());        //Adding response event to buttons
            }
         }

    }
    
    public void actionPerformed (ActionEvent a)
    {
       //Display X's or O's on the buttons
       if(gameWon == false)
       {
       if(a.getSource() == buttons[0][0])          //Checking which button is pressed
         {
           buttons[0][0].setText("X");
           buttons[0][0].setEnabled(false);
           WhoseTurn = 2;
           moveCounter--;
           //compTurn(moveCounter);
           //checkWin(0,0);
         } 
       else if(a.getSource() == buttons[0][1])
         {
           buttons[0][1].setText("X");
           buttons[0][1].setEnabled(false);
           WhoseTurn = 2;
           moveCounter--;
           //compTurn(moveCounter);
           //checkWin(0,1);
         } 
       else if(a.getSource() == buttons[1][0])
        {
          buttons[1][0].setText("X");  
          buttons[1][0].setEnabled(false);
          WhoseTurn = 2;
          moveCounter--;
          //compTurn(moveCounter);
          //checkWin(1,0);
        } 
       else if(a.getSource() == buttons[1][1])
        {
          buttons[1][1].setText("X");
          buttons[1][1].setEnabled(false);
          WhoseTurn = 2;
          moveCounter--;
          //compTurn(moveCounter);
          //checkWin(1,1);
        }
       else if(a.getSource() == buttons[1][2])
        {
          buttons[1][2].setText("X");
          buttons[1][2].setEnabled(false);
          WhoseTurn = 2;
          moveCounter--;
          //compTurn(moveCounter); 
          //checkWin(1,2);
        } 
       else if(a.getSource() == buttons[2][2])
        {
         buttons[2][2].setText("X");
         buttons[2][2].setEnabled(false);
         WhoseTurn = 2;
         moveCounter--;
         //compTurn(moveCounter);
         //checkWin(2,2);
        } 
       else if(a.getSource() == buttons[0][2])
        {
         buttons[0][2].setText("X");
         buttons[0][2].setEnabled(false);
         WhoseTurn = 2;
         moveCounter--;
         //compTurn(moveCounter);
         //checkWin(0,2);
        }
       else if(a.getSource() == buttons[2][1])
        {
         buttons[2][1].setText("X");
         buttons[2][1].setEnabled(false);
         WhoseTurn = 2;
         moveCounter--;
         //compTurn(moveCounter);
         //checkWin(2,1);
        }
       else if(a.getSource() == buttons[2][0])
        {
         buttons[2][0].setText("X");
         buttons[2][0].setEnabled(false);
         WhoseTurn = 2;
         moveCounter--;
         //compTurn(moveCounter);
         //checkWin(2,0);
        }

        }

    }
}
