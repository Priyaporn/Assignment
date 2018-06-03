$(document).ready(function() {
	$( "#getProcess" ).click(function() {
		callProcess();
	});
	
	$( "#export" ).click(function() {
		 $.ajax({
			 type: "POST",
			 url: "./ProcessSrvl",
			 data: {
				 mode: "export"
			 }
	    });
	});
	
});

function callProcess(){
	$('#table').dataTable( {
		 "ajax": {
			 type: "POST",
			 url: "./ProcessSrvl",
			 data: {
				 mode: "get"
			 },
			 dataSrc : ""
		 }
	 });
}
