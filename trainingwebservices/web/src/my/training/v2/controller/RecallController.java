/**
 *
 */
package my.training.v2.controller;

import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdAndUserIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import my.training.facades.dealer.RecallFacade;
import my.training.facades.recall.data.RecallData;
import my.training.v2.controller.recall.dto.RecallListWsDTO;
import my.training.v2.controller.recall.dto.RecallWsDTO;



/**
 * @author ICON
 *
 */
@Controller

@RequestMapping(value = "/{baseSiteId}/recalls")
public class RecallController extends BaseController
{

	@Resource(name = "recallFacade")
	private RecallFacade recallFacade;


	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(nickname = "getRecalls", value = "Get Recalls", notes = "Return Recalls.")
	@ApiBaseSiteIdParam

	public RecallWsDTO saveOrUpdate(@RequestBody
	final RecallData recallDetails)
	{
		recallFacade.saveOrUpdate(recallDetails);
		return null;
	}




	@RequestMapping(value = "/getRecallById", method = RequestMethod.GET)
	@ResponseBody
	@ApiBaseSiteIdAndUserIdParam
	public RecallWsDTO getRecallById(@RequestParam(required = true) final String id,
			 @ApiParam(value = "dealerCode", required = true)
	       @PathVariable	@ApiFieldsParam @RequestParam(defaultValue =  DEFAULT_FIELD_SET)  final String fields)
	{
		final RecallData recallById = recallFacade.getRecallById(id);
		return getDataMapper().map(recallById, RecallWsDTO.class, fields);
	}




	@GetMapping(value = "/getRecalls", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiBaseSiteIdAndUserIdParam
	@ResponseBody
	public RecallListWsDTO getRecallDetails(@ApiFieldsParam
	@RequestParam(defaultValue = DEFAULT_FIELD_SET)
	final String fields)
	{
		{
			final List<RecallData> recallData = recallFacade.getRecallModels();
			return getDataMapper().map(recallData, RecallListWsDTO.class, fields);
		}
	}




	/**
	 * @return the recallFacade
	 */
	public RecallFacade getRecallFacade()
	{
		return recallFacade;
	}



	/**
	 * @param recallFacade
	 *           the recallFacade to set
	 */
	public void setRecallFacade(final RecallFacade recallFacade)
	{
		this.recallFacade = recallFacade;
	}

}


