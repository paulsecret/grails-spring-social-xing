/* Copyright 2011 the original author or authors.
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
package grails.plugins.springsocial.config.xing

import grails.plugins.springsocial.linkedin.SpringSocialXingUtils
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Scope
import org.springframework.context.annotation.ScopedProxyMode
import org.springframework.social.connect.ConnectionFactory
import org.springframework.social.connect.ConnectionRepository
import org.springframework.social.xing.api.Xing
import org.springframework.social.xing.api.impl.XingTemplate
import org.springframework.social.xing.connect.XingConnectionFactory
import org.springframework.util.Assert

import javax.inject.Inject

@Configuration
class XingConfig {
  @Inject
  ConnectionRepository connectionRepository


  @Bean
  ConnectionFactory xingConnectionFactory() {
    println "Configuring SpringSocial Xing"
    def xingConfig = SpringSocialXingUtils.config.get("xing")
    String consumerKey = xingConfig.consumerKey ?: ""
    String consumerSecret = xingConfig.consumerSecret ?: ""
    Assert.hasText(consumerKey, "The Xing consumerKey is necessary, please add to the Config.groovy as follows: grails.plugins.springsocial.xing.consumerKey='yourConsumerKey'")
    Assert.hasText(consumerSecret, "The Xing consumerSecret is necessary, please add to the Config.groovy as follows: grails.plugins.springsocial.xing.consumerSecret='yourConsumerSecret'")
    new XingConnectionFactory(consumerKey, consumerSecret)
  }

  @Bean
  @Scope(value = "request", proxyMode = ScopedProxyMode.INTERFACES)
  Xing xing() {
    def xing = connectionRepository.findPrimaryConnection(Xing)
      xing != null ? xing.getApi() : new XingTemplate()
  }
}
