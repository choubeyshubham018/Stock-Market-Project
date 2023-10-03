package in.ineuron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.entity.Stock_Price;



public interface IStockPriceRepo extends JpaRepository<Stock_Price, Integer> {

	public Stock_Price findByCompanyName(String companyName);
}
