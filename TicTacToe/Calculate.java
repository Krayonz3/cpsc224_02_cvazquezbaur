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
public class Calculate {
    
    public void checkWin(int row, int col)
    {
       try {
        if (buttons[0][2].getText()==buttons[1][2].getText()&& buttons[1][2].getText()==buttons[2][2].getText()&& buttons[2][2].getText()==buttons[0][2].getText()&& buttons[1][2].getText()!="")
        {
          gameWon = true;
          WhoseTurn = 0;
          System.out.println(buttons[1][2].getText()+ " wins!!!");
          JOptionPane.showMessageDialog(frame, buttons[1][2].getText()+ " wins!!!");
        }
        if (buttons[0][1].getText()==buttons[1][1].getText()&& buttons[1][1].getText()==buttons[2][1].getText()&& buttons[2][1].getText()==buttons[0][1].getText()&& buttons[1][1].getText()!="")
        {
          gameWon = true;
          WhoseTurn = 0;
          System.out.println(buttons[1][1].getText()+ " wins!!!");
          JOptionPane.showMessageDialog(frame, buttons[1][1].getText()+ " wins!!!");
        }
        if (buttons[0][0].getText()==buttons[1][0].getText()&& buttons[1][0].getText()==buttons[2][0].getText()&& buttons[2][0].getText()==buttons[0][0].getText()&& buttons[1][0].getText()!="")
        {
          gameWon = true;
          WhoseTurn = 0;
          System.out.println(buttons[1][0].getText()+ " wins!!!");
          JOptionPane.showMessageDialog(frame, buttons[1][0].getText()+ " wins!!!");
        }
        if (buttons[2][0].getText()==buttons[2][1].getText()&& buttons[2][1].getText()==buttons[2][2].getText()&& buttons[2][2].getText()==buttons[2][0].getText()&& buttons[2][1].getText()!="")
        {
          gameWon = true;
          WhoseTurn = 0;
          System.out.println(buttons[2][1].getText()+ " wins!!!");
          JOptionPane.showMessageDialog(frame, buttons[2][1].getText()+ " wins!!!");
        }
        if (buttons[1][0].getText()==buttons[1][1].getText()&& buttons[1][1].getText()==buttons[1][2].getText()&& buttons[1][2].getText()==buttons[1][0].getText()&& buttons[1][1].getText()!="")
        {
          gameWon = true;
          WhoseTurn = 0;
          System.out.println(buttons[1][1].getText()+ " wins!!!");
          JOptionPane.showMessageDialog(frame, buttons[1][1].getText()+ " wins!!!");
        }
        if (buttons[0][0].getText()==buttons[0][1].getText()&& buttons[0][1].getText()==buttons[0][2].getText()&& buttons[0][2].getText()==buttons[0][0].getText()&& buttons[0][1].getText()!="")
        {
          gameWon = true;
          WhoseTurn = 0;
          System.out.println(buttons[0][1].getText()+ " wins!!!");
          JOptionPane.showMessageDialog(frame, buttons[0][1].getText()+ " wins!!!");
        }
       if (buttons[0][0].getText()==buttons[1][1].getText()&& buttons[1][1].getText()==buttons[2][2].getText()&& buttons[2][2].getText()==buttons[0][0].getText()&& buttons[1][1].getText()!="")
       {
          gameWon = true;
          WhoseTurn = 0;
          System.out.println(buttons[1][1].getText()+ " wins!!!");
          JOptionPane.showMessageDialog(frame, buttons[1][1].getText()+ " wins!!!");
       }
       if (buttons[0][2].getText()==buttons[1][1].getText()&& buttons[1][1].getText()==buttons[2][0].getText()&& buttons[2][0].getText()==buttons[0][2].getText()&& buttons[1][1].getText()!="")
       {
          gameWon = true;
          WhoseTurn = 0;
          System.out.println(buttons[1][1].getText()+ " wins!!!");
          JOptionPane.showMessageDialog(frame, buttons[1][1].getText()+ " wins!!!");
       }
      }
      catch(Exception e) 
      {       
          gameWon = true;
          WhoseTurn = 0;
          System.out.println("Stalemate");
          JOptionPane.showMessageDialog(frame, "Stalemate");
      }
    }

}
