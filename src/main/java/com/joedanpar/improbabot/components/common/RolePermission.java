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
package com.joedanpar.improbabot.components.common;

import lombok.Getter;

public enum RolePermission {
    OWNER(3, "108972717608284160"), BOT_ADMIN(2, "admin"), GAME_MASTER(1, "game master"), EVERYONE(0, "@everyone");

    @Getter
    int roleLevel;

    @Getter
    String roleName;

    RolePermission(final int roleLevel, final String roleName) {
        this.roleLevel = roleLevel;
        this.roleName = roleName;
    }
}