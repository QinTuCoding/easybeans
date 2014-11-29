/**
 * Copyright 2014 Tomas Rodriguez 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0 
 *  
 *  Unless required by applicable law or agreed to in writing, software 
 *  distributed under the License is distributed on an "AS IS" BASIS, 
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 *  See the License for the specific language governing permissions and 
 *  limitations under the License. 
 */

package com.github.talberto.easybeans.gen;

import java.util.List;

/**
 * Describes a bean that doesn't exist yet.
 * 
 * @author Tomás Rodríguez (rodriguez@progiweb.com)
 *
 */
public class BeanDefinition {

  protected final String mBeanName;
  protected final List<PropertyDefinition> mProperties;
  
  public BeanDefinition(String pBeanName, List<PropertyDefinition> pProperties) {
    mBeanName = pBeanName;
    mProperties = pProperties;
  }

  /**
   * Gets the bean's name
   * 
   * @return
   */
  public String getBeanName() {
    return mBeanName;
  }

  /**
   * Gets the list of properties of <code>this</code> BeanDefinition
   * 
   * @return
   */
  public List<PropertyDefinition> getProperties() {
    return mProperties;
  }
}