/**
 *
 */
package my.training.facades.dealer.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.training.core.model.RecallModel;
import my.training.facades.recall.data.RecallData;


/**
 * @author ICON
 *
 */
public class RecallPopulator implements Populator<RecallModel, RecallData>
{



	@Override
	public void populate(final RecallModel source, final RecallData target) throws ConversionException
	{
		target.setChassisNumber(source.getChassisNumber());
		target.setRecallCode(source.getRecallCode());
		target.setRecallReason(source.getRecallReason());
		target.setVehicleMake(source.getVehicleMake());

	}

}
