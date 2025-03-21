package com.demo.example.student_library_management_system.converters;

import com.demo.example.student_library_management_system.model.Student;
import com.demo.example.student_library_management_system.requestdto.StudentRequestDto;

public class StudentConverter {

    public static Student covertStudentRequestDtoIntoStudent(StudentRequestDto studentRequestDto)
    {
        Student student = new Student();
        student.setName(studentRequestDto.getName());
        student.setGender(studentRequestDto.getGender());
        student.setMobile(studentRequestDto.getMobile());
        student.setDob(studentRequestDto.getDob());
        student.setEmail(studentRequestDto.getEmail());
        student.setAddress(studentRequestDto.getAddress());
        student.setDept(studentRequestDto.getDept());
        student.setSem(studentRequestDto.getSem());

        return student;
    }
}
