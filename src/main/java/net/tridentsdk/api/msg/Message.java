/*
 * Copyright (c) 2014, The TridentSDK Team
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     1. Redistributions of source code must retain the above copyright
 *        notice, this list of conditions and the following disclaimer.
 *     2. Redistributions in binary form must reproduce the above copyright
 *        notice, this list of conditions and the following disclaimer in the
 *        documentation and/or other materials provided with the distribution.
 *     3. Neither the name of the The TridentSDK Team nor the
 *        names of its contributors may be used to endorse or promote products
 *        derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL The TridentSDK Team BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package net.tridentsdk.api.msg;

import com.google.gson.JsonObject;
import net.tridentsdk.api.ChatColor;

// TODO: JavaDoc
public final class Message {

    final JsonObject message;

    public Message() {
        this.message = new JsonObject();
    }

    public Message text(String input) {
        this.message.addProperty("text", input);
        return this;
    }

    public Message color(ChatColor color) {
        this.message.addProperty("color", color.toString());

        return this;
    }

    public Message clickEvent(ClickEvent event) {
        JsonObject obj = new JsonObject();

        obj.addProperty("action", event.action.toString());
        obj.addProperty("value", event.value);

        this.message.add("clickEvent", obj);
        return this;
    }

    public Message hoverEvent(HoverEvent event) {
        JsonObject obj = new JsonObject();

        obj.addProperty("action", event.action.toString());
        obj.addProperty("value", event.value);

        this.message.add("hoverEvent", obj);
        return this;
    }

    public String toJson() {
        return MessageBuilder.GSON.toJson(this.message);
    }
}
