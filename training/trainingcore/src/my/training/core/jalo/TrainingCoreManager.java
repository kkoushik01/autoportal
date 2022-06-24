package my.training.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import my.training.core.constants.TrainingCoreConstants;
import org.apache.log4j.Logger;

public class TrainingCoreManager extends GeneratedTrainingCoreManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( TrainingCoreManager.class.getName() );
	
	public static final TrainingCoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TrainingCoreManager) em.getExtension(TrainingCoreConstants.EXTENSIONNAME);
	}
	
}
