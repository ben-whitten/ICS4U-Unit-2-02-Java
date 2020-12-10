/*
* The MrCoxallStack program implements an application that
* creates a stack and allows you to edit it.
*
* @author  Ben Whitten
* @version 1.1
* @since   2020-12-8
*/

import java.util.ArrayList;  // Import the ArrayList class

///////////////////////////////////////////////////////////////////////////////

public class MrCoxallStack {

  private ArrayList<Integer> someStack = new ArrayList<Integer>();

  // variables for later.
  private String poppedNumber;
  private int position;
  private int intPushedNumber;
  private String stackValues;

  /////////////////////////////////////////////////////////////////////////////
  /**
   * Push function.
   */
  public String push(String pushedNumber) {
    intPushedNumber = Integer.parseInt(pushedNumber);
    someStack.add(intPushedNumber);
    pushedNumber = "Pushed: " + pushedNumber;

    return pushedNumber;
  }
  
  /////////////////////////////////////////////////////////////////////////////
  /**
   * Pop function.
   */
  public String pop() {
    poppedNumber = "Popped: ";
    poppedNumber += someStack.get(someStack.size() - 1);
    someStack.remove(someStack.size() - 1);

    return poppedNumber;
  }

  /////////////////////////////////////////////////////////////////////////////
  /**
   * Show function.
   */
  public String show() {

    stackValues = "Current Stack Values: ";
    stackValues += someStack.get(0);
    position = 1;
    if (someStack.size() > 0) {
      for (position = 1; position < someStack.size(); position++) {
        stackValues = stackValues + ", " + someStack.get(position);
      }
    }

    return stackValues;
  }
}
