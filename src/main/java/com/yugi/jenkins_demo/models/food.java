package com.yugi.jenkins_demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Document
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor

//@Entity --> this is used for Relational DataBases which operate on tables

public class food //--> this the table name
{
    @Id
    private String id; //--> this the primary key and name of the column
    private String name; // --> this will be the column name
    private String type;
    private long price;
    private String description;
    private LocalDateTime expiryDate;
}
/*
     tableName: food
     primaryKey: id
     columns: name, type, price, description
 */