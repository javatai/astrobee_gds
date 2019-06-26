/*******************************************************************************
 * Copyright (c) 2013 United States Government as represented by the 
 * Administrator of the National Aeronautics and Space Administration. 
 * All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package gov.nasa.arc.verve.common.preferences;

import java.io.File;

import com.ardor3d.math.ColorRGBA;

public interface IVervePreferences {

    /** 
     * determines whether the debug axis is drawn at  the center of 
     * the spatial's bounding volume (true) or the origin of the spatial (false)
     * @param state
     */
    public boolean isDebugAxisUseBoundCenter();

    /** 
     * immediately show bounds of spatial when selected in Scene Graph view
     * @param state
     */
    public boolean isShowBoundsOnSelect();

    /**
     * get data dir (create if necessary)
     */
    public File getDataDir();
    
    public boolean useFallbackShaders();
    
    ColorRGBA getDefaultBackgroundColor();
    
    public int getTargetFramerate();

    public int getShadowMapSize();
}