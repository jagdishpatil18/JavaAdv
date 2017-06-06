package com.bridgeit.SpringHinernate.stock;


import com.bridgeit.SpringHinernate.DAO.StockDao;
import com.bridgeit.SpringHinernate.Model.Stock;

public class StockBoImpl implements StockBo {

	StockDao stockDao;
	
	
	/*public StockDao getStockDao() {
		return stockDao;
	}

*/
	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}


	public void save(Stock stock) {
				stockDao.save(stock);
	}

	
	

}
