/**
 *
 */
package my.training.core.dealer.service;

import java.util.List;

import my.training.core.model.DealerModel;


/**
 * @author USER
 *
 */
public interface DealerService
{


	public List<DealerModel> getAllDealerDetails();

	public DealerModel getDealerDetailsByCode(String dealerCode);
}


