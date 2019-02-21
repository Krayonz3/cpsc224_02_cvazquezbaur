/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author carlo_000
 */
public class WindowGUI extends JFrame {

    private JPanel buttonPanel;
    private JButton NewGame;
    private JButton Reset;
    private JButton exitButton;
    private TicTacToePanel theGame;
    private playerPanel playerOne;
    private playerPanel playerTwo;
    private final int WINDOW_HEIGHT = 500;
    private final int WINDOW_WIDTH = 500;
    
    
    public void TicTacToeWindowGUI() {
       setTitle("Tic-Tac-Toe");
       setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new BorderLayout());
       
       theGame = new TicTacToePanel();
       playerOne = new playerPanel();
       playerTwo = new playerPanel();
       
       buildButtonPanel();
       
       add(playerOne, BorderLayout.NORTH);
       add(playerTwo, BorderLayout.NORTH);
       add(theGame, BorderLayout.CENTER);
       add(buttonPanel, BorderLayout.SOUTH);
       
       pack();
       setVisible(true);
       
    }
    
    private void buildButtonPanel(){
        buttonPanel = new JPanel();
        
        NewGame = new JButton("New Game");
        Reset = new JButton("Reset");
        exitButton = new JButton("Exit");
        
        NewGame.addActionListener(new newGameListener());
        Reset.addActionListener(new resetListener());
        exitButton.addActionListener(new exitButtonListener());
        
        buttonPanel.add(NewGame);
        buttonPanel.add(Reset);
        buttonPanel.add(exitButton);        
    }
    
    private class newGameListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            
        } 
    }
    
    private class resetListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String option;
            option = JOptionPane.YES_NO_OPTION;
        } 
    }
    
    private class exitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        } 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
