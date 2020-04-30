package com.cognizant.main;

import com.cognizant.db.DBConn;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConn object = DBConn.getInstance();
		object.display();

	}

}
