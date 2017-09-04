/**
 * 
 */
package co.quisk.sbi.model;

import java.io.Serializable;

/**
 * @author Chandrashekar
 *
 */
public class MerchantTransactionHistoryResponseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Record ID
	 */
	private Integer id;
	
	/**
	 * Transaction Amount
	 */
	private Double amount;
	
	/**
	 * Transaction ID
	 */
	private Long transactionId;
	
	/**
	 * Merchant Info
	 */
	private MerchantInfoResponseVO merchantInfo;
	
	/**
	 * Customer Mobile Number
	 */
	private String customerMobileNumber;
	
	/**
	 * Transaction create date and time in timestamp
	 */
	private Long transactionTime;
	
	private String transactionDateTime;

	public String getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(String transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the transactionId
	 */
	public Long getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

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
	 * @return the customerMobileNumber
	 */
	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	/**
	 * @param customerMobileNumber the customerMobileNumber to set
	 */
	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	/**
	 * @return the transactionTime
	 */
	public Long getTransactionTime() {
		return transactionTime;
	}

	/**
	 * @param transactionTime the transactionTime to set
	 */
	public void setTransactionTime(Long transactionTime) {
		this.transactionTime = transactionTime;
	}
	
}
