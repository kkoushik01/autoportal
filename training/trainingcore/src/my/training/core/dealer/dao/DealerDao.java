/**
 *
 */
package my.training.core.dealer.dao;

import java.util.List;

import my.training.core.model.DealerModel;


/**
 * @author USER
 *
 */
public interface DealerDao

{




	public List<DealerModel> getAllDealerDetails(); //get dealer details ( one to many relation) List recall

	public DealerModel getDealerDetailsByCode(String dealerCode); // get dealer details by code (List recall)

	//public Dealer                                                      //dealer single recall
}
