package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.entity.Stock_Price;
import in.ineuron.exception.StockNotFoundException;
import in.ineuron.repository.IStockPriceRepo;

@Service
public class StockPriceServiceImpl implements IStockPriceService {

	@Autowired
	private IStockPriceRepo repo;
	@Override
	public Double getStockPrice(String companyName) {
		Stock_Price stock = repo.findByCompanyName(companyName);
		if(stock==null) {
			throw new StockNotFoundException("Stock Detail Not Found");
		}
		
		return stock.getCompanyPrice();
	}

}
