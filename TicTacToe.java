package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.border.Border;
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


public class TicTacToe extends JFrame 
{
    private JPanel buttonPanel;
    private JPanel gridPanel;
    public JPanel bigTopPanel;
    //private JPanel announcement;
    private JButton NewGame;
    private JButton Reset;
   // private JButton exitButton;
    private JLabel Command;
    public int playerOneWins = 0;
    public int playerTwoWins = 0;
    
    private final int WINDOW_HEIGHT = 500;
    private final int WINDOW_WIDTH = 500;
    private JButton[][] buttonGrid = new JButton[3][3];
    private int buttonPressCount = 1;

    
    public TicTacToe()
    {
       setTitle("Tic-Tac-Toe");
       setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new BorderLayout());    

       
             
       bigTopPanel = new bigTopPanel();
       gridPanel = new buttonGridPanel();
       buttonPanel = new lowerButtonPanel();
       
       add(bigTopPanel, BorderLayout.NORTH);
      
       add(gridPanel, BorderLayout.CENTER);
       
       add(buttonPanel, BorderLayout.SOUTH);

       //pack();
       setVisible(true);
    }
    
    public void addPlayerOneWin(){
        playerOneWins++;
    }
    
    public void addPlayerTwoWin(){
        playerTwoWins++;
    }
    /*
    public void changeStats(){
        bigTopPanel.p1.inputWins.setText(String.valueOf(playerOneWins));
        bigTopPanel.p2.inputWins.setText(String.valueOf(playerTwoWins));
        bigTopPanel.p1.inputLosses.setText(String.valueOf(playerOneWins));
        bigTopPanel.p2.inputLosses.setText(String.valueOf(playerTwoWins));
    }
    */
    public int getTurn(){
        int turn;
        turn = buttonPressCount % 2;
        if (turn == 1)
            return 1;
        else 
            return 2;
    }
    
    public void nextTurn(){
        //gridPanel.changeTurn();
    }
    
    public class lowerButtonPanel extends JPanel
{
    private JPanel buttonPanel;
    private JButton NewGame;
    private JButton Reset;
    private JButton exitButton;
    public JLabel announcement;
    
    
    public lowerButtonPanel()
    {
        setLayout(new BorderLayout());
        
        makePanel();
        
        announcement = new JLabel("Welcome to Tic-Tac-Toe!");
        
        Border border = BorderFactory.createLineBorder(Color.BLUE, 1);
        
        announcement.setBorder(border);
        
        add(buttonPanel, BorderLayout.CENTER);
        add(announcement, BorderLayout.SOUTH);               
    }
    
    private void makePanel(){
        buttonPanel = new JPanel();
        
        NewGame = new JButton("New Game");
        Reset = new JButton("Reset");
        exitButton = new JButton("Exit");
        
        NewGame.addActionListener(new newGameListener());
        Reset.addActionListener(new resetButtonListener());
        exitButton.addActionListener(new exitButtonListener());
        
        buttonPanel.add(NewGame);
        buttonPanel.add(Reset);
        buttonPanel.add(exitButton); 
    }
    
    private class newGameListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
          //gridPanel.reset();
          
            
            
        }
    }

    private class resetButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
           int resetOption = JOptionPane.YES_NO_OPTION;
           int selection = JOptionPane.showConfirmDialog(null, "Are you sure?", "Sure?", resetOption);
           
           if(selection == JOptionPane.YES_OPTION){
               
           }
        }
    }
    private class exitButtonListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        } 
    }
    
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
    

    public static void main(String[] args) 
    {
        new TicTacToe();
    }
    

    }
    }
} 

    

