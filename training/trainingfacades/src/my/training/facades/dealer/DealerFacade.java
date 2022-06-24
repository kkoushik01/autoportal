/**
 *
 */
package my.training.facades.dealer;

import java.util.List;

import my.training.facades.dealer.data.DealerData;


/**
 * @author USER
 *
 */
public interface DealerFacade
{


	public void saveOrUpdate(DealerData dealerDetails); //dealer one2many relation with recall


	public List<DealerData> getAllDealerDetails();


	public DealerData getDealerDetailsByCode(String dealerCode);

	/**
	 * @return
	 */
}

