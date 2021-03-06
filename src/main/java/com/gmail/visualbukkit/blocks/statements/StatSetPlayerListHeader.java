package com.gmail.visualbukkit.blocks.statements;

import com.gmail.visualbukkit.blocks.StatementBlock;
import com.gmail.visualbukkit.blocks.annotations.Category;
import com.gmail.visualbukkit.blocks.annotations.Description;
import org.bukkit.entity.Player;

@Category(Category.PLAYER)
@Description("Sets the player list header for a player")
public class StatSetPlayerListHeader extends StatementBlock {

    public StatSetPlayerListHeader() {
        init("set player list header of ", Player.class, " to ", String.class);
    }

    @Override
    public String toJava() {
        return arg(0) + ".setPlayerListHeader(" + arg(1) + ");";
    }
}
