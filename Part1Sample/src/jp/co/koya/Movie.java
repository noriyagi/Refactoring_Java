/**
 * 
 */
package jp.co.koya;

/**
 *  <p>
 *  映画クラス
 *  </p>
 * <p>
 *  データ保持用クラス
 *  </p>
 * @author k_nori-yagi
 * 
 */
public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String _title;
	private int _priceCode;
	
	public Movie(String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
	}

	/**
	 * @return _priceCode
	 */
	public int getPriceCode() {
		return _priceCode;
	}

	/**
	 * @param _priceCode セットする _priceCode
	 */
	public void setPriceCode(int arg) {
		this._priceCode = arg;
	}

	/**
	 * @return _title
	 */
	public String getTitle() {
		return _title;
	}

}
