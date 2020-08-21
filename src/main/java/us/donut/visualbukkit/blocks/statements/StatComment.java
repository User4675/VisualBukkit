package us.donut.visualbukkit.blocks.statements;

import us.donut.visualbukkit.blocks.StatementBlock;
import us.donut.visualbukkit.blocks.annotations.Description;
import us.donut.visualbukkit.blocks.syntax.InputParameter;
import us.donut.visualbukkit.blocks.syntax.Syntax;

@Description("A comment (has no effect)")
public class StatComment extends StatementBlock {

    @Override
    protected Syntax init() {
        return new Syntax("//", new InputParameter());
    }

    @Override
    public void update() {
        super.update();
        syntaxBox.setOpacity(0.5);
    }

    @Override
    public String toJava() {
        return "";
    }
}
