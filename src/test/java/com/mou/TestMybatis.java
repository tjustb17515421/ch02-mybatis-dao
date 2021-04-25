package com.mou;

import com.mou.dao.StudentDao;
import com.mou.dao.impl.StudentDaoImpl;
import com.mou.domain.Student;
import org.junit.Test;

import java.util.List;

public class TestMybatis {

    //查询测试
    @Test
    public void test(){
        StudentDao dao=new StudentDaoImpl();
        List<Student> studentList=dao.selectStudents();
        for(Student stu:studentList){
            System.out.println(stu);
        }
    }
    //添加测试
    @Test
    public void test2(){
        StudentDao dao=new StudentDaoImpl();
        Student student=new Student();
        student.setId(1007);
        student.setName("张飞");
        student.setEmail("zhangfei@sina.com");
        student.setAge(50);
        int nums=dao.insertStudent(student);
        System.out.println(nums);
    }
}

