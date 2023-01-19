package com.practise;

public class FactoryPattern {
public static DBOperation getDBInstance(){
//	return new OracleDbImpl();
	return new MySqlDbImpl();
	}
}
