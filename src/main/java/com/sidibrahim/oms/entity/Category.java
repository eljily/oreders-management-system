package com.sidibrahim.oms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id ;
private String name ;
private String description;
private LocalDateTime createDate;
private LocalDateTime updateDate;
private String image;
@OneToMany
private List<Category> children;
private Long parentId;
}
