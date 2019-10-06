package com.kloudspot.test.StringService.SortStrings;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * Service class for the SortString Object.
 * 
 * This class is used as a variable in the SortStringsController.
 * 
 * This class make an instance of the SortStrings object and returns 
 * the sorted list to the controller when it is called. 
 * 
 * @author conorcook
 *
 */
@Service
public class SortStringsService {
		
		private SortStrings sortStrings = new SortStrings();
		
		/**
		 * Simple getter method for the controller to return the current state
		 * of the list.
		 * 
		 * @return list (from SortStrings instance, current state of the list)
		 */
		public List<String> getList(){
			return (List<String>) sortStrings.getList();			
		}
		
		/**
		 * Method to call the sortStrings method of the SortStrings instance
		 * once the controller calls this class. 
		 * 
		 * @param input (collection of strings taken in from the user to be sorted)
		 * @return sortedList (from SortStrings instance in sortStrings method, sorted version of user inputted list)
		 */
		public List<String> sortList(Collection<String> input){
			return sortStrings.sortStrings(input);
		}	
}
