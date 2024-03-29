package jcc;

import jcc.ast.AddressNode;
import jcc.ast.BinOpNode;
import jcc.ast.BlockNode;
import jcc.ast.BreakNode;
import jcc.ast.ContinueNode;
import jcc.ast.DereferNode;
import jcc.ast.ExprStmtNode;
import jcc.ast.FuncCallNode;
import jcc.ast.FuncDefNode;
import jcc.ast.IfNode;
import jcc.ast.IntLiteralNode;
import jcc.ast.PrintfNode;
import jcc.ast.ReturnNode;
import jcc.ast.StrLiteralNode;
import jcc.ast.VarDefNode;
import jcc.ast.VarInitNode;
import jcc.ast.VarLetNode;
import jcc.ast.VarRefNode;
import jcc.ast.WhileNode;

public interface NodeVisitor<E, S> {
    // expr
    E visit(IntLiteralNode n);
    E visit(BinOpNode n);
    E visit(VarRefNode n);
    E visit(FuncCallNode n);
    E visit(StrLiteralNode n);
    E visit(AddressNode n);
    E visit(DereferNode n);
    // stmt
    S visit(BlockNode n);
    S visit(FuncDefNode n);
    S visit(VarDefNode n);
    S visit(ReturnNode n);
    S visit(VarLetNode n);
    S visit(VarInitNode n);
    S visit(ExprStmtNode n);
    S visit(IfNode n);
    S visit(WhileNode n);
    S visit(BreakNode n);
    S visit(ContinueNode n);
    
    S visit(PrintfNode n);
}
