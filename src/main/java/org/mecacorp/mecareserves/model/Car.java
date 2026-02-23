package org.mecacorp.mecareserves.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.mecacorp.mecareserves.baseclass.BaseModel;

@Getter
@Setter
@Entity
public class Car extends BaseModel {

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String type;
}
