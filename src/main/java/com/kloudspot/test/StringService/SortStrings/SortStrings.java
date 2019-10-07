package com.kloudspot.test.StringService.SortStrings;
import com.kloudspot.test.StringService.StringService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * String Sorting Object
 * 
 * This class takes in a collection of strings from the user
 * then alphanumerically sorts (Natural Sort) the list then returns 
 * the sorted list back to the user once the sortStrings method has 
 * been called.
 * 
 * @author conorcook
 *
 */
public class SortStrings implements StringService{
	
	private Collection<String> list;
	
	/**
	 * Constructor
	 * @param strings
	 */
	public SortStrings(Collection<String> strings){
		list = new ArrayList<String>(strings);
	}
	
	/**
	 * Constructor with no params
	 */
	public SortStrings(){
	}
	
	/**
	 * Simple Getter Method for the list
	 * 
	 * @return list
	 */
	public Collection<String> getList() {
		return list;
	}
	
	/**
	 * Main functionality for returning the alphanumerically sorted list
	 */
	@Override
	public List<String> sortStrings(Collection<String> strings) {

		// overwrites previous list to sort newly called list
		this.list = strings;
		String[] stringList = strings.toArray(new String[0]);
		
		 List<String> sortedList = new ArrayList<String>(Arrays.asList(stringList));		
		
		 Collections.sort(sortedList, new Comparator<String>() {
			 
			    @Override
			    public int compare(String str1, String str2) {
			    	//Checks for null safety
			        if (str1 == null) {
			        	return -1;
			        }else if (str2 == null) {
			        	return 1;
			        }
			        
			        //comparing ascii value ignoring case
			        return str1.compareToIgnoreCase(str2);
			    }
			});
		 
		return sortedList;
	}
}
