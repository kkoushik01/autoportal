/**
 *
 */
package my.training.facades.dealer.Impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import my.training.core.dealer.service.RecallService;
import my.training.core.model.RecallModel;
import my.training.facades.dealer.RecallFacade;
import my.training.facades.recall.data.RecallData;



/**
 * @author ICON
 *
 */
public class RecallFacadeImpl implements RecallFacade
{




	private Converter<RecallModel, RecallData> recallConverter;

	private ModelService modelService;

	private RecallService recallService;

	/**
	 * @return the recallService
	 */
	@Override
	public void saveOrUpdate(final RecallData recallDetails)
	{
		final RecallModel recallData = modelService.create(RecallModel.class);
		recallData.setChassisNumber(recallDetails.getChassisNumber());
		recallData.setRecallCode(recallDetails.getRecallCode());
		recallData.setRecallReason(recallDetails.getRecallReason());
		recallData.setVehicleMake(recallDetails.getVehicleMake());
		modelService.save(recallData);
	}





	@Override
	public RecallData getRecallById(final String recallCode)
	{
		final RecallModel recallModels = recallService.getRecallById(recallCode);
		return recallConverter.convert(recallModels);
	}





	@Override
	public List<RecallData> getRecallModels()
	{
		final List<RecallModel> recallData = recallService.getRecallModels();
		return recallConverter.convertAll(recallData);
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
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}


	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
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
