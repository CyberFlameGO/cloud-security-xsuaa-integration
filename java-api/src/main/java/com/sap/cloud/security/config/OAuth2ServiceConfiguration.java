/**
 * SPDX-FileCopyrightText: 2018-2021 SAP SE or an SAP affiliate company and Cloud Security Client Java contributors
 * 
 * SPDX-License-Identifier: Apache-2.0
 */
package com.sap.cloud.security.config;

import javax.annotation.Nullable;

import java.net.URI;
import java.util.Map;

/**
 * Provides information of the identity {@link Service}.
 */
public interface OAuth2ServiceConfiguration {

	/**
	 * Client id of identity service instance.
	 *
	 * @return client identifier
	 */
	String getClientId();

	/**
	 * Client secret of identity service instance.
	 *
	 * @return client secret
	 */
	String getClientSecret();

	/**
	 * Base URL of the OAuth2 identity service instance. In multi tenancy scenarios
	 * this is the url where the service instance was created.
	 *
	 * @return base url, e.g. https://paastenant.idservice.com
	 */
	URI getUrl();

	/**
	 * Domain of the OAuth2 identity service instance.
	 *
	 * @return domain, e.g."idservice.com"
	 */
	String getDomain();

	/**
	 * Returns the value of the given property as string.
	 *
	 * @param name
	 *            the name of the property. You can find constants in
	 *            {@link com.sap.cloud.security.config.cf.CFConstants}
	 * @return the string value of the given property or null if the property does
	 *         not exist.
	 */
	@Nullable
	String getProperty(String name);

	/**
	 * Returns all properties of the configuration as a map.
	 * 
	 * @return all properties as map.
	 */
	Map<String, String> getProperties();

	/**
	 * Returns true if the configuration contains the given property.
	 *
	 * @param name
	 *            the name of the property. You can find constants in
	 *            {@link com.sap.cloud.security.config.cf.CFConstants}
	 * @return true if the property does not exist.
	 */
	boolean hasProperty(String name);

	/**
	 * Returns the identity {@link Service} of this configuration.
	 *
	 * @return the service.
	 */
	Service getService();

	/**
	 * Returns true, in case of XSUAA service runs in legacy mode.
	 *
	 * @return true in case it runs in legacy mode.
	 */
	boolean isLegacyMode();
}
