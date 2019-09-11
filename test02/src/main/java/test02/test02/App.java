package test02.test02;

import java.util.Scanner;

public class App 
{
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	SqlConnect_ sql = new SqlConnect_();
        System.out.println( "Hello World!" );
        
        //insert //create
        Board board = new Board("타이틀","아디","asdf","20192844","constoetenraerastasertqlkf");
        sql.insertBoard(board);
        
        //read
        System.out.println(sql.selectBoardTable().toString());
        
        //update
        int num = sc.nextInt();
        sql.updateBoard("바꿈","아디","asdf");
        
        //delete
        
        
    }
}
