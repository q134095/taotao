package login;

import connection.ConnByJDBC;

public class LoginDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnByJDBC con = new ConnByJDBC();
		con.insertData();
	}

}
