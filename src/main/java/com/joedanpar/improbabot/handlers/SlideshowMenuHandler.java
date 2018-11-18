/*******************************************************************************
 * This file is part of Improbable Bot.
 *
 *     Improbable Bot is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Improbable Bot is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Improbable Bot.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.joedanpar.improbabot.handlers;

import com.jagrosh.jdautilities.menu.Menu;
import com.jagrosh.jdautilities.menu.Slideshow.Builder;
import lombok.val;

import java.util.Map;

public class SlideshowMenuHandler extends AbstractMenuHandler<Builder> {
    @Override
    public Builder configureBuilder(final Menu.Builder builder, final Map<String, Object> parameters) {
        val _builder = super.configureBuilder(builder, parameters);

        return _builder;
    }
}
