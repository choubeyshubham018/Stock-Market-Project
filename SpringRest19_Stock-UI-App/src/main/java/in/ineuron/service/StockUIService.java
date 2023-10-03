package in.ineuron.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class StockUIService {

	public String toGetTotalStockPrice(String companyName, Integer quantity) {
		String response = null;
		String STOCK_PRICE_URL = "http://localhost:4444/api/calc/calc/calculate/{companyName}/{quantity}";
		WebClient client = WebClient.create();

		try {
			response = client.get().uri(STOCK_PRICE_URL, companyName, quantity).retrieve().bodyToMono(String.class)
					.block();
		} catch (Exception e) {
          response="Stock Record Not Found";
		}
		return response;
	}
}
