package com.poc.protobuf;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class StudentNonProto {

    private Long id;
    private String name;
    private Double marks;
    private String place;
    private Float height;
}
