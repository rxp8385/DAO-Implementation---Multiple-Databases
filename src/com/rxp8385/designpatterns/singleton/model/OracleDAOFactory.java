package com.rxp8385.designpatterns.singleton.model;

public class OracleDAOFactory extends DAOFactory {

	@Override
	public PersonDAO getPersonDAO() {
		
		return new OraclePersonDAO();
	}

	@Override
	public LogDAO getLogDAO() {
		
		return new OracleLogDAO();
	}

}
