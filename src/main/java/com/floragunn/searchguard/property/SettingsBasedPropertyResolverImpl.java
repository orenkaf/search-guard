package com.floragunn.searchguard.property;

import com.floragunn.searchguard.util.ConfigConstants;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;

/**
 * Created by ORENKAF on 12/30/2015.
 */
public class SettingsBasedPropertyResolverImpl implements PropertyResolver {

	private final Settings settings;

	@Inject
	public SettingsBasedPropertyResolverImpl(final Settings settings) {
		this.settings = settings;
	}

	@Override
	public String getProperty(String propertyName, String defaultValue) {
		return settings.get(propertyName, defaultValue);
	}
}
