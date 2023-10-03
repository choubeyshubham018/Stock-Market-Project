package in.ineuron.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.client.StockClient;

@RestController
@RequestMapping("/calc")
public class StockPriceCalculatorRestController {

	@Autowired
	private StockClient client;
	
	@GetMapping("/calculate/{companyName}/{quantity}")
	public ResponseEntity<?> calculateTotalPrice(@PathVariable String companyName,@PathVariable Integer quantity){
		System.out.println(companyName);
		System.out.println(quantity);
		ResponseEntity<?> responseEntity=null;
		Double totalPrice=null;
		try {
			responseEntity = client.getStockPrice(companyName);
            int status = responseEntity.getStatusCode().value();	
            System.out.println("The status is :: "+status);
			if(status == 200) {
				Double response = (Double) responseEntity.getBody();
				totalPrice=quantity*response;
				responseEntity=new ResponseEntity<Double>(totalPrice,HttpStatus.OK);
			}
            
		}catch (Exception e) {
		responseEntity=new ResponseEntity<String>("Stock Details Not Found",HttpStatus.BAD_REQUEST);	
		}
		return responseEntity;
	}
}
