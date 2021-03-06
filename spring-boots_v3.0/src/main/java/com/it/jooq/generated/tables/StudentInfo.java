/**
 * This class is generated by jOOQ
 */
package com.it.jooq.generated.tables;


import com.it.jooq.generated.Keys;
import com.it.jooq.generated.Test;
import com.it.jooq.generated.tables.records.StudentInfoRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudentInfo extends TableImpl<StudentInfoRecord> {

    private static final long serialVersionUID = 1232468306;

    /**
     * The reference instance of <code>test.student_info</code>
     */
    public static final StudentInfo STUDENT_INFO = new StudentInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentInfoRecord> getRecordType() {
        return StudentInfoRecord.class;
    }

    /**
     * The column <code>test.student_info.id</code>.
     */
    public final TableField<StudentInfoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>test.student_info.stu_name</code>.
     */
    public final TableField<StudentInfoRecord, String> STU_NAME = createField("stu_name", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>test.student_info.stu_sex</code>.
     */
    public final TableField<StudentInfoRecord, Integer> STU_SEX = createField("stu_sex", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>test.student_info.stu_major</code>.
     */
    public final TableField<StudentInfoRecord, String> STU_MAJOR = createField("stu_major", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>test.student_info.stu_nation</code>.
     */
    public final TableField<StudentInfoRecord, String> STU_NATION = createField("stu_nation", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

    /**
     * The column <code>test.student_info.stu_politics_status</code>.
     */
    public final TableField<StudentInfoRecord, String> STU_POLITICS_STATUS = createField("stu_politics_status", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>test.student_info.password</code>.
     */
    public final TableField<StudentInfoRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * Create a <code>test.student_info</code> table reference
     */
    public StudentInfo() {
        this("student_info", null);
    }

    /**
     * Create an aliased <code>test.student_info</code> table reference
     */
    public StudentInfo(String alias) {
        this(alias, STUDENT_INFO);
    }

    private StudentInfo(String alias, Table<StudentInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private StudentInfo(String alias, Table<StudentInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Test.TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<StudentInfoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STUDENT_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StudentInfoRecord> getPrimaryKey() {
        return Keys.KEY_STUDENT_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StudentInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<StudentInfoRecord>>asList(Keys.KEY_STUDENT_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentInfo as(String alias) {
        return new StudentInfo(alias, this);
    }

    /**
     * Rename this table
     */
    public StudentInfo rename(String name) {
        return new StudentInfo(name, null);
    }
}
