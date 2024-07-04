package com.poc.protobuf;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/test")
public class TestController {

    @Autowired
    private TestService service;
    @GetMapping(path = "/proto/students", produces = "application/x-protobuf")
    public StudentOuterClass.Students get() {
        return service.getProtoStudents();
    }

    @GetMapping(path = "/json/students")
    public List<StudentNonProto> getNonProto() {
        return service.getNonProtoStudents();
    }

    @GetMapping(path = "/json-array/students")
    public List<Object[]> getNonProtoArray() {
        return service.getNonProtoStudentsArray();
    }
}
