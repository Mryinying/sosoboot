/**
 * This class is generated by jOOQ
 */
package com.it.jooq.generated;


import com.it.jooq.generated.tables.CourseInfo;
import com.it.jooq.generated.tables.StuSchedule;
import com.it.jooq.generated.tables.StudentInfo;
import com.it.jooq.generated.tables.TeacherInfo;
import com.it.jooq.generated.tables.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Test extends SchemaImpl {

    private static final long serialVersionUID = 8251483;

    /**
     * The reference instance of <code>test</code>
     */
    public static final Test TEST = new Test();

    /**
     * The table <code>test.course_info</code>.
     */
    public final CourseInfo COURSE_INFO = com.it.jooq.generated.tables.CourseInfo.COURSE_INFO;

    /**
     * The table <code>test.student_info</code>.
     */
    public final StudentInfo STUDENT_INFO = com.it.jooq.generated.tables.StudentInfo.STUDENT_INFO;

    /**
     * The table <code>test.stu_schedule</code>.
     */
    public final StuSchedule STU_SCHEDULE = com.it.jooq.generated.tables.StuSchedule.STU_SCHEDULE;

    /**
     * The table <code>test.teacher_info</code>.
     */
    public final TeacherInfo TEACHER_INFO = com.it.jooq.generated.tables.TeacherInfo.TEACHER_INFO;

    /**
     * The table <code>test.user</code>.
     */
    public final User USER = com.it.jooq.generated.tables.User.USER;

    /**
     * No further instances allowed
     */
    private Test() {
        super("test", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            CourseInfo.COURSE_INFO,
            StudentInfo.STUDENT_INFO,
            StuSchedule.STU_SCHEDULE,
            TeacherInfo.TEACHER_INFO,
            User.USER);
    }
}