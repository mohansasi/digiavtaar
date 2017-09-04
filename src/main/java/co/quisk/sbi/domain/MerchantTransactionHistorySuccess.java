package co.quisk.sbi.domain;

import java.util.List;

import co.quisk.sbi.model.MerchantTransactionHistoryResponseVO;

public class MerchantTransactionHistorySuccess {

	private List<MerchantTransactionHistoryResponseVO> response;

	public List<MerchantTransactionHistoryResponseVO> getResponse() {
		return response;
	}

	public void setResponse(List<MerchantTransactionHistoryResponseVO> response) {
		this.response = response;
	}

}
