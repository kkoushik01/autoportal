/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 27-Jun-2022, 12:09:30 PM                    ---
 * ----------------------------------------------------------------
 */
package my.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.training.core.constants.TrainingCoreConstants;
import my.training.core.jalo.Recall;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Dealer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDealer extends GenericItem
{
	/** Qualifier of the <code>Dealer.dealerCode</code> attribute **/
	public static final String DEALERCODE = "dealerCode";
	/** Qualifier of the <code>Dealer.dealerName</code> attribute **/
	public static final String DEALERNAME = "dealerName";
	/** Qualifier of the <code>Dealer.recalls</code> attribute **/
	public static final String RECALLS = "recalls";
	/**
	* {@link OneToManyHandler} for handling 1:n RECALLS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Recall> RECALLSHANDLER = new OneToManyHandler<Recall>(
	TrainingCoreConstants.TC.RECALL,
	true,
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
		tmp.put(DEALERCODE, AttributeMode.INITIAL);
		tmp.put(DEALERNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerCode</code> attribute.
	 * @return the dealerCode
	 */
	public String getDealerCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEALERCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerCode</code> attribute.
	 * @return the dealerCode
	 */
	public String getDealerCode()
	{
		return getDealerCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerCode</code> attribute. 
	 * @param value the dealerCode
	 */
	public void setDealerCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEALERCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerCode</code> attribute. 
	 * @param value the dealerCode
	 */
	public void setDealerCode(final String value)
	{
		setDealerCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerName</code> attribute.
	 * @return the dealerName
	 */
	public String getDealerName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEALERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerName</code> attribute.
	 * @return the dealerName
	 */
	public String getDealerName()
	{
		return getDealerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerName</code> attribute. 
	 * @param value the dealerName
	 */
	public void setDealerName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEALERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerName</code> attribute. 
	 * @param value the dealerName
	 */
	public void setDealerName(final String value)
	{
		setDealerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.recalls</code> attribute.
	 * @return the recalls
	 */
	public List<Recall> getRecalls(final SessionContext ctx)
	{
		return (List<Recall>)RECALLSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.recalls</code> attribute.
	 * @return the recalls
	 */
	public List<Recall> getRecalls()
	{
		return getRecalls( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.recalls</code> attribute. 
	 * @param value the recalls
	 */
	public void setRecalls(final SessionContext ctx, final List<Recall> value)
	{
		RECALLSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.recalls</code> attribute. 
	 * @param value the recalls
	 */
	public void setRecalls(final List<Recall> value)
	{
		setRecalls( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recalls. 
	 * @param value the item to add to recalls
	 */
	public void addToRecalls(final SessionContext ctx, final Recall value)
	{
		RECALLSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recalls. 
	 * @param value the item to add to recalls
	 */
	public void addToRecalls(final Recall value)
	{
		addToRecalls( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recalls. 
	 * @param value the item to remove from recalls
	 */
	public void removeFromRecalls(final SessionContext ctx, final Recall value)
	{
		RECALLSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recalls. 
	 * @param value the item to remove from recalls
	 */
	public void removeFromRecalls(final Recall value)
	{
		removeFromRecalls( getSession().getSessionContext(), value );
	}
	
}
