<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Calculate Phone charge</title>
<jsp:include page="header_form.jsp"></jsp:include>
<script src="jsform/js.js"></script>
</head>
<body>
	<form role="form" id="buy_form_main">
	<div class="container">
	<div class="row form-group"></div>
		<div class="panel panel-primary">
			<div class="panel-heading">Calculate Phone Charge</div>
			<div class="panel-body form-horizontal">
				<div class="row form-group">
				<div class="col-xs-6 col-sm-3">
				    <button id="getProcess" type="button" class="btn btn-default">show</button>
				    <button id="export" type="button" class="btn btn-default">Export</button>
				    
				</div>
				</div>
				<!-- End Row -->
								
				<div class="panel panel-info">
				<div class="panel-heading">Summary Phone Charge</div>
				<div class="panel-body form-horizontal">
				    <table id="table" class="display responsive table table-bordered" width="100%">
			        <thead>
			            <tr>
				            <th class="text-center">phone number</th><th class="text-center">Spend Time</th><th class="text-center">total charge (baht)</th>
			            </tr>
			        </thead>
			    	</table>
				</div>
				</div>
				<!-- End Table -->
			</div>
		</div>
	</div>
	</form>
</body>
</html>