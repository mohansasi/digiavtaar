package co.quisk.sbi.transaction.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mobibucks.common.domain.QuiskServiceError;
import com.mobibucks.common.domain.QuiskServiceResponse;
import com.mobibucks.common.util.RestClient;
import com.mobibucks.common.workqueue.ResendWelcomeQueue;
import com.quisk.sbi.utils.ApplicationConstants;

import co.quisk.ap.support.model.AdminUserData;
import co.quisk.ap.support.util.Constants;
import co.quisk.ap.support.valueobject.ChangeAdminPasswordRequest;
import co.quisk.sbi.domain.FullRegistrationInfo;
import co.quisk.sbi.domain.MerchantTransactionHistorySuccess;
import co.quisk.sbi.domain.MerchantTransactionSuccess;
import co.quisk.sbi.domain.Money;
import co.quisk.sbi.domain.RegistrationForm;
import co.quisk.sbi.domain.TransactionSearchRequest;
import co.quisk.sbi.domain.TransactionSearchSuccess;
import co.quisk.sbi.exception.QuiskApplicationException;
import co.quisk.sbi.model.MerchantInfoResponseVO;
import co.quisk.sbi.model.MerchantTransactionHistoryResponseVO;
import co.quisk.sbi.model.Transaction;
import co.quisk.sbi.model.TransactionList;
import co.quisk.sbi.model.TransactionsSummaryResponseVO;



@Controller
class MerchantTranscationController {

	private static final Logger LOG = LoggerFactory.getLogger(MerchantTranscationController.class);
    /**
     * To inject values stored in properties file into the class 
     * values include service names, success and error messages
     */
	@Value("${generic.service.call.failed.msg}") private String genericServiceException;
	@Value("${register.service.failed.msg}") private String failureMessage;
	@Value("${register.service.error.msg}") private String errorMessage;	
	
	@Value("${merchant.transaction.timmer.count}") private String timmerCount;
	
	@Value("${merchant.transaction.id1}") private String merchantId1;
	@Value("${merchant.transaction.id2}") private String merchantId2;
	@Value("${merchant.transaction.id3}") private String merchantId3;
	
	@Value("${merchant.transaction.entityId}") private String entityId;
	@Value("${merchant.transaction.entityTypeId}") private String entityTypeId;
	@Value("${merchant.transaction.fiId}") private String fiId;
	
	@Value("${merchant.transaction.sale.count}") private String saleCountService;
	
	@Value("${merchant.transaction.search}") private String transactionSearchService;
	@Value("${merchant.transactions.service}") private String merchantTransactionService;
	
	/**
     * Description: when the action(URI) is register 
	 * this handler method is invoked which will return the view for registration view
	 * 
     * @param model
     * @return modelview of Customer Transaction
	 * @throws QuiskApplicationException 
     * @since 1.0.0
     */
    @RequestMapping("merchantTransactions")
    String merchantTransaction(Model model) throws QuiskApplicationException {
    	LOG.info("Entered merchantTransaction method handler.");
    	QuiskServiceResponse successResponse=null;
		QuiskServiceError errorResponse=null;
    	try{
    		model.addAttribute("timmerCount", timmerCount);
    		model.addAttribute("merchantId1", merchantId1);
    		model.addAttribute("merchantId2", merchantId2);
    	} catch (Exception e) {
			LOG.error("Exception in merchantTransaction : {}",
					e.getMessage());
			throw new QuiskApplicationException(genericServiceException);
		}

        return "merchant-transaction";
    }
    
    @RequestMapping(value = "/merchantTransactionsHistory/{merchantName}", method = RequestMethod.GET)
	String merchantSaleTransactions(@PathVariable("merchantName") String merchantName,Model model)
			throws QuiskApplicationException {
		LOG.info("Entered merchantTransactionsHistory method handler.");
		try {
			LOG.info("merchantName : {}",merchantName);
		    TransactionSearchRequest transactionSearchRequest = new TransactionSearchRequest();
		    List<Transaction> transactionsList = new ArrayList<Transaction>(); 
		    transactionSearchRequest.setMerchantName(merchantName);
		    transactionSearchRequest.setEntityIds(entityId);
		    transactionSearchRequest.setEntityTypeId(entityTypeId);
		    transactionSearchRequest.setFiId(fiId);
		    Money money = new Money();
		    money.setAmount(null);
		    money.setCurrency(null);
		    transactionSearchRequest.setTransactionAmount(money);
		    
		    LOG.info("request : {}",RestClient.objectToJson(transactionSearchRequest, TransactionSearchRequest.class));
			
		    Response transactionSearchServiceResponse = RestClient
					.callServiceWithPost(RestClient.objectToJson(transactionSearchRequest, TransactionSearchRequest.class), merchantTransactionService);
			LOG.info("merchantTransactionsHistory.getStatus() : {}",transactionSearchServiceResponse.getStatus());
			 if(transactionSearchServiceResponse.getStatus() == 200){
				 LOG.warn("transaction Search successful.");
					String transactionSearchDetailJSON = (String) transactionSearchServiceResponse
							.getEntity();

				TransactionList transactionSearchRequestlist = (TransactionList) RestClient
					.jsonToObject(transactionSearchDetailJSON,TransactionList.class);
				if (transactionSearchRequestlist != null && transactionSearchRequestlist.size() > 0){
				  for (Transaction transaction : transactionSearchRequestlist){
					if (transaction.getTransactionType().equals("CREDIT")) {
						transactionsList.add(transaction);
					}
				  }	
				}
				LOG.info("transactionHistory size : {}",transactionSearchRequestlist.size());
				LOG.info("creditTransactionList size : {}",transactionsList.size());
				model.addAttribute("transactionSearchRequestlist", transactionSearchRequestlist);
				model.addAttribute("transactionHistory",transactionSearchRequestlist);
				model.addAttribute("creditTransactionList",transactionsList);
				model.addAttribute("merchantName",merchantName);
			 }
		} catch (Exception e) {
			LOG.error("Exception in merchantSaleTransactions : {}",e.getMessage());
			throw new QuiskApplicationException(e.getMessage());
		}
		return "merchant-transaction-list";
	}
  
    @RequestMapping("search")
  	String transactionSearch(Model model)
  			throws QuiskApplicationException {
    	LOG.info("Entered search method handler.");
  		
  		return "transaction-search";
  	}
    
    @RequestMapping(value = "/searchTransaction/{phoneNumber}", method = RequestMethod.GET)
	String searchTransaction(@PathVariable("phoneNumber") String phoneNumber,Model model)
			throws QuiskApplicationException {
		LOG.info("Entered searchTransaction method handler.");
		try {
			LOG.info("Phone Number: {}",phoneNumber);
			Response transactionSearchResponse = RestClient
					.callServiceWithGet(transactionSearchService,phoneNumber,"/search");
			LOG.info("merchantTransactionsHistory.getStatus() : {}",transactionSearchResponse.getStatus());
			 if(transactionSearchResponse.getStatus() == 200){
				 TransactionSearchSuccess transactionSearchSuccess = (TransactionSearchSuccess) RestClient
					.jsonToObject(transactionSearchResponse.getEntity().toString(),TransactionSearchSuccess.class);
				 if(transactionSearchSuccess.getResponse() != null && transactionSearchSuccess.getResponse() .size() >0 )
				     model.addAttribute("transactionSearchList",transactionSearchSuccess.getResponse());
			 }
		} catch (Exception e) {
			LOG.error("Exception in merchantSaleTransactions : {}",e.getMessage());
			throw new QuiskApplicationException(e.getMessage());
		}
		return "transaction-search-list";
	}
    
}
