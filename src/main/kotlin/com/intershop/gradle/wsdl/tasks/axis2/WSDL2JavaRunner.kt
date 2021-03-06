/*
 * Copyright 2017 Intershop Communications AG.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
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
package com.intershop.gradle.wsdl.tasks.axis2

import org.apache.axis2.wsdl.WSDL2Code
import org.gradle.workers.WorkAction

/**
 * This is the task runner for WSDL2Java.
 *
 * @constructor standard constructor of a runner.
 */
abstract class WSDL2JavaRunner : WorkAction<WSDL2JavaParameters> {

    override fun execute() {
        WSDL2Code.main(parameters.paramList.get().toTypedArray())
    }
}
