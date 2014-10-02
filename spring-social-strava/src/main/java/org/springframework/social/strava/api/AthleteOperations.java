/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.strava.api;

import java.util.List;

/**
 * Interface defining the operations for working with Strava users.
 * 
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public interface AthleteOperations {
	
	/**
	 * Retrieves the user's Strava profile ID.
	 * 
	 * @return the user's Strava profile ID.
	 */
	String getProfileId();

	List<StravaSegment> getSegments(String user);


    /**
     * Retrieves the athlete's profile details.
     *
     * @return the athlete's Strava profile
     */
    StravaAthleteProfile getAthleteProfile();

    String getProfileUrl();
}