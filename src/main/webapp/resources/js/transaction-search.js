$(document).ready(function (){
	
	
	$('#reset').on('click', function(e){
		$('#phoneNumber').val("");
		$("#errorMessage").text(' ');
		var tableContent =  "<tr role='row' class='odd' ><td colspan='3' class='error' align='center'>No Data Available</td>	</tr>";
		$('#searchTransactionId').html(tableContent);
	});
	
	
	$('#searchId').on('submit', function(e){
		searchTransactions();
		return false;
	});
	
	$('#searchTransaction').on('click', function(e){
		searchTransactions();
	});
	
	var searchTransactions = function(){
		var phoneNumber = $('#phoneNumber').val();
		$("#errorMessage").text(' ');
		if(phoneNumber == '' && phoneNumber.trim().length == 0){
			$("#errorMessage").text("Phone Number is required.");
			return false;
		}else if(!isNumeric(phoneNumber)){
			$("#errorMessage").html("Enter a valid Phone Number.");
			return false;
		}else if (phoneNumber != '' && isNumeric(phoneNumber)){
			if(!(phoneNumber.length == 10)){
				$("#errorMessage").html("Enter a valid Phone Number.");
				return false;
			}
		}
		$("#errorMessage").text(' ');
		
		$.ajax({
			type:"GET",
			url: "/sbi/searchTransaction/"+ phoneNumber ,
			datatype: "json",
		}).done(function(data){
			 $('#searchTransactionId').html(data);
			return data;
		});
	}
	
	
	var isNumeric=function(number) {
		var dateRegex = new RegExp(/^[0-9]*$/);
		return dateRegex.test(number);
	}
	
	var isValidNumber=function(number) {
		var dateRegex = new RegExp(/^[0-9]\d{0,9}(\.\d{1,3})?%?$/);
		return dateRegex.test(number);
	}
	
});