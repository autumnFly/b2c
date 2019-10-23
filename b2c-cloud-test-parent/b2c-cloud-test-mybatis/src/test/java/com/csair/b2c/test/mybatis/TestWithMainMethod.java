package com.csair.b2c.test.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import com.csair.b2c.test.mybatis.mapper.mysql.StudentAnnoMapper;
import com.csair.b2c.test.mybatis.mapper.mysql.StudentMapper;
import com.csair.b2c.test.mybatis.model.Course;
import com.csair.b2c.test.mybatis.model.PhoneNumber;
import com.csair.b2c.test.mybatis.model.Student;
import com.csair.b2c.test.mybatis.model.Tutor;
import com.google.common.collect.Maps;
import lombok.SneakyThrows;
import lombok.val;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.javamaster.b2c.config.BlueMoonConsts;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 2019/2/2.<br/>
 *
 * @author yudong
 */
public class TestWithMainMethod {

    @Test
    public void main() {

        SqlSession session = getSqlSessionFactory().openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);

        Student student = mapper.findStudentById(1);
        System.out.println(student);
        student.setStudId(null);

        System.out.println(mapper.insertStudent(student));
        System.out.println(student);
        student.setStudId(null);

        System.out.println(mapper.insertStudentGetGenerateId(student));
        System.out.println(student);
        student.setStudId(null);

        System.out.println(mapper.insertStudentWithSequenceBefore(student));
        System.out.println(student);
        student.setStudId(null);

        System.out.println(mapper.insertStudentWithSequenceAfter(student));
        System.out.println(student);

        session.close();
    }

    @Test
    public void main2() {
        SqlSession session = getSqlSessionFactory().openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student student = mapper.selectStudentWithAddress(1);
        System.out.println(student);

        student = mapper.selectStudentWithAddress1(1);
        System.out.println(student);

        student = mapper.selectStudentWithAddress2(1);
        System.out.println(student);
    }

    @Test
    public void main3() {
        SqlSession session = getSqlSessionFactory().openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Tutor tutor = mapper.findTutorById(1);
        System.out.println(tutor);
    }

    @Test
    public void main4() {
        SqlSession session = getSqlSessionFactory().openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Course course = new Course();
        course.setTutorId(1);
        course.setName("java");
        List<Course> courses = mapper.searchCourses(course);
        System.out.println(courses);

        val map = Maps.<String, Object>newHashMap();
        map.put("searchBy", "Name");
        map.put("name", "java");
        courses = mapper.searchCoursesByType(map);
        System.out.println(courses);

        val stu = new Student();
        stu.setStudId(1);
        stu.setDob(new Date());
        System.out.println(mapper.updateStudent(stu));
        System.out.println(mapper.updateStudent1(stu));
    }

    @Test
    public void main5() {
        SqlSession session = getSqlSessionFactory().openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);

        // 若要展示第二页，使用 offset=5,limit=5;第三页，则为 offset=10，limit=5。
        int offset = 0, limit = 5;
        RowBounds rowBounds = new RowBounds(offset, limit);
        List<Student> students = mapper.findStudents(rowBounds);
        System.out.println(students);

    }


    @Test
    public void main6() {
        SqlSession session = getSqlSessionFactory().openSession();
        StudentAnnoMapper mapper = session.getMapper(StudentAnnoMapper.class);

        Student student = mapper.findStudentById(1);
        System.out.println(student);
        student.setStudId(null);

        System.out.println(mapper.insertStudent(student));

        System.out.println(mapper.insertStudent1(student));

        System.out.println(mapper.deleteStudent(student.getStudId()));

        System.out.println(mapper.insertStudent2(student));

        val stu = new Student();
        stu.setStudId(10014);
        stu.setDob(new Date());
        stu.setName("Jack");
        stu.setEmail("Jack@qq.com");
        stu.setPhone(new PhoneNumber("232-456-546"));
        System.out.println(mapper.updateStudent(stu));
    }

    @Test
    public void main7() {
        SqlSession session = getSqlSessionFactory().openSession();
        StudentAnnoMapper mapper = session.getMapper(StudentAnnoMapper.class);
        System.out.println(mapper.findAllStudents());

        System.out.println(mapper.selectStudentWithAddress(1));

        System.out.println(mapper.findTutorById(1));
    }

    @Test
    public void main8() {
        SqlSession session = getSqlSessionFactory().openSession();
        StudentAnnoMapper mapper = session.getMapper(StudentAnnoMapper.class);
        System.out.println(mapper.findTutorByIdDynamic(1));

        System.out.println(mapper.findTutorByIdDynamic1(1));

        System.out.println(mapper.findTutorByNameAndEmailSql("john", "john@gmail.com"));
    }

    @Test
    public void main9() {
        SqlSession session = getSqlSessionFactory().openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("filmId", 1);
        map.put("storeId", 1);
        System.out.println(mapper.filmInStock(map));
        System.out.println(map);
    }

    @SneakyThrows
    public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(getDataSource());
        final String MAPPER_LOCATION = "classpath*:mapper/mysql/**/*.xml";
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
        String configLocation = "classpath*:mybatis-config.xml";
        sessionFactory.setConfigLocation(new PathMatchingResourcePatternResolver().getResources(configLocation)[0]);
        sessionFactory.getObject().getConfiguration().setCacheEnabled(true);
        sessionFactory.getObject().getConfiguration().setLazyLoadingEnabled(true);
        sessionFactory.getObject().getConfiguration().setObjectFactory(new SpecObjectFactory());
        return sessionFactory.getObject();
    }

    public static DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(BlueMoonConsts.Local.URL_SAKILA);
        dataSource.setUsername(BlueMoonConsts.Local.USERNAME);
        dataSource.setPassword(BlueMoonConsts.Local.PASSWORD);
        dataSource.setInitialSize(10);
        dataSource.setMaxActive(20);
        dataSource.setMaxWait(10000);
        dataSource.setDefaultAutoCommit(true);
        dataSource.setRemoveAbandoned(true);
        dataSource.setTestOnBorrow(true);
        dataSource.setValidationQuery("select now()");
        return dataSource;
    }
}
