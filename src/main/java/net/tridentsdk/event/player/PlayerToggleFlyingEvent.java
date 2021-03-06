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

package net.tridentsdk.event.player;

import net.tridentsdk.entity.living.Player;
import net.tridentsdk.event.Cancellable;

/**
 * Called when a player attempts to change their flying state i.e. double-taps jump
 * <p>
 *     If a player can't change into this mode due to their fly mode being false, then the server
 *     will call this event already cancelled, and plugins may uncancel it.
 * </p>
 */
public class PlayerToggleFlyingEvent extends PlayerEvent implements Cancellable {
    private final boolean toggleState;
    private boolean cancelled;
    private final boolean flyMode;

    public PlayerToggleFlyingEvent(Player player, boolean toggleState, boolean flyMode) {
        super(player);
        this.toggleState = toggleState;
        this.flyMode = flyMode;
    }

    /**
     * Returns the state the player is attempting to toggle into, true for flying, false for not
     */
    public boolean toggleState() {
        return this.toggleState;
    }

    public boolean isFlyMode() {
        return this.flyMode;
    }

    @Override
    public boolean isIgnored() {
        return cancelled;
    }

    @Override
    public void cancel(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
