
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

public class TwoDMinesweeper{
    Cell2[][] board;
    int rows;
    int columns;
    public TwoDMinesweeper(int row, int col, int mines){
        //Put the constructor here.
        rows = row;
        columns = col;
        board = new Cell2[rows][columns];

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

    public TwoDMinesweeper(){
        this(10,10,10);
    }

    public void addMines(int mines) throws Exception{
        for (int i = 0; i < mines; i++){
            int psn1 = (int)(Math.random() *(rows));
            int psn2 = (int)(Math.random() *(columns));
            if(board[psn1][psn2].isMine()){
                i--;
            } else {
                board[psn1][psn2].setMine();
            }
        }
    }

    public void addNums(){
        for(int i = 0; i < (rows); i++){
            for (int j = 0; j < columns; j++){
                int count = 0;
                if(!board[i][j].isMine()){
                    if(i-1 >= 0 && board[i-1][j].isMine()){
                        count++;
                    } //up
                    if(i+1 < rows && board[i+1][j].isMine()){
                        count++;
                    } //down
                    if(j-1 >= 0 && board[i][j-1].isMine()){
                        count++;
                    } //left
                    if(j+1 < columns && board[i][j+1].isMine()){
                        count++;
                    } //right
                    if(i-1 >= 0 && j-1 >= 0 && board[i-1][j-1].isMine()){
                        count++;
                    } //up left
                    if(i-1 >= 0 && j+1 < columns && board[i-1][j+1].isMine()){
                        count++;
                    } //up right
                    if(i+1 < rows && j-1 >=0 && board[i+1][j-1].isMine()){
                        count++;
                    } //down left
                    if(i+1 < rows && j+1 < columns && board[i+1][j+1].isMine()){
                        count++;
                    } //down right
                } 
                board[i][j].changeValue(count);
            }
        }
    }

    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(board[i][j].isMine()){
                    System.out.print(" X ");
                } else {
                    System.out.print(" "+board[i][j].getValue()+" ");
                }
            }
            System.out.println();
        }
    }

    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i< rows; i++){
            for(int j = 0; j < columns; j++){
                board[i][j]= new Cell2();
                panel.add(board[i][j].getButton());
            }
        }
        return panel;
    }

}
