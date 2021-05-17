package trading.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import trading.service.CurrencyConverter;

/**
 * Servlet implementation class CurrencyConvererAction
 */
@WebServlet("/CurrencyConvererAction")
public class CurrencyConvererAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String currencytype = request.getParameter("currencytype");
		double amount = Double.parseDouble(request.getParameter("amount"));
		
		double convertAmount = CurrencyConverter.converter(amount, currencytype);
		
		response.sendRedirect("CurrencyConverter.jsp?convertedAmount=" + convertAmount+"&currencytype="+currencytype);
		}

}
