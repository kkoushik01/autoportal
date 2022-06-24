/**
 *
 */
package my.training.core.dealer.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.training.core.dealer.dao.DealerDao;
import my.training.core.model.DealerModel;


/**
 * @author USER
 *
 */
public class DealerDaoImpl implements DealerDao
{


	private FlexibleSearchService flexibleSearchService;




	@Override
	public List<DealerModel> getAllDealerDetails()
	{
		final String query = "select {pk} from{dealer}";
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
		final SearchResult<DealerModel> search = getFlexibleSearchService().search(flexibleSearchQuery);
		return search.getResult();
	}


	@Override
	public DealerModel getDealerDetailsByCode(final String dealerCode)
	{
		final String query = "select {pk} from{dealer}";
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
		final SearchResult<DealerModel> search = getFlexibleSearchService().search(flexibleSearchQuery);
		return search.getResult().get(0);
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

