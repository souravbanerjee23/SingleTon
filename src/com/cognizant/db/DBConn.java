package com.cognizant.db;

public class DBConn {
	private static DBConn instance = new DBConn();

	private DBConn() {

	}

	public static DBConn getInstance() {
		return instance;
	}

	public void display() {
		System.out.println("New Object of DBConn Class is created");
	}

}
