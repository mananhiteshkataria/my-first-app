package com.practise.factory;
import com.practise.DBOperation;
import com.practise.OracleDbImpl;

public class FactoryPattern2 {
	public static DBOperation getDBInstance() {
		return new OracleDbImpl();
	}
}
/*
 *  Using FactoryPattern2 in First App*/
