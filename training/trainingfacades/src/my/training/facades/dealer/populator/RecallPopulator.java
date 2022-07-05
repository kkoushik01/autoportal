/**
 *
 */
package my.training.facades.dealer.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import my.training.core.dealer.service.RecallService;
import my.training.core.model.RecallModel;
import my.training.facades.recall.data.RecallData;


/**
 * @author ICON
 *
 */
public class RecallPopulator implements Populator<RecallModel, RecallData>
{

	private Converter<RecallModel, RecallData> recallConverter;


	private RecallService recallService;



	@Override
	public void populate(final RecallModel source, final RecallData target) throws ConversionException
	{
		target.setChassisNumber(source.getChassisNumber());
		target.setRecallCode(source.getRecallCode());
		target.setRecallReason(source.getRecallReason());
		target.setVehicleMake(source.getVehicleMake());


	}



	/**
	 * @return the recallConverter
	 */
	public Converter<RecallModel, RecallData> getRecallConverter()
	{
		return recallConverter;
	}



	/**
	 * @param recallConverter
	 *           the recallConverter to set
	 */
	public void setRecallConverter(final Converter<RecallModel, RecallData> recallConverter)
	{
		this.recallConverter = recallConverter;
	}



	/**
	 * @return the recallService
	 */
	public RecallService getRecallService()
	{
		return recallService;
	}



	/**
	 * @param recallService
	 *           the recallService to set
	 */
	public void setRecallService(final RecallService recallService)
	{
		this.recallService = recallService;
	}





}
