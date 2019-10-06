package com.kloudspot.test.StringService.SortStrings;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main Controller for SortStrings
 * 
 * @author conorcook
 */
@RestController
public class SortStringsController {

	@Autowired
	private SortStringsService sortService;
	
	/**
	 * Main mapping for this application. 
	 * 
	 * Takes in a GET or POST request with a JSON Array 
	 * of Strings that is contained in the body of the request. 
	 * 
	 * The input of JSON array of Strings is required.
	 * 
	 * @param input (JSON Array of Strings in Body of request)
	 * @return sortedList (Returned as JSON Array of Strings in the body)
	 */
	@RequestMapping(method= {RequestMethod.POST, RequestMethod.GET }, value="/sort")
	public List<String> sortCollection(@RequestBody Collection<String> input) {
		return sortService.sortList(input);
	}
}
