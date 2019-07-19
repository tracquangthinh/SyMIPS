grammar MIPS;

code: statement+ EOF;
statement:  structuredStatement
            |simpleStatement;

simpleStatement: assignmentStatement
    |expression;
    // |breakStatement;

structuredStatement: conditionalStatement
    // |repetitiveStatement
     |forLoopStatement;
    // |switchStatement;

//exceptionStatement: '#'IDENT;

parameterList: expression(','expression)*;

assignmentStatement: <assoc=right> expression'←'expression
    |'('parameterList')''←'expression;

expression: factor
    |<assoc=right> expression('^')expression
    |expression('||')expression
    |expression('×'|'/'|'*')expression
    |expression('div'|'mod')expression
    |expression('or'|'and'|'xor'|'nor'|'&')expression
    |expression('<<'|'>>')expression
    |expression('+'|'-')expression
    |expression('='|'≠'|'>'|'<'|'≥'|'≤')expression
    |expression('||'|'ˆ'|'&&')expression
    |<assoc=right>expression'='expression;

indexing: identifier'['expression'..'expression']'
    |identifier'['expression']';

factor: funcCall
    |identifier
    |'('expression')'
    |unsignedConstant
    |indexing;

identifier: IDENT;

funcCall: <assoc=right> IDENT '('parameterList?')';

unsignedConstant: NUMBER;

conditionalStatement:   'if' expression 'then'
                            statement+
                        ('elseif' expression 'then' statement)*
                        ('else' statement)? 'endif';

forLoopStatement: 'for' IDENT 'in' '['expression'..'expression']'
                        statement
                  'endfor';

SPACE: [ \t\r\n]+ -> skip ;
// NEWLINE: [\r\n];
NUMBER: [0-9]+ ;
IDENT: [a-zA-Z_] [a-zA-Z0-9_]* ;
