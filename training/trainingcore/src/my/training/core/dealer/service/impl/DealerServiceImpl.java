/**
 *
 */
package my.training.core.dealer.service.impl;

import java.util.List;

import my.training.core.dealer.dao.DealerDao;
import my.training.core.dealer.service.DealerService;
import my.training.core.model.DealerModel;


/**
 * @author USER
 *
 */
public class DealerServiceImpl implements DealerService
{
	private DealerDao dealerDao;





	@Override
	public List<DealerModel> getAllDealerDetails()
	{
		return dealerDao.getAllDealerDetails();
	}


	@Override
	public DealerModel getDealerDetailsByCode(final String dealerCode)
	{
		final DealerModel dealerModel = dealerDao.getDealerDetailsByCode(dealerCode);
		return dealerModel;
	}



	/**
	 * @return the dealerDao
	 */
	public DealerDao getDealerDao()
	{
		return dealerDao;
	}

	/**
	 * @param dealerDao
	 *           the dealerDao to set
	 */
	public void setDealerDao(final DealerDao dealerDao)
	{
		this.dealerDao = dealerDao;
	}






}
