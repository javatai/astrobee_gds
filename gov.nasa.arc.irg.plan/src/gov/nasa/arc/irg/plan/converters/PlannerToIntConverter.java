/******************************************************************************
 * Copyright © 2019, United States Government, as represented by the 
 * Administrator of the National Aeronautics and Space Administration. All 
 * rights reserved.
 * 
 * The Astrobee Control Station platform is licensed under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except in compliance 
 * with the License. You may obtain a copy of the License at
 * 
 * 	http://www.apache.org/licenses/LICENSE-2.0. 
 *   
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations 
 * under the License.
 *****************************************************************************/
package gov.nasa.arc.irg.plan.converters;

import org.eclipse.core.databinding.conversion.Converter;

import rapid.ext.astrobee.SETTINGS_PLANNER_TYPE_QUADRATIC_PROGRAM;
import rapid.ext.astrobee.SETTINGS_PLANNER_TYPE_TRAPEZOIDAL;

public class PlannerToIntConverter extends Converter {

	public PlannerToIntConverter() {
		super(String.class, Integer.TYPE);
	}

	@Override
	public Object convert(Object fromObject) {
		if(fromObject instanceof String) {
			if(fromObject.equals(SETTINGS_PLANNER_TYPE_TRAPEZOIDAL.VALUE)) {
				return 0;
			}
			if(fromObject.equals(SETTINGS_PLANNER_TYPE_QUADRATIC_PROGRAM.VALUE)) {
				return 1;
			}
		}
		return null;
	}

}
