package com.csair.b2c.test.mybatis.mapper.mysql;

import com.csair.b2c.test.mybatis.model.Course;
import com.csair.b2c.test.mybatis.model.Student;
import com.csair.b2c.test.mybatis.model.Tutor;
import com.google.common.collect.Lists;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    List<Student> findStudents(RowBounds rowBounds);

    Student findStudentById(Integer id);

    int insertStudent(Student student);

    int insertStudentGetGenerateId(Student student);

    int insertStudentWithSequenceBefore(Student student);

    int insertStudentWithSequenceAfter(Student student);

    Student selectStudentWithAddress(Integer id);

    Student selectStudentWithAddress1(@Param("studId") Integer id);

    Student selectStudentWithAddress2(@Param("studId") Integer id);

    Tutor findTutorById(Integer id);

    List<Course> searchCourses(Course course);

    List<Course> searchCoursesByType(Map<String, Object> map);

    int updateStudent(Student student);

    int updateStudent1(Student student);

    List<Integer> filmInStock(Map<String, Object> map);
}
