package org.mybatis.qbe.sql.where.condition;

import org.mybatis.qbe.NoValueCondition;

public class IsNullCondition<T> implements NoValueCondition<T> {

    public IsNullCondition() {
        super();
    }
    
    @Override
    public String render() {
        return "is null"; //$NON-NLS-1$
    }
}