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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.ApiOperation;
import my.training.facades.dealer.RecallFacade;
import my.training.facades.recall.data.RecallData;
import my.training.facades.recall.data.RecallListData;
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


	@GetMapping(value = "/getRecalls", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiBaseSiteIdAndUserIdParam
	@ResponseBody
	public RecallWsDTO getRecallDetails(@ApiFieldsParam
	@RequestParam(defaultValue = DEFAULT_FIELD_SET)
	final String fields)
	{
		{
			final List<RecallData> recallData = recallFacade.getRecallModels();
			return getDataMapper().map(recallData, RecallWsDTO.class, fields);
		}
	}


	@RequestMapping("/listRecalls")
	@ResponseBody
	public RecallListWsDTO getRecallsById(final String fields)
	{
		final List<RecallData> recall = recallFacade.getRecallModels();
		final RecallListData recallListData = new RecallListData();
		recallListData.setRecalls(recall);
		return getDataMapper().map(recallListData, RecallListWsDTO.class, fields);
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


