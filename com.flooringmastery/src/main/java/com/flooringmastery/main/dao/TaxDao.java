package com.flooringmastery.main.dao;

import java.util.List;
import java.util.Map;

import com.flooringmastery.main.dto.Tax;

public interface TaxDao {

	 //state will be the state abbreviation such as PA, NY, CA, TX
	
	Tax addState(String state, Tax taxInfo);
	
	Tax removeState(String state);
	
	Tax editTaxRate(String state);
	
	Tax getState(String state);
	
	List<Tax> getAllStates();
	
	
	/*we will also define private methods to our Impl class which does marshalling and unmarshalling 
	 * of tax info from a text file
	*/
	
}
