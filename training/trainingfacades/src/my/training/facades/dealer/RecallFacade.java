/**
 *
 */
package my.training.facades.dealer;

import my.training.facades.recall.data.RecallData;



/**
 * @author ICON
 *
 */
public interface RecallFacade
{
	void saveOrUpdate(RecallData recallDetails);

	public RecallData getRecallModels();

}
