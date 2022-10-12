
/**
 * Write a description of class Minesweeper here.
 * 
 * @author Dylan Palmer
 * @version 10.11.22
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperBoard{
    Cell[] board;
    int rows;
    int columns;
    int mines;
    public MinesweeperBoard(int row, int col, int mine){
        //Put the constructor here.
        rows = row;
        columns = col;
        board = new Cell[rows*columns];

        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        try{
            addMines(mine);
        } catch (Exception e){
            System.out.println(e);
        }
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public MinesweeperBoard(){
        this(10,10,10);
    }

    public void addMines(int mines) throws Exception{
        for (int i = -1; i < mines; i++){
            int psn = (int)(Math.random() *(rows*columns));
            if(board[psn].isMine()){
                i--;
            } else {
                board[psn].setMine();
            }
        }
    }

    public void addNums(){
        for(int i = 0; i < rows*columns; i++){
            if(!board[i]
        }
    }

    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        for(int i = 0; i < rows*columns; i++){
            if(i%columns == 0){
                System.out.println();
            } else if(board[i].getValue() == 9){
                System.out.print("X");
            } else {
                System.out.print(board[i].getValue());
            }
        }
    }

    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i< rows*columns; i++){
            board[i]= new Cell();
            panel.add(board[i].getButton());
        }
        return panel;
    }

}
