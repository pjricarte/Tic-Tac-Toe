//Ricarte, Patrice Jessie P.
//ITCC 11.1 B - Event Driven Programming
//Tic-Tac-Toe is fun!

import java.awt.*;
import java.awt.event.*;

public class App extends Frame implements ActionListener {
    private Button[] buttons = new Button[9];
    private boolean playerXTurn = true;
    private Label statusLabel = new Label("Player X's Turn", Label.CENTER);

    public App() {
    
        setTitle("Tic Tac Toe");
        setSize(400, 450);
        setLayout(new BorderLayout());

        
        Panel gridPanel = new Panel();
        gridPanel.setLayout(new GridLayout(3, 3));

        
        for (int i = 0; i < 9; i++) {
            buttons[i] = new Button("");
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 60));
            buttons[i].addActionListener(this);
            gridPanel.add(buttons[i]);
        }

        
        add(gridPanel, BorderLayout.CENTER);

       
        statusLabel.setFont(new Font("Arial", Font.BOLD, 20)); 
        add(statusLabel, BorderLayout.NORTH);

        
        Button newGameButton = new Button("New Game");
        newGameButton.setFont(new Font("Arial", Font.PLAIN, 20)); 
        newGameButton.addActionListener(e -> resetGame());
        add(newGameButton, BorderLayout.SOUTH);

        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button clickedButton = (Button) e.getSource();

        if (!clickedButton.getLabel().equals("")) {
            return; // Button already clicked
        }

        if (playerXTurn) {
            clickedButton.setLabel("X");
            clickedButton.setBackground(Color.CYAN); 
            statusLabel.setText("Player O's Turn");
        } else {
            clickedButton.setLabel("O");
            clickedButton.setBackground(Color.PINK); 
            statusLabel.setText("Player X's Turn");
        }

        playerXTurn = !playerXTurn;

        if (checkWinner()) {
            statusLabel.setText((playerXTurn ? "Player O" : "Player X") + " Wins!");
            disableButtons();
        } else if (isDraw()) {
            statusLabel.setText("It's a Draw!");
        }
    }

    private boolean checkWinner() {
        String[][] board = new String[3][3];
        for (int i = 0; i < 9; i++) {
            board[i / 3][i % 3] = buttons[i].getLabel();
        }

        for (int i = 0; i < 3; i++) {
            if (!board[i][0].equals("") && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                return true;
            }
            if (!board[0][i].equals("") && board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
                return true;
            }
        }

        if (!board[0][0].equals("") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return true;
        }
        if (!board[0][2].equals("") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            return true;
        }

        return false;
    }

    private boolean isDraw() {
        for (Button button : buttons) {
            if (button.getLabel().equals("")) {
                return false;
            }
        }
        return true;
    }

    private void disableButtons() {
        for (Button button : buttons) {
            button.setEnabled(false);
        }
    }

    private void resetGame() {
        for (Button button : buttons) {
            button.setLabel("");
            button.setBackground(null);
            button.setEnabled(true);
        }
        playerXTurn = true;
        statusLabel.setText("Player X's Turn");
    }

    public static void main(String[] args) {
        new App();
    }
}