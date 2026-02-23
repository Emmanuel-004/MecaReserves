package org.mecacorp.mecareserves.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.mecacorp.mecareserves.baseclass.BaseModel;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Car extends BaseModel {

    @Column
    private String brand;

    @Column
    private String type;
}
