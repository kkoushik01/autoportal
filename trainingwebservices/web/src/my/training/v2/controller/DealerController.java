package my.training.v2.controller;

import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdAndUserIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import my.training.facades.dealer.DealerFacade;
import my.training.facades.dealer.data.DealerData;
import my.training.facades.dealer.data.DealerListData;
import my.training.facades.recall.data.RecallData;
import my.training.v2.controller.dealer.dto.DealerListWsDTO;
import my.training.v2.controller.dealer.dto.DealerWsDTO;


@Controller

@RequestMapping(value = "/{baseSiteId}/dealers")
public class DealerController extends BaseController
{

	@Resource(name = "dealerFacade")
	private DealerFacade dealerFacade;


	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@ApiOperation(nickname = "saveDealers", value = "Save Dealers", notes = "Saving Dealers Info.")
	@ApiBaseSiteIdAndUserIdParam
	public DealerWsDTO save(@RequestBody // one to many relationships for dealer to recall
	final DealerData dealerDetails)
	{
		dealerFacade.saveOrUpdate(dealerDetails);
		return null;
	}




	@GetMapping(value = "/dealersList", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(nickname = "getDealers", value = "Get Dealers", notes = "Return Dealers Info.")
	@ApiBaseSiteIdAndUserIdParam
	@ResponseBody
	public DealerListWsDTO getAllDealerDetails(@RequestParam(defaultValue = DEFAULT_FIELD_SET)
	@PathVariable final String fields)
	{

		final List<DealerData> dealersData = dealerFacade.getAllDealerDetails();
		final DealerListData dealerDataList = new DealerListData();

		dealerDataList.setDealers(dealersData);

		final List<RecallData> recallData = new ArrayList<>();

		return getDataMapper().map(dealerDataList, DealerListWsDTO.class, fields);

	}



	@RequestMapping(value = "/getDealerByCode", method = RequestMethod.GET)
	@ResponseBody
	@ApiBaseSiteIdAndUserIdParam
	public DealerWsDTO getDealerDetailsByCode(@RequestParam(required = true) final String dealerCode,
			@ApiParam(value = "dealerCode", required = true)
			 @PathVariable	@ApiFieldsParam  @RequestParam(defaultValue =  DEFAULT_FIELD_SET) final String fields)
	{
		{
			final DealerData dealerCodeById = dealerFacade.getDealerDetailsByCode(dealerCode);
			return getDataMapper().map(dealerCodeById, DealerWsDTO.class, fields);
		}
	}


	/**
	 * @return the dealerFacade
	 */
	public DealerFacade getDealerFacade()
	{
		return dealerFacade;
	}


	/**
	 * @param dealerFacade
	 *           the dealerFacade to set
	 */
	public void setDealerFacade(final DealerFacade dealerFacade)
	{
		this.dealerFacade = dealerFacade;
	}


}

