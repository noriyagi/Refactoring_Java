package jp.co.koya;

import java.util.Vector;

/**
 *  <p>
 *  �ڋq�N���X
 *  </p>
 * <p>
 *  �X�Ŏ�舵���ڋq��\���B
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
