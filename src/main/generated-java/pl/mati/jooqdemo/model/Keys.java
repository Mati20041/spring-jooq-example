/*
 * This file is generated by jOOQ.
*/
package pl.mati.jooqdemo.model;


import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

import pl.mati.jooqdemo.model.tables.TestTable;
import pl.mati.jooqdemo.model.tables.records.TestTableRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>test</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TestTableRecord> TEST_TABLE_PKEY = UniqueKeys0.TEST_TABLE_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<TestTableRecord> TEST_TABLE_PKEY = createUniqueKey(TestTable.TEST_TABLE, "test_table_pkey", TestTable.TEST_TABLE.ID);
    }
}
