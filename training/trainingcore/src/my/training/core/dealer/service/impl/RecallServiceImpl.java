/**
 *
 */

package my.training.core.dealer.service.impl;

import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import my.training.core.dealer.dao.RecallDao;
import my.training.core.dealer.service.RecallService;
import my.training.core.model.RecallModel;


/**
 * @author ICON
 *
 */

public class RecallServiceImpl implements RecallService
{
	private RecallDao recallDao;

	private ModelService modelService;



	@Override
	public RecallModel getRecallById(final String id)
	{
		final RecallModel recallModel = recallDao.getRecallById(id);
		return recallModel;
	}



	@Override
	public List<RecallModel> getRecallModels()
	{
		return recallDao.getRecallModels();
	}



	/**
	 * @return the recallDao
	 */

	public RecallDao getRecallDao()
	{
		return recallDao;
	}

	/**
	 * @param recallDao
	 *           the recallDao to set
	 */

	public void setRecallDao(final RecallDao recallDao)
	{
		this.recallDao = recallDao;
	}

	/**
	 * @return the modelService
	 */

	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}



}

