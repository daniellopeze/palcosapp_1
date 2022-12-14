package com.usa.palcosapp_1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
@NoArgsConstructor
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private  String name;
        private String description;

        @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "category")
        @JsonIgnoreProperties("category")
        private List<Box> boxes;
}
