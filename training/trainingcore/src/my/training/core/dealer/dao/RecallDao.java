/**
 *
 */

package my.training.core.dealer.dao;

import java.util.List;

import my.training.core.model.RecallModel;


/**
 * @author ICON
 *
 */
public interface RecallDao

{
	public RecallModel getRecallById(String id); // get recall details by id

	public List<RecallModel> getRecallModels(); // get recall details

}

