/**
 * Copyright 2012 Spindrift
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.spindrift.gradle.atg

import org.gradle.util.ConfigureUtil

import com.spindrift.gradle.process.ConfigurationsContainer
import com.spindrift.gradle.process.Options
import com.spindrift.gradle.process.ScriptConfiguration

class StartSQLImportExtension {
  
  String name
  def name(String name) {
    name = name
  }
  
  ConfigurationsContainer imports = new ConfigurationsContainer()
  void imports(Closure closure) {
    ConfigureUtil.configure(closure, imports)
  }
}