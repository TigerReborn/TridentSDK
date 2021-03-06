/*
 * Trident - A Multithreaded Server Alternative
 * Copyright 2014 The TridentSDK Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.tridentsdk.entity.vehicle;

/**
 * Represents a TNT Minecart
 *
 * @author TridentSDK Team
 */
public interface TNTMinecart extends MinecartBase {

    /**
     * Gets the fuse time for this TNT Minecart
     *
     * @return this TNT Minecart's fuse time
     */
    int fuseTime();

    /**
     * Sets the fuse time for this TNT Minecart
     *
     * @param time the time to set
     */
    void setFuseTime(int time);
}
