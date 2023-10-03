package in.ineuron.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ineuron.service.StockUIService;

@Controller
public class StockUIController {
	
	@Autowired
	private StockUIService service;

	@GetMapping("/")
	public String loadPage() {
		
		return "index";
	}
	
	@GetMapping("getStockPrice")
	public String getTotalCost(HttpServletRequest request,Model model) {
	
		String companyName = request.getParameter("companyName");
		Integer quantity = Integer.parseInt(request.getParameter("quantity"));
		
		String response = service.toGetTotalStockPrice(companyName, quantity);
		model.addAttribute("response","Total Stock Price :: "+response);
		return "index";
	}
}
