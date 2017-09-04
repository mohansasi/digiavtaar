package co.quisk.sbi.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.Response.Status;


public class Money {

	  /**
		 * 
		 */
	  private static final long serialVersionUID = -2106789249450985104L;
	  private String amount;
	  private String currency;

	 
	  public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	@Override
	  public String toString() {
	    return "Money [amount=" + amount + ", currency=" + currency + "]";
	  }

}
