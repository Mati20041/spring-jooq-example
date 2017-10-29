package pl.mati.jooqdemo.service;

import org.jooq.DSLContext;
import org.jooq.conf.RenderKeywordStyle;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mati.jooqdemo.model.Sequences;
import pl.mati.jooqdemo.model.tables.pojos.TestTable;

import java.util.List;

import static org.jooq.impl.DSL.*;
import static pl.mati.jooqdemo.model.tables.TestTable.TEST_TABLE;

@Service
public class TestService {
    private final DSLContext create;

    @Autowired
    public TestService(DSLContext create) {
        this.create = create;
        create.settings().setRenderKeywordStyle(RenderKeywordStyle.UPPER);
    }

    public List<TestTable> getTests() {
        return create
                .fetch(TEST_TABLE)
                .into(TestTable.class);
    }

    public void addTest(String text) {
        create
                .insertInto(TEST_TABLE,
                        TEST_TABLE.ID,
                        TEST_TABLE.TEXT,
                        TEST_TABLE.CREATION_DT
                )
                .values(
                        Sequences.TEST_TABLE_PK_SEQ.nextval(),
                        val(text),
                        currentTimestamp()
                )
                .execute();
    }

}
