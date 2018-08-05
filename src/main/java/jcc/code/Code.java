package jcc.code;

import jcc.MutableLong;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Code {
    public enum Instruction {
        PUSH,
        RET,
        ENTRY,
        ADD,
        SUB,
        MUL,
        DIV,
        FRAME,
        STOREL,
        LOADL,
        CALL,
        POPR,
    }
    
    private final Instruction inst;
    private MutableLong operand;
}
