/*
 * Generated by Robotoworks Mechanoid
 */
package eu.masconsult.template.recipes.ops;

import com.robotoworks.mechanoid.ops.OperationServiceConfiguration;
import com.robotoworks.mechanoid.ops.OperationConfigurationRegistry;

public abstract class AbstractRecipesServiceConfiguration extends OperationServiceConfiguration {
	private OperationConfigurationRegistry mOperationConfigurationRegistry = new RecipesServiceOperationConfigurationRegistry();
	
	@Override
	public OperationConfigurationRegistry getOperationConfigurationRegistry() {
		return mOperationConfigurationRegistry;
	}
}
