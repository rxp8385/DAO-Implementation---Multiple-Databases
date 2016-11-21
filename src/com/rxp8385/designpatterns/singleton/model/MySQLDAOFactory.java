package com.rxp8385.designpatterns.singleton.model;

public class MySQLDAOFactory extends DAOFactory {
	/* (non-Javadoc)
	 * @see com.rxp8385.designpatterns.singleton.model.DAOFactory#getPersonDAO()
	 */
	@Override
	public PersonDAO getPersonDAO (){
		return new MySQLPersonDAO();
	}
	
	/* (non-Javadoc)
	 * @see com.rxp8385.designpatterns.singleton.model.DAOFactory#getLogDAO()
	 */
	@Override
	public LogDAO getLogDAO() {
		return new MSQLLogDAO();
	}

}
