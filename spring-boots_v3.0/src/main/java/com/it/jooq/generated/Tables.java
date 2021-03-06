/**
 * This class is generated by jOOQ
 */
package com.it.jooq.generated;


import com.it.jooq.generated.tables.CourseInfo;
import com.it.jooq.generated.tables.StuSchedule;
import com.it.jooq.generated.tables.StudentInfo;
import com.it.jooq.generated.tables.TeacherInfo;
import com.it.jooq.generated.tables.User;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in test
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>test.course_info</code>.
     */
    public static final CourseInfo COURSE_INFO = com.it.jooq.generated.tables.CourseInfo.COURSE_INFO;

    /**
     * The table <code>test.student_info</code>.
     */
    public static final StudentInfo STUDENT_INFO = com.it.jooq.generated.tables.StudentInfo.STUDENT_INFO;

    /**
     * The table <code>test.stu_schedule</code>.
     */
    public static final StuSchedule STU_SCHEDULE = com.it.jooq.generated.tables.StuSchedule.STU_SCHEDULE;

    /**
     * The table <code>test.teacher_info</code>.
     */
    public static final TeacherInfo TEACHER_INFO = com.it.jooq.generated.tables.TeacherInfo.TEACHER_INFO;

    /**
     * The table <code>test.user</code>.
     */
    public static final User USER = com.it.jooq.generated.tables.User.USER;
}
