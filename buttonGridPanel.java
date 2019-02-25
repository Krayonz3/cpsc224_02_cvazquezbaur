package tictactoe;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author jetor
 */
public class buttonGridPanel extends JPanel
{
    private JPanel gridPanel;
    private int buttonPressCount = 0;
    private JButton[][] buttonGrid = new JButton[3][3];

    public buttonGridPanel()
    {
        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3,3));
        
        ButtonListener button = new ButtonListener();
        
        for (int row = 0 ; row < buttonGrid.length; row++)
        {
            for (int col = 0; col < buttonGrid[row].length; col++)
            {
                JButton btn = new JButton(" ");
                
                btn.setFont(btn.getFont().deriveFont(Font.BOLD, 24));  // set font size and type
                
                btn.addActionListener(button);
                
                gridPanel.add(btn);
                buttonGrid[row][col] = btn;
            }
            
        }
    }
     
    private class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            JButton btn = (JButton)e.getSource();  // get pressed button
            String text = btn.getText().trim();  // get its text
            if (text.isEmpty())  // if text is blank
            {
                int rowPressed = -1;
                int colPressed = -1;

                for (int row = 0; row < buttonGrid.length; row++)
                {
                    for (int col = 0; col < buttonGrid[row].length; col++)
                    {
                        if (btn == buttonGrid[row][col])
                        {
                            rowPressed = row;
                            colPressed = col;
                        }
                    }
                }
                // make the button text alternate between X and O
                text = (buttonPressCount % 2 == 0) ? "X" : "O";
                btn.setText(text);  // set the button's text
                buttonPressCount++;
            }
            //int winner;
            //winner = checkWinner(buttonGrid);
            
        }
    }
    
    private static int checkWinner(JButton buttonGrid[][]){
        if ((buttonGrid[0][0] == buttonGrid[0][1] && buttonGrid[0][1] == buttonGrid[0][2]) && (buttonGrid[0][0].getText() == "X" || buttonGrid[0][0].getText() == "O")){
            if (buttonGrid[0][0].getText() == "X")
                return 1;
            else 
                return 2;
        } else if (buttonGrid[1][0] == buttonGrid[1][1] && buttonGrid[1][1] == buttonGrid[1][2]){            
            if (buttonGrid[1][0].getText() == "X")
                return 1;
            else 
                return 2;
        } else if (buttonGrid[2][0] == buttonGrid[2][1] && buttonGrid[2][1] == buttonGrid[2][2]){
            if (buttonGrid[2][0].getText() == "X")
                return 1;
            else 
                return 2;
        } else if (buttonGrid[0][0] == buttonGrid[1][0] && buttonGrid[1][0] == buttonGrid[2][0]){
            if (buttonGrid[0][0].getText() == "X")
                return 1;
            else 
                return 2;
        } else if (buttonGrid[0][1] == buttonGrid[1][1] && buttonGrid[1][1] == buttonGrid[2][1]){
            if (buttonGrid[0][1].getText() == "X")
                return 1;
            else 
                return 2;
        } else if (buttonGrid[0][2] == buttonGrid[1][2] && buttonGrid[1][2] == buttonGrid[2][2]){
            if (buttonGrid[0][2].getText() == "X")
                return 1;
            else 
                return 2;
        } else if (buttonGrid[0][0] == buttonGrid[1][0] && buttonGrid[1][0] == buttonGrid[2][0]){
            if (buttonGrid[0][0].getText() == "X")
                return 1;
            else 
                return 2;
        } else if (buttonGrid[0][0] == buttonGrid[1][1] && buttonGrid[1][1] == buttonGrid[2][2]){
            if (buttonGrid[0][0].getText() == "X")
                return 1;
            else 
                return 2;
        } else if (buttonGrid[0][2] == buttonGrid[1][1] && buttonGrid[1][1] == buttonGrid[2][0]){
            if (buttonGrid[0][2].getText() == "X")
                return 1;
            else 
                return 2;
        }
        else 
            return 0;
    }/*
    public static void main (String[] args)
    {
        new buttonGridPanel();
    }
    */
}
