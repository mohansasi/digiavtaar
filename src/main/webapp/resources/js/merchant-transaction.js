$(document).ready(function (){
	
	
	var merchantId1 = $('#merchantId1').val();
	var merchantId2 = $('#merchantId2').val();
	
	ajaxMerchantTransactionsHistory(merchantId1,'merchantHistory1');
	ajaxMerchantTransactionsHistory(merchantId2,'merchantHistory2');
	
	function ajaxMerchantTransactionsHistory(merchantId, divId){
		$.ajax({
			type:"GET",
			url: "/sbi/merchantTransactionsHistory/"+ merchantId ,
			datatype: "json",
		}).done(function(data){
			$('#'+divId).html(data);
			return data;
		});
	}
	
	var timmerCount = $('#timmerCount').val();
	var myVar = setInterval(myTimer, timmerCount);
	function myTimer() {
		ajaxMerchantTransactionsHistory(merchantId1, 'merchantHistory1');
		ajaxMerchantTransactionsHistory(merchantId2,'merchantHistory2');
	}
	
});