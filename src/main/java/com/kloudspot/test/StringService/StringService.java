package com.kloudspot.test.StringService;

import java.util.Collection;
import java.util.List;

public interface StringService {
 
  /**
   * Sort the input strings alphanumerically , ignoring case.
   * @param strings - a collection of strings to be sorted.
   * @return - The sorted list of strings.
   */
  List<String> sortStrings (Collection<String> strings);

}