package com.said.galerytown.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "resource_type")
    private String resourceType;

    @Column(name = "storage_type")
    private String storageType;

    @Column(name = "storage_path")
    private String storagePath;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
