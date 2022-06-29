/**
 *
 */

package my.training.core.dealer.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.training.core.dealer.dao.RecallDao;
import my.training.core.model.RecallModel;


/**
 * @author ICON
 *
 */

public class RecallDaoImpl implements RecallDao
{
	private FlexibleSearchService flexibleSearchService;



	@Override
	public RecallModel getRecallById(final String id)
	{
		final String query = "select {pk} from{recall}";
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
		final SearchResult<RecallModel> search = getFlexibleSearchService().search(flexibleSearchQuery);
		return search.getResult().get(0);
	}


	@Override
	public List<RecallModel> getRecallModels()
	{
		final String query = "select {pk} from{recall}";
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
		final SearchResult<RecallModel> search = getFlexibleSearchService().search(flexibleSearchQuery);
		return search.getResult();
	}



	/**
	 * @return the flexibleSearchService
	 */

	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}



	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}



}

