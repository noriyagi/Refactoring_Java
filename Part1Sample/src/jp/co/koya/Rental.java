/**
 * 
 */
package jp.co.koya;

/**
 * @author k_nori-yagi
 *
 */
public class Rental {
	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented){
		_movie = movie;
		_daysRented = daysRented;
	}

	/**
	 * @return _movie
	 */
	public Movie getMovie() {
		return _movie;
	}

	/**
	 * @return _daysRented
	 */
	public int getDaysRented() {
		return _daysRented;
	}

}
