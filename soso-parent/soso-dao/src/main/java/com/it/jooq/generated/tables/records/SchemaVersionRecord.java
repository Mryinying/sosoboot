/*
 * This file is generated by jOOQ.
*/
package com.it.jooq.generated.tables.records;


import com.it.jooq.generated.tables.SchemaVersion;

import java.util.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SchemaVersionRecord extends UpdatableRecordImpl<SchemaVersionRecord> implements Record10<Integer, String, String, String, String, Integer, String, Date, Integer, Integer> {

    private static final long serialVersionUID = 2119401415;

    /**
     * Setter for <code>study.schema_version.installed_rank</code>.
     */
    public SchemaVersionRecord setInstalledRank(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>study.schema_version.installed_rank</code>.
     */
    public Integer getInstalledRank() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>study.schema_version.version</code>.
     */
    public SchemaVersionRecord setVersion(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>study.schema_version.version</code>.
     */
    public String getVersion() {
        return (String) get(1);
    }

    /**
     * Setter for <code>study.schema_version.description</code>.
     */
    public SchemaVersionRecord setDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>study.schema_version.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>study.schema_version.type</code>.
     */
    public SchemaVersionRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>study.schema_version.type</code>.
     */
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>study.schema_version.script</code>.
     */
    public SchemaVersionRecord setScript(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>study.schema_version.script</code>.
     */
    public String getScript() {
        return (String) get(4);
    }

    /**
     * Setter for <code>study.schema_version.checksum</code>.
     */
    public SchemaVersionRecord setChecksum(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>study.schema_version.checksum</code>.
     */
    public Integer getChecksum() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>study.schema_version.installed_by</code>.
     */
    public SchemaVersionRecord setInstalledBy(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>study.schema_version.installed_by</code>.
     */
    public String getInstalledBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>study.schema_version.installed_on</code>.
     */
    public SchemaVersionRecord setInstalledOn(Date value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>study.schema_version.installed_on</code>.
     */
    public Date getInstalledOn() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>study.schema_version.execution_time</code>.
     */
    public SchemaVersionRecord setExecutionTime(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>study.schema_version.execution_time</code>.
     */
    public Integer getExecutionTime() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>study.schema_version.success</code>.
     */
    public SchemaVersionRecord setSuccess(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>study.schema_version.success</code>.
     */
    public Integer getSuccess() {
        return (Integer) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, Integer, String, Date, Integer, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, Integer, String, Date, Integer, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SchemaVersion.SCHEMA_VERSION.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SchemaVersion.SCHEMA_VERSION.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SchemaVersion.SCHEMA_VERSION.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SchemaVersion.SCHEMA_VERSION.SCRIPT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return SchemaVersion.SCHEMA_VERSION.CHECKSUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SchemaVersion.SCHEMA_VERSION.INSTALLED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return SchemaVersion.SCHEMA_VERSION.INSTALLED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return SchemaVersion.SCHEMA_VERSION.EXECUTION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return SchemaVersion.SCHEMA_VERSION.SUCCESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getInstalledRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getScript();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getChecksum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getInstalledBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getInstalledOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getExecutionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getSuccess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value1(Integer value) {
        setInstalledRank(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value2(String value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value4(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value5(String value) {
        setScript(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value6(Integer value) {
        setChecksum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value7(String value) {
        setInstalledBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value8(Date value) {
        setInstalledOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value9(Integer value) {
        setExecutionTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value10(Integer value) {
        setSuccess(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, String value7, Date value8, Integer value9, Integer value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SchemaVersionRecord
     */
    public SchemaVersionRecord() {
        super(SchemaVersion.SCHEMA_VERSION);
    }

    /**
     * Create a detached, initialised SchemaVersionRecord
     */
    public SchemaVersionRecord(Integer installedRank, String version, String description, String type, String script, Integer checksum, String installedBy, Date installedOn, Integer executionTime, Integer success) {
        super(SchemaVersion.SCHEMA_VERSION);

        set(0, installedRank);
        set(1, version);
        set(2, description);
        set(3, type);
        set(4, script);
        set(5, checksum);
        set(6, installedBy);
        set(7, installedOn);
        set(8, executionTime);
        set(9, success);
    }
}
