package jcc.ast;

import jcc.NodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class VarLetNode extends StmtNode {
    private VarRefNode var;
    private ExprNode expr;
    
    @Override
    public <E, S> S accept(NodeVisitor<E, S> v) {
        return v.visit(this);
    }
}
