package co.quisk.sbi.domain;

import java.util.List;

import co.quisk.sbi.model.SearchSMSResponseVO;

public class TransactionSearchSuccess {

	private List<SearchSMSResponseVO> response;

	public List<SearchSMSResponseVO> getResponse() {
		return response;
	}

	public void setResponse(List<SearchSMSResponseVO> response) {
		this.response = response;
	}
	
}
