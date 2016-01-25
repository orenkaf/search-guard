package com.floragunn.searchguard.property;

import org.elasticsearch.common.settings.Settings;

/**
 * Created by ORENKAF on 12/30/2015.
 */
public interface PropertyResolver {
	String getProperty(String propertyName, String defaultValue);
}
