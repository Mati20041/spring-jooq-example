/*
 * This file is generated by jOOQ.
*/
package pl.mati.jooqdemo.model;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in test
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>test.test_table_pk_seq</code>
     */
    public static final Sequence<Long> TEST_TABLE_PK_SEQ = new SequenceImpl<Long>("test_table_pk_seq", Test.TEST, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
