/**
 *
 */
package my.training.facades.dealer;

import java.util.List;

import my.training.facades.recall.data.RecallData;



/**
 * @author ICON
 *
 */
public interface RecallFacade
{
	void saveOrUpdate(RecallData recallDetails);

	public RecallData getRecallById(String recallCode);

	public List<RecallData> getRecallModels();

}
