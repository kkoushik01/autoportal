
package my.training.facades.dealer.Impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import my.training.core.dealer.service.DealerService;
import my.training.core.dealer.service.RecallService;
import my.training.core.model.DealerModel;
import my.training.core.model.RecallModel;
import my.training.facades.dealer.DealerFacade;
import my.training.facades.dealer.data.DealerData;


/**
 * @author USER
 *
 */



public class DealerFacadeImpl implements DealerFacade
{
	private DealerService dealerService;

	private RecallService recallService;


	private Converter<DealerModel, DealerData> dealerConverter;


	private ModelService modelService;


	/**
	 * @return the dealerService
	 */



	@Override
	public void saveOrUpdate(final DealerData dealerDetails) // one to many relationship for dealer to recall
	{
		final DealerModel dealerData = modelService.create(DealerModel.class);
		dealerData.setDealerCode(dealerDetails.getDealerCode());
		dealerData.setDealerName(dealerDetails.getDealerName());
		final List<RecallModel> recallData = recallService.getRecallModels();
		dealerData.setRecalls(recallData);
		modelService.save(dealerData);
	}



	@Override
		public List<DealerData> getAllDealerDetails()
		{
			final List<DealerModel> dealerData = dealerService.getAllDealerDetails();
			return dealerConverter.convertAll(dealerData);
		}




		@Override
		public DealerData getDealerDetailsByCode(final String dealerCode)
		{
			final DealerModel dealerModels = dealerService.getDealerDetailsByCode(dealerCode);
			return dealerConverter.convert(dealerModels);

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






}



