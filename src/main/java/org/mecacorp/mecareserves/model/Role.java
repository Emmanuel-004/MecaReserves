package org.mecacorp.mecareserves.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.mecacorp.mecareserves.baseclass.BaseModel;

@Getter
@Setter
@Entity
public class Role extends BaseModel {

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String name;
}
