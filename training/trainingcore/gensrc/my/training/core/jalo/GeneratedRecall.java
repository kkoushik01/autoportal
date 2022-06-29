/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-Jun-2022, 11:16:48 PM                    ---
 * ----------------------------------------------------------------
 */
package my.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.training.core.constants.TrainingCoreConstants;
import my.training.core.jalo.Dealer;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Recall}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedRecall extends GenericItem
{
	/** Qualifier of the <code>Recall.recallCode</code> attribute **/
	public static final String RECALLCODE = "recallCode";
	/** Qualifier of the <code>Recall.vehicleMake</code> attribute **/
	public static final String VEHICLEMAKE = "vehicleMake";
	/** Qualifier of the <code>Recall.recallReason</code> attribute **/
	public static final String RECALLREASON = "recallReason";
	/** Qualifier of the <code>Recall.chassisNumber</code> attribute **/
	public static final String CHASSISNUMBER = "chassisNumber";
	/** Qualifier of the <code>Recall.dealers</code> attribute **/
	public static final String DEALERS = "dealers";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DEALERS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRecall> DEALERSHANDLER = new BidirectionalOneToManyHandler<GeneratedRecall>(
	TrainingCoreConstants.TC.RECALL,
	false,
	"dealers",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(RECALLCODE, AttributeMode.INITIAL);
		tmp.put(VEHICLEMAKE, AttributeMode.INITIAL);
		tmp.put(RECALLREASON, AttributeMode.INITIAL);
		tmp.put(CHASSISNUMBER, AttributeMode.INITIAL);
		tmp.put(DEALERS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recall.chassisNumber</code> attribute.
	 * @return the chassisNumber
	 */
	public String getChassisNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CHASSISNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recall.chassisNumber</code> attribute.
	 * @return the chassisNumber
	 */
	public String getChassisNumber()
	{
		return getChassisNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recall.chassisNumber</code> attribute. 
	 * @param value the chassisNumber
	 */
	public void setChassisNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CHASSISNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recall.chassisNumber</code> attribute. 
	 * @param value the chassisNumber
	 */
	public void setChassisNumber(final String value)
	{
		setChassisNumber( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DEALERSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recall.dealers</code> attribute.
	 * @return the dealers
	 */
	public Dealer getDealers(final SessionContext ctx)
	{
		return (Dealer)getProperty( ctx, DEALERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recall.dealers</code> attribute.
	 * @return the dealers
	 */
	public Dealer getDealers()
	{
		return getDealers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recall.dealers</code> attribute. 
	 * @param value the dealers
	 */
	public void setDealers(final SessionContext ctx, final Dealer value)
	{
		DEALERSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recall.dealers</code> attribute. 
	 * @param value the dealers
	 */
	public void setDealers(final Dealer value)
	{
		setDealers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recall.recallCode</code> attribute.
	 * @return the recallCode
	 */
	public String getRecallCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RECALLCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recall.recallCode</code> attribute.
	 * @return the recallCode
	 */
	public String getRecallCode()
	{
		return getRecallCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recall.recallCode</code> attribute. 
	 * @param value the recallCode
	 */
	public void setRecallCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RECALLCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recall.recallCode</code> attribute. 
	 * @param value the recallCode
	 */
	public void setRecallCode(final String value)
	{
		setRecallCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recall.recallReason</code> attribute.
	 * @return the recallReason
	 */
	public String getRecallReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RECALLREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recall.recallReason</code> attribute.
	 * @return the recallReason
	 */
	public String getRecallReason()
	{
		return getRecallReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recall.recallReason</code> attribute. 
	 * @param value the recallReason
	 */
	public void setRecallReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RECALLREASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recall.recallReason</code> attribute. 
	 * @param value the recallReason
	 */
	public void setRecallReason(final String value)
	{
		setRecallReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recall.vehicleMake</code> attribute.
	 * @return the vehicleMake
	 */
	public String getVehicleMake(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VEHICLEMAKE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recall.vehicleMake</code> attribute.
	 * @return the vehicleMake
	 */
	public String getVehicleMake()
	{
		return getVehicleMake( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recall.vehicleMake</code> attribute. 
	 * @param value the vehicleMake
	 */
	public void setVehicleMake(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VEHICLEMAKE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recall.vehicleMake</code> attribute. 
	 * @param value the vehicleMake
	 */
	public void setVehicleMake(final String value)
	{
		setVehicleMake( getSession().getSessionContext(), value );
	}
	
}
