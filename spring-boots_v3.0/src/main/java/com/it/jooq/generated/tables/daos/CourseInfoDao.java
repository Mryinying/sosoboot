/**
 * This class is generated by jOOQ
 */
package com.it.jooq.generated.tables.daos;


import com.it.jooq.generated.tables.CourseInfo;
import com.it.jooq.generated.tables.records.CourseInfoRecord;

import java.sql.Date;
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
public class CourseInfoDao extends DAOImpl<CourseInfoRecord, com.it.jooq.generated.tables.pojos.CourseInfo, Integer> {

    /**
     * Create a new CourseInfoDao without any configuration
     */
    public CourseInfoDao() {
        super(CourseInfo.COURSE_INFO, com.it.jooq.generated.tables.pojos.CourseInfo.class);
    }

    /**
     * Create a new CourseInfoDao with an attached configuration
     */
    @Autowired
    public CourseInfoDao(Configuration configuration) {
        super(CourseInfo.COURSE_INFO, com.it.jooq.generated.tables.pojos.CourseInfo.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.it.jooq.generated.tables.pojos.CourseInfo object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.CourseInfo> fetchById(Integer... values) {
        return fetch(CourseInfo.COURSE_INFO.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.it.jooq.generated.tables.pojos.CourseInfo fetchOneById(Integer value) {
        return fetchOne(CourseInfo.COURSE_INFO.ID, value);
    }

    /**
     * Fetch records that have <code>course_name IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.CourseInfo> fetchByCourseName(String... values) {
        return fetch(CourseInfo.COURSE_INFO.COURSE_NAME, values);
    }

    /**
     * Fetch records that have <code>teacher_no IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.CourseInfo> fetchByTeacherNo(Integer... values) {
        return fetch(CourseInfo.COURSE_INFO.TEACHER_NO, values);
    }

    /**
     * Fetch records that have <code>weekday IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.CourseInfo> fetchByWeekday(String... values) {
        return fetch(CourseInfo.COURSE_INFO.WEEKDAY, values);
    }

    /**
     * Fetch records that have <code>start_time IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.CourseInfo> fetchByStartTime(Date... values) {
        return fetch(CourseInfo.COURSE_INFO.START_TIME, values);
    }

    /**
     * Fetch records that have <code>end_time IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.CourseInfo> fetchByEndTime(Date... values) {
        return fetch(CourseInfo.COURSE_INFO.END_TIME, values);
    }

    /**
     * Fetch records that have <code>classroom IN (values)</code>
     */
    public List<com.it.jooq.generated.tables.pojos.CourseInfo> fetchByClassroom(String... values) {
        return fetch(CourseInfo.COURSE_INFO.CLASSROOM, values);
    }
}
