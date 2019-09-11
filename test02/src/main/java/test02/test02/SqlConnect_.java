package test02.test02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlConnect_ {

	Connection con = null;
	PreparedStatement pstmt = null;//? 1234
	ResultSet rs = null;//select할때 결과 담는
	
	public SqlConnect_() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//동적 classload(oracle driver호출
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","1234");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Board selectBoardTable() {
		StringBuffer sql = new StringBuffer("SELECT * FROM BOARD_TB");
		
		Board board = new Board();
		
		try {
			pstmt = con.prepareStatement(sql.toString());
			
			//pstmt.setString(1, "name");
			
			
			
			//pstmt.addBatch();//이거는 배치
			//pstmt.clearParameters();//닫지 않고 비우기
			
			//pstmt.executeBatch();//배치한걸 한꺼번에 실행
			//pstmt.executeUpdate();//이가ㅓ랑 머가다르지
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				board.setSub_no(rs.getInt("SUB_NO"));			//1
				board.setSubject(rs.getString("SUBJECT"));		//2
				board.setUser_id(rs.getString("USER_ID"));		//3
				board.setUser_pw(rs.getString("USER_PW"));		//4
				board.setWrite_date(rs.getString("WRITE_DT"));	//5
				board.setContent("CONTENTS");					//6
				
			}
			//System.out.println(board.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return board;
		
	}
	
	
	public void insertBoard (Board board) {
		StringBuffer sql = new StringBuffer("INSERT INTO BOARD_TB VALUES (SEQ_BOARD.NEXTVAL,?,?,?,?,?)");
		
		try {
			pstmt = con.prepareStatement(sql.toString());
			
			//pstmt.setInt(1, board.getSub_no());//시퀀스써따ㅅㅂ
			pstmt.setString(1, board.getSubject());
			pstmt.setString(2, board.getUser_id());
			pstmt.setString(3, board.getUser_pw());
			pstmt.setString(4, board.getWrite_date());
			pstmt.setString(5, board.getContent());
			
			pstmt.executeQuery();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateBoard(String content,String id , String pw) {
		String sql1 = "UPDATE BOARD_TB SET CONTENTS = ?  WHERE USER_ID = ? AND USER_PW = ?";
		try {
			pstmt = con.prepareStatement(sql1);
			pstmt.setString(1,  content);
			pstmt.setString(2, id);
			pstmt.setString(3, pw);
			pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(1);
		
		
	}
	
}
