# Tic Tac Toe Game

## Overview

This is a simple Tic Tac Toe game implemented using Java's Abstract Window Toolkit (AWT). The game allows two players to take turns clicking on a grid to place their X or O. The game checks for a winner or a draw after each turn and allows for resetting the game.

## Features

1. **Tic Tac Toe Grid:**
   - The game displays a 3x3 grid of buttons. Each button represents a cell in the Tic Tac Toe grid.
   - Players can click on the buttons to place their marks ("X" or "O").

2. **Player Turns:**
   - The game alternates turns between two players.
   - Player X always starts first. After Player X clicks a button, it becomes Player O's turn, and vice versa.
   - The current player's turn is displayed at the top of the game window.

3. **Check Winner:**
   - After each turn, the game checks if there is a winner.
   - A player wins by placing three of their marks in a horizontal, vertical, or diagonal row.
   - If a player wins, a message is displayed indicating the winner, and further moves are disabled.

4. **Check Draw:**
   - The game checks for a draw condition when all cells are filled and there is no winner.
   - If the game ends in a draw, a message is displayed indicating the draw.

5. **Reset Game:**
   - A "New Game" button is provided at the bottom of the game window.
   - Clicking the "New Game" button resets the game, clearing all marks from the grid and starting a new game with Player X's turn.

6. **Visual Feedback:**
   - The background color of each cell changes when a player places their mark.
   - "X" marks are highlighted with a cyan background.
   - "O" marks are highlighted with a pink background.

## Instructions to Run the Game

1. **Ensure Java is Installed:**
   - Make sure you have the Java Development Kit (JDK) installed on your computer. You can download it from [Oracle's official site](https://www.oracle.com/java/technologies/javase-downloads.html).

2. **Compile the Code:**
   - Save the provided Java code in a file named `TicTacToe.java`.
   - Open a terminal or command prompt.
   - Navigate to the directory where you saved `TicTacToe.java`.
   - Compile the code using the following command:
     ```sh
     javac TicTacToe.java
     ```

3. **Run the Game:**
   - After compiling, run the game using the following command:
     ```sh
     java TicTacToe
     ```

4. **Playing the Game:**
   - The game window will open, displaying the 3x3 grid.
   - Click on any empty cell to place your mark.
   - Alternate turns between Player X and Player O by clicking on empty cells.
   - The game will display a message when there is a winner or if the game ends in a draw.
   - To start a new game, click the "New Game" button at the bottom of the window.

## Author

This Tic Tac Toe game was created as an example project to demonstrate the use of Java AWT for building simple GUI applications.
