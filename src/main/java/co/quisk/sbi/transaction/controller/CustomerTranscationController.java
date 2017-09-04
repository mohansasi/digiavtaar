package co.quisk.sbi.transaction.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
import co.quisk.sbi.domain.RegistrationForm;
import co.quisk.sbi.exception.QuiskApplicationException;



@Controller
class CustomerTranscationController {

	private static final Logger LOG = LoggerFactory.getLogger(CustomerTranscationController.class);
    /**
     * To inject values stored in properties file into the class 
     * values include service names, success and error messages
     */
	@Value("${register.service}") private String registerService;
	@Value("${quisk.key}") private String quiskKey;
	@Value("${generic.service.call.failed.msg}") private String genericServiceException;
	@Value("${footer.year}") private String footerYear;
	@Value("${register.service.failed.msg}") private String failureMessage;
	@Value("${register.service.error.msg}") private String errorMessage;	
	
	/**
     * Description: when the action(URI) is register 
	 * this handler method is invoked which will return the view for registration view
	 * 
     * @param model
     * @return modelview of Customer Transaction
	 * @throws QuiskApplicationException 
     * @since 1.0.0
     */
    @RequestMapping("customerTransaction")
    String customerTransaction() throws QuiskApplicationException {
    	LOG.info("Entered customerTransaction method handler.");
    	QuiskServiceResponse successResponse=null;
		QuiskServiceError errorResponse=null;
    	try{
    		if(1==1){
    			
    			
    		}
    		else{
    			LOG.warn("no items available  customer transaction  in CustomerTranscationController ");
    		}
    	} catch (Exception e) {
			LOG.error("Exception in customerTransaction : {}",
					e.getMessage());
			throw new QuiskApplicationException(genericServiceException);
		}

        return "customer-transaction";
    }
    
   /* @RequestMapping(value = "/registerSuccess", method = RequestMethod.GET)
	String registerationSucess(Model model, HttpSession session)
			throws QuiskApplicationException {
		LOG.info("Entered registerationSucess method handler.");
		try {
			
		} catch (Exception e) {
			LOG.error("Exception in registerationSucess : {}",e.getMessage());
			throw new QuiskApplicationException(e.getMessage());
		}
		return ApplicationConstants.REGISTER_SUCCESS;
	}*/
  
}
