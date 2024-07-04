package com.poc.protobuf;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class TestService {
    public StudentOuterClass.Students getProtoStudents() {

     StudentOuterClass.Students.Builder builder= StudentOuterClass.Students.newBuilder();
        for(int i=0;i<100;i++) {
            builder.addStudent(StudentOuterClass.Student.newBuilder()
                    .setId(100)
                    .setName("Random name 1")
                    .setMarks(56.8)
                    .setHeight(5.6f)
                    .setPlace("New York").build());
        }
        return builder.build();

    }

    public List<StudentNonProto> getNonProtoStudents() {
        List<StudentNonProto> list=new ArrayList<>();
        for(int i=0;i<100;i++) {
            list.add(new StudentNonProto(100l, "Random name 1", 56.8, "New York", 5.6f));
        }
        return list;
    }

    public List<Object[]> getNonProtoStudentsArray() {
        List<Object[]> list=new ArrayList<>();
        for(int i=0;i<100;i++) {
            list.add(new Object[]{100, "Random name 1", 56.8, "New York", 5.6f});
        }
        return list;
    }
}
