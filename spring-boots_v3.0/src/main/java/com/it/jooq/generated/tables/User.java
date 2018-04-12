/**
 * This class is generated by jOOQ
 */
package com.it.jooq.generated.tables;


import com.it.jooq.Timestamp2DateConverter;
import com.it.jooq.generated.Keys;
import com.it.jooq.generated.Test;
import com.it.jooq.generated.tables.records.UserRecord;

import java.util.Arrays;
import java.util.Date;
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
public class User extends TableImpl<UserRecord> {

    private static final long serialVersionUID = 115161979;

    /**
     * The reference instance of <code>test.user</code>
     */
    public static final User USER = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>test.user.id</code>.
     */
    public final TableField<UserRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>test.user.create_time</code>.
     */
    public final TableField<UserRecord, Date> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new Timestamp2DateConverter());

    /**
     * The column <code>test.user.email</code>.
     */
    public final TableField<UserRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>test.user.nick_name</code>.
     */
    public final TableField<UserRecord, String> NICK_NAME = createField("nick_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>test.user.pass_word</code>.
     */
    public final TableField<UserRecord, String> PASS_WORD = createField("pass_word", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>test.user.user_name</code>.
     */
    public final TableField<UserRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * Create a <code>test.user</code> table reference
     */
    public User() {
        this("user", null);
    }

    /**
     * Create an aliased <code>test.user</code> table reference
     */
    public User(String alias) {
        this(alias, USER);
    }

    private User(String alias, Table<UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private User(String alias, Table<UserRecord> aliased, Field<?>[] parameters) {
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
    public Identity<UserRecord, Long> getIdentity() {
        return Keys.IDENTITY_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRecord> getPrimaryKey() {
        return Keys.KEY_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRecord>>asList(Keys.KEY_USER_PRIMARY, Keys.KEY_USER_UK_OB8KQYQQGMEFL0ACO34AKDTPE, Keys.KEY_USER_UK_D2IA11OQHSYNODBSI46M80VFC, Keys.KEY_USER_UK_LQJRCOBRH9JC8WPCAR64Q1BFH);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(String alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    public User rename(String name) {
        return new User(name, null);
    }
}