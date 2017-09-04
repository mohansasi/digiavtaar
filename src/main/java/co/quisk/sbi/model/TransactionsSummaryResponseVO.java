/**
 * 
 */
package co.quisk.sbi.model;

/**
 * @author Chandrashekar
 *
 */
public class TransactionsSummaryResponseVO {
	
	/**
	 * Merchant Baic Info
	 */
	private MerchantInfoResponseVO merchantInfo;
	
	/**
	 * Total no.of Transactions Count
	 */
	private Integer count;
	
	
	/**
	 * Sum of Transactions Amount
	 */
	private Double totalAmount;


	/**
	 * @return the merchantInfo
	 */
	public MerchantInfoResponseVO getMerchantInfo() {
		return merchantInfo;
	}


	/**
	 * @param merchantInfo the merchantInfo to set
	 */
	public void setMerchantInfo(MerchantInfoResponseVO merchantInfo) {
		this.merchantInfo = merchantInfo;
	}


	/**
	 * @return the count
	 */
	public Integer getCount() {
		return count;
	}


	/**
	 * @param count the count to set
	 */
	public void setCount(Integer count) {
		this.count = count;
	}


	/**
	 * @return the totalAmount
	 */
	public Double getTotalAmount() {
		return totalAmount;
	}


	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	

}
