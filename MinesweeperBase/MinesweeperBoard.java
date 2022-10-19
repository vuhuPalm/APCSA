
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
    public MinesweeperBoard(int row, int col, int mines){
        //Put the constructor here.
        rows = row;
        columns = col;
        board = new Cell[rows*columns];

        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        try{
            addMines(mines);
        } catch (Exception e){
            System.out.println(e);
        }
        addNums();
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public MinesweeperBoard(){
        this(10,10,10);
    }

    public void addMines(int mines) throws Exception{
        for (int i = 0; i < mines; i++){
            int psn = (int)(Math.random() *(rows*columns));
            if(board[psn].isMine()){
                i--;
            } else {
                board[psn].setMine();
            }
        }
    }

    public void addNums(){
        for(int i = 0; i < (rows*columns); i++){
            int count = 0;
            if(!board[i].isMine()){
                if(i+1 < (rows*columns) && i%columns != columns-1 && board[i+1].isMine()){
                    count++;
                } //right
                if(i-1 >= 0 && i%columns != 0 && board[i-1].isMine()){
                    count++;
                } //left
                if(i-columns > 0 && board[i-columns].isMine()){
                    count++;
                } //up
                if(i+columns < rows*columns && board[i+columns].isMine()){
                    count++;
                } //down
                if(i-columns > 0 && i%columns != columns-1 && board[i-columns+1].isMine()){
                    count++;
                } //down left
                if(i+columns < rows*columns && i%columns != 0 && board[i+columns-1].isMine()){
                    count++;
                } //up right
                if(i-columns > 0 && i%columns != 0 && board[i-columns-1].isMine()){
                    count++;
                } //down right
                if(i+columns < rows*columns && i%columns != columns-1 && board[i+columns+1].isMine()){
                    count++;
                } //up left
            } 
            board[i].changeValue(count);
        }
    }

    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        int x = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(board[x].isMine()){
                    System.out.print(" X ");
                } else {
                    System.out.print(" "+board[x].getValue()+" ");
                }
                x++;
            }
            System.out.println();
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
