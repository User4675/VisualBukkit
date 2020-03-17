package us.donut.visualbukkit.blocks.expressions;

import org.bukkit.inventory.Inventory;
import us.donut.visualbukkit.blocks.ExpressionBlock;
import us.donut.visualbukkit.blocks.annotations.Category;
import us.donut.visualbukkit.blocks.annotations.Description;
import us.donut.visualbukkit.blocks.syntax.SyntaxNode;

@Category("Inventory")
@Description({"A new inventory", "Returns: inventory"})
public class ExprNewChestInventory extends ExpressionBlock {

    @Override
    protected SyntaxNode init() {
        return new SyntaxNode("new chest inventory named", String.class, "with size", int.class);
    }

    @Override
    public String toJava() {
        return "Bukkit.createInventory(null," + arg(1) + "," + arg(0) + ")";
    }

    @Override
    public Class<?> getReturnType() {
        return Inventory.class;
    }
}