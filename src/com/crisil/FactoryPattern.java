package com.crisil;

public class FactoryPattern {
public static DBOperation getDBInstance(){
//	return new OracleDbImpl();
	return new MySqlDbImpl();
	}
}
