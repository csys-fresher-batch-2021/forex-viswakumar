<html>
<head>
<title>MyApp</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		
	<form action="CurrencyConvererAction" method="get">
	<label> enter amount</label>
		<input type="number" id="amount" name="amount" min=1 max=10000 required autofocus/>
		<select id="currencytype" name="currencytype">
                <option value="dollar">dollar</option>
                <option value="inr">INR</option>
            </select>
            
            <button type="submit">submit</button>
            
		</form>
		   <%   
  
		   String convertedamount= request.getParameter("convertedAmount");
		   String currencyType=request.getParameter("currencytype");
		   if(convertedamount != null)
		    out.print(convertedamount   +   currencyType);
  
			%>  

	</main>
</body>
</html>
