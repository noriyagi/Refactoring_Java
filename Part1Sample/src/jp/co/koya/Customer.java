package jp.co.koya;

import java.util.Vector;

/**
 *  <p>
 *  ŒÚ‹qƒNƒ‰ƒX
 *  </p>
 * <p>
 *  “X‚Åæ‚èˆµ‚¤ŒÚ‹q‚ğ•\‚·B
 *  </p>
 * @author k_nori-yagi
 *
 */
public class Customer {
	private String _name;
	private Vector _rentals = new Vector();
	
	public Customer (String name) {
		_name = name;
	}
	
	public void addRental (Rental arg) {
		_rentals.addElement(arg);
	}
	public String getName() {
		return _name;
	}

}
