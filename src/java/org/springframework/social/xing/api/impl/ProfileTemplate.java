/*
 * Copyright 2012 the original author or authors.
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
package org.springframework.social.xing.api.impl;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.social.xing.api.ProfileOperations;
import org.springframework.social.xing.api.XingProfile;
import org.springframework.social.xing.api.XingProfiles;
import org.springframework.web.client.RestOperations;

import static org.springframework.social.xing.api.impl.XingTemplate.BASE_URL;

/**
 * Class that implements operations for Profile API
 * 
 * @author Robert Drysdale
 */
class ProfileTemplate extends AbstractTemplate implements ProfileOperations {

	private RestOperations restOperations;

    static final String USERS_URL = BASE_URL + "/users/{id}.json";
    static final String PROFILE_FIELDS = "id,first_name,last_name,permalink,active_email,display_name,gender,photo_urls,birth_date";

	private ObjectMapper objectMapper;
    public ProfileTemplate(RestOperations restOperations, ObjectMapper objectMapper) {
		this.restOperations = restOperations;
		this.objectMapper = objectMapper;
	}

	public String getProfileId() {
		return getUserProfile().getId();
	}

    public XingProfile getUserProfile() {
		return getProfileById("me", null);
	}

    public XingProfile getProfileById(String id) {
        return getProfileById(id, null);
    }

	public XingProfile getProfileById(String id, String fields) {
        if(fields != null){
            return restOperations.getForObject(USERS_URL+"?fields="+fields, XingProfiles.class, id).getUsers().get(0);
        }else{
            return restOperations.getForObject(USERS_URL, XingProfiles.class, id).getUsers().get(0);
        }
	}



}
