/**
 * This class is generated by jOOQ
 */
package com.it.jooq.generated.tables.daos;


import com.it.jooq.generated.tables.StuSchedule;
import com.it.jooq.generated.tables.records.StuScheduleRecord;

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
public class StuScheduleDao extends DAOImpl<StuScheduleRecord, com.it.jooq.generated.tables.pojos.StuSchedule, Integer> {

    /**
     * Create a new StuScheduleDao without any configuration
     */
    public StuScheduleDao() {
        super(StuSchedule.STU_SCHEDULE, com.it.jooq.generated.tables.pojos.StuSchedule.class);
    }

    /**
     * Create a new StuScheduleDao with an attached configuration
     */
    @Autowired
    public StuScheduleDao(Configuration configuration) {
        super(StuSchedule.STU_SCHEDULE, com.it.jooq.generated.tables.pojos.StuSchedule.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.it.jooq.generated.tables.pojos.StuSchedule object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.StuSchedule> fetchById(Integer... values) {
        return fetch(StuSchedule.STU_SCHEDULE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.it.jooq.generated.tables.pojos.StuSchedule fetchOneById(Integer value) {
        return fetchOne(StuSchedule.STU_SCHEDULE.ID, value);
    }

    /**
     * Fetch records that have <code>stu_no IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.StuSchedule> fetchByStuNo(Integer... values) {
        return fetch(StuSchedule.STU_SCHEDULE.STU_NO, values);
    }

    /**
     * Fetch records that have <code>course_id IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.StuSchedule> fetchByCourseId(Integer... values) {
        return fetch(StuSchedule.STU_SCHEDULE.COURSE_ID, values);
    }

    /**
     * Fetch records that have <code>score IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.StuSchedule> fetchByScore(Integer... values) {
        return fetch(StuSchedule.STU_SCHEDULE.SCORE, values);
    }
}
