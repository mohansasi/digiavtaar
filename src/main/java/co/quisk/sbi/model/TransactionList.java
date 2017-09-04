package co.quisk.sbi.model;

import java.util.ArrayList;
import java.util.List;


public class TransactionList  extends ArrayList<Transaction>{
 
  /**
	 * 
	 */
  private static final long serialVersionUID = 4638449214975867631L;
  private List<Transaction> list = this;

  public List<Transaction> getList() {
		return list;
  }
	
  public void setList(List<Transaction> list) {
		this.list = list;
  }

}
