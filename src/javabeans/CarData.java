package javabeans;

/**
 *  このクラスは車のデータを取り扱うクラスです。
 *  @author 岡崎勇気
 */
public class CarData {

	/** 車種を表します。 */
	private String carType;

	/** 車のメーカーを表します。 */
	private String carMaker;

	/** 車の価格を表します。 */
	private int carPrice;

	/** 車の台数を表します。 */
	private int carNumber;

	/**
	 * 車種名を取得するメソッドです。
	 * @return 車種名を返します。
	 */
	public String getCarType(){
		return this.carType;
	}

	/**
	 * 車種名を代入するメソッドです。
	 * @param carType 車種名を受け取ります。
	 */
	public void setCarType(String carType){
		this.carType = carType;
	}

	/**
	 *車のメーカー名を取得するメソッドです。
	 * @return 車のメーカー名を返します。
	 */
	public String getCarMaker(){
		return this.carMaker;
	}

	/**
	 *車のメーカー名を代入するメソッドです。
	 * @param carMaker 車のメーカー名を受け取ります。
	 */
	public void setCarMaker(String carMaker){
		this.carMaker= carMaker;
	}

	/**車の単価を取得するメソッドです。
	 * @return 車の単価を返します。
	 */
	public int getCarPrice(){
		return this.carPrice;
	}

	/**車の単価を代入するメソッドです。
	 * @param carPrice 車の単価を受け取ります。
	 */
	public void setCarPrice(int carPrice){
		this.carPrice= carPrice;
	}

	/**
	 * 車の台数を取得するメソッドです。
	 * @return 車の台数を返します。
	 */
	public int getCarNumber(){
		return this.carNumber;
	}

	/**
	 * 車の台数を代入するメソッドです。
	 * @param carNumber 車の台数を受け取ります。
	 */
	public void setCarNumber(int carNumber){
		this.carNumber= carNumber;
	}
}