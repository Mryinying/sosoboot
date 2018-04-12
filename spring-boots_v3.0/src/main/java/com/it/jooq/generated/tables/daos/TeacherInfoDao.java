/**
 * This class is generated by jOOQ
 */
package com.it.jooq.generated.tables.daos;


import com.it.jooq.generated.tables.TeacherInfo;
import com.it.jooq.generated.tables.records.TeacherInfoRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


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
@Repository
public class TeacherInfoDao extends DAOImpl<TeacherInfoRecord, com.it.jooq.generated.tables.pojos.TeacherInfo, Integer> {

    /**
     * Create a new TeacherInfoDao without any configuration
     */
    public TeacherInfoDao() {
        super(TeacherInfo.TEACHER_INFO, com.it.jooq.generated.tables.pojos.TeacherInfo.class);
    }

    /**
     * Create a new TeacherInfoDao with an attached configuration
     */
    @Autowired
    public TeacherInfoDao(Configuration configuration) {
        super(TeacherInfo.TEACHER_INFO, com.it.jooq.generated.tables.pojos.TeacherInfo.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.it.jooq.generated.tables.pojos.TeacherInfo object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.TeacherInfo> fetchById(Integer... values) {
        return fetch(TeacherInfo.TEACHER_INFO.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.it.jooq.generated.tables.pojos.TeacherInfo fetchOneById(Integer value) {
        return fetchOne(TeacherInfo.TEACHER_INFO.ID, value);
    }

    /**
     * Fetch records that have <code>tea_name IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.TeacherInfo> fetchByTeaName(String... values) {
        return fetch(TeacherInfo.TEACHER_INFO.TEA_NAME, values);
    }

    /**
     * Fetch records that have <code>tea_sex IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.TeacherInfo> fetchByTeaSex(Integer... values) {
        return fetch(TeacherInfo.TEACHER_INFO.TEA_SEX, values);
    }

    /**
     * Fetch records that have <code>tea_nation IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.TeacherInfo> fetchByTeaNation(String... values) {
        return fetch(TeacherInfo.TEACHER_INFO.TEA_NATION, values);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.TeacherInfo> fetchByPassword(String... values) {
        return fetch(TeacherInfo.TEACHER_INFO.PASSWORD, values);
    }
}
