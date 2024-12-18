package com.yugi.jenkins_demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class food {

    @Id
    private String id;
    private String name;
    private String type;
    private long price;
    private String description;
}
