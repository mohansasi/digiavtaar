package co.quisk.sbi.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.Response.Status;


public class TransactionSearchRequest {
	private static final long serialVersionUID = 2456527220093447403L;
	private Long transactionId;
	private String authorizationCode;
	private String transactionDateStr;
	private String merchantName;
	private Money transactionAmount;
	private String entityIds;
	private String entityTypeId;
	private String fiId;

	public String getEntityIds() {
		return entityIds;
	}

	public void setEntityIds(String entityIds) {
		this.entityIds = entityIds;
	}

	public String getEntityTypeId() {
		return entityTypeId;
	}

	public void setEntityTypeId(String entityTypeId) {
		this.entityTypeId = entityTypeId;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	
    public Money getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Money transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionDateStr() {
		return transactionDateStr;
	}

	public void setTransactionDateStr(String transactionDateStr) {
		this.transactionDateStr = transactionDateStr;
	}

	public String getFiId() {
		return fiId;
	}

	public void setFiId(String fiId) {
		this.fiId = fiId;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("TransactionSearchRequest [transactionId=").append(transactionId)
				.append(", authorizationCode=").append(authorizationCode)
				.append(", transactionDateStr=").append(transactionDateStr)
				.append(", merchantName=").append(merchantName)
				.append(", transactionAmount=").append(transactionAmount)
				.append(", entityIds=").append(entityIds)
				.append(", entityTypeId=").append(entityTypeId)
				.append(", fiId=").append(fiId)
				.append(" ]");
		return sb.toString();
	}

}
