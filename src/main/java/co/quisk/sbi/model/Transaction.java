package co.quisk.sbi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.joda.time.DateTime;

import co.quisk.sbi.domain.Money;


public class Transaction implements Serializable {

  private static final long serialVersionUID = 4447765855739628799L;
  private String transactionType;
  private Money transactionAmount;
  private String transactionDescription;
  private DateTime transactionTime;
  private Long transactionId;
  private String rrn;
  private String timeZoneDesc;
  private String refTransactionId;
  private String strTransactionId;
  private String formattedTransactionDate;
  private String formattedTransactionAmount;
  private String accountId;
  private int transactionTypeId;
  private Long longTransactionDate;
  private boolean isAdjustableTxn;
  private String authCode;
  
  private BigDecimal tip;
  private String transactionTypeDescription;
  private String transactingEntityTypeName;
  private String transactingEntityTypeId;
  private String transactingEntityName;
  private String transactingEntityId;
  private String status;
  private String transactionDateStr;
  private Date transactionDate;
  private String transactingEntityFiId;
  private String fiName;
  private String fiNetworkName;
  private String merchantId;

public BigDecimal getTip() {
	return tip;
}

public void setTip(BigDecimal tip) {
	this.tip = tip;
}

public String getTransactionTypeDescription() {
	return transactionTypeDescription;
}

public void setTransactionTypeDescription(String transactionTypeDescription) {
	this.transactionTypeDescription = transactionTypeDescription;
}

public String getTransactingEntityTypeName() {
	return transactingEntityTypeName;
}

public void setTransactingEntityTypeName(String transactingEntityTypeName) {
	this.transactingEntityTypeName = transactingEntityTypeName;
}

public String getTransactingEntityTypeId() {
	return transactingEntityTypeId;
}

public void setTransactingEntityTypeId(String transactingEntityTypeId) {
	this.transactingEntityTypeId = transactingEntityTypeId;
}

public String getTransactingEntityName() {
	return transactingEntityName;
}

public void setTransactingEntityName(String transactingEntityName) {
	this.transactingEntityName = transactingEntityName;
}

public String getTransactingEntityId() {
	return transactingEntityId;
}

public void setTransactingEntityId(String transactingEntityId) {
	this.transactingEntityId = transactingEntityId;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getTransactionDateStr() {
	return transactionDateStr;
}

public void setTransactionDateStr(String transactionDateStr) {
	this.transactionDateStr = transactionDateStr;
}

public Date getTransactionDate() {
	return transactionDate;
}

public void setTransactionDate(Date transactionDate) {
	this.transactionDate = transactionDate;
}

public String getTransactingEntityFiId() {
	return transactingEntityFiId;
}

public void setTransactingEntityFiId(String transactingEntityFiId) {
	this.transactingEntityFiId = transactingEntityFiId;
}

public String getFiName() {
	return fiName;
}

public void setFiName(String fiName) {
	this.fiName = fiName;
}

public String getFiNetworkName() {
	return fiNetworkName;
}

public void setFiNetworkName(String fiNetworkName) {
	this.fiNetworkName = fiNetworkName;
}

public Long getLongTransactionDate() {
    return longTransactionDate;
  }
  
  public void setLongTransactionDate(Long longTransactionDate) {
    this.longTransactionDate = longTransactionDate;
  }

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public Money getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(Money transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public String getTransactionDescription() {
    return transactionDescription;
  }

  public void setTransactionDescription(String transactionDescription) {
    this.transactionDescription = transactionDescription;
  }

  public DateTime getTransactionTime() {
    return transactionTime;
  }

  public void setTransactionTime(DateTime transactionTime) {
    this.transactionTime = transactionTime;
  }

  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public String getTimeZoneDesc() {
    return timeZoneDesc;
  }

  public void setTimeZoneDesc(String timeZoneDesc) {
    this.timeZoneDesc = timeZoneDesc;
  }

  public String getRRN() {
    return rrn;
  }

  public void setRRN(String rRN) {
    rrn = rRN;
  }

  public String getRefTransactionId() {
    return refTransactionId;
  }

  public void setRefTransactionId(String refTransactionId) {
    this.refTransactionId = refTransactionId;
  }

  public String getStrTransactionId() {
    return strTransactionId;
  }

  public void setStrTransactionId(String strTransactionId) {
    this.strTransactionId = strTransactionId;
  }

  public String getFormattedTransactionDate() {
    return formattedTransactionDate;
  }

  public void setFormattedTransactionDate(String formattedTransactionDate) {
    this.formattedTransactionDate = formattedTransactionDate;
  }

  public String getFormattedTransactionAmount() {
    return formattedTransactionAmount;
  }

  public void setFormattedTransactionAmount(String formattedTransactionAmount) {
    this.formattedTransactionAmount = formattedTransactionAmount;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public int getTransactionTypeId() {
    return transactionTypeId;
  }

  public void setTransactionTypeId(int transactionTypeId) {
    this.transactionTypeId = transactionTypeId;
  }

  public boolean getIsAdjustableTxn() {
	return isAdjustableTxn;
  }

  public void setIsAdjustableTxn(boolean isAdjustableTxn) {
	this.isAdjustableTxn = isAdjustableTxn;
  }

  public String getAuthCode() {
	return authCode;
  }

  public void setAuthCode(String authCode) {
	this.authCode = authCode;
  }
  

  public String getMerchantId() {
	return merchantId;
  }

  public void setMerchantId(String merchantId) {
	this.merchantId = merchantId;
  }

public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("TransactionInfo [transactionId=").append(transactionId)
				.append(", transactionType=").append(transactionType)
				.append(", transactionAmount=").append(transactionAmount)
				.append(", transactionDescription=").append(transactionDescription)
				.append(", transactionTime=").append(transactionTime)
				.append(", rrn=").append(rrn)
				.append(", timeZoneDesc=").append(timeZoneDesc)
				.append(", refTransactionId=").append(refTransactionId)
				.append(", strTransactionId=").append(strTransactionId)
				.append(", formattedTransactionDate=").append(formattedTransactionDate)
				.append(", formattedTransactionAmount=").append(formattedTransactionAmount)
				.append(", accountId=").append(accountId)
				.append(", transactionTypeId=").append(transactionTypeId)
				.append(", isAdjustableTxn=").append(isAdjustableTxn)
				.append(", authCode=").append(authCode)
				.append(", tip=").append(tip)
				.append(", transactionTypeDescription=").append(transactionTypeDescription)
				.append(", transactionEntityTypeName=").append(transactingEntityTypeName)
				.append(", transactionEntityTypeId=").append(transactingEntityTypeId)
				.append(", transactionEntityName=").append(transactingEntityName)
				.append(", transactionEntityId=").append(transactingEntityId)
				.append(", status=").append(status)
				.append(", transactionDateStr=").append(transactionDateStr)
				.append(", transactionDate=").append(transactionDate)
				.append(", transactingEntityFiId=").append(transactingEntityFiId)
				.append(", fiName=").append(fiName)
				.append(", fiNetworkName=").append(fiNetworkName)
				.append(", merchantId=").append(merchantId)
				.append("]");
				
				
		return sb.toString();
	}
  

}
