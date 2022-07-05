/**
 *
 */

package my.training.core.dealer.service;

import java.util.List;

import my.training.core.model.RecallModel;


/**
 * @author ICON
 *
 */
public interface RecallService
{

	public RecallModel getRecallById(String recallCode);

	public List<RecallModel> getRecallModels();
}

