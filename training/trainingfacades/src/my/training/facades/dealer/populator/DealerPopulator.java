/**
 *
 */
package my.training.facades.dealer.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import my.training.core.dealer.service.DealerService;
import my.training.core.model.DealerModel;
import my.training.core.model.RecallModel;
import my.training.facades.dealer.data.DealerData;
import my.training.facades.recall.data.RecallData;


/**
 * @author USER
 *
 */
public class DealerPopulator implements Populator<DealerModel, DealerData>
{

	private Converter<RecallModel, RecallData> recallConverter;

	private Converter<DealerModel, DealerData> dealerConverter;

	private DealerService dealerService;



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
	 * @return the dealerConverter
	 */
	public Converter<DealerModel, DealerData> getDealerConverter()
	{
		return dealerConverter;
	}



	/**
	 * @param dealerConverter
	 *           the dealerConverter to set
	 */
	public void setDealerConverter(final Converter<DealerModel, DealerData> dealerConverter)
	{
		this.dealerConverter = dealerConverter;
	}




	/**
	 * @return the dealerService
	 */
	public DealerService getDealerService()
	{
		return dealerService;
	}


	/**
	 * @param dealerService
	 *           the dealerService to set
	 */
	public void setDealerService(final DealerService dealerService)
	{
		this.dealerService = dealerService;
	}




	@Override
	public void populate(final DealerModel source, final DealerData target) throws ConversionException
	{

		target.setDealerCode(source.getDealerCode());
		target.setDealerName(source.getDealerName());
		target.setRecalls(recallConverter.convertAll(source.getRecalls()));
	}




}




