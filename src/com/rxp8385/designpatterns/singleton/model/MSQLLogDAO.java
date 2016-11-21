package com.rxp8385.designpatterns.singleton.model;

import java.util.List;

public class MSQLLogDAO implements LogDAO {
	
	/* (non-Javadoc)
	 * @see com.rxp8385.designpatterns.singleton.model.LogDAO#addEntry(java.lang.String)
	 */
	@Override
	public void addEntry(String message) {
		//Adds current time and a log message to the database.
	}
	
	/* (non-Javadoc)
	 * @see com.rxp8385.designpatterns.singleton.model.LogDAO#getEntries(int)
	 */
	@Override
	public List<Log> getEntries (int number){
		
		//Returns a list of entries in the database log.
		return null;
	}

}
