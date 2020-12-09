package com.southwind.repository;

import com.southwind.entity.Student;

import java.util.Collection;

/**
 * @author yuchenxi
 * @create 2020-12-09-10:31
 */
public interface StudentRepository {
    Collection<Student> findAll();
    Student findById(long id);
    void saveOrUpdate(Student student);
    void deleteById(long id);
}
