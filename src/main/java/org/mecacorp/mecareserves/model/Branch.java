package org.mecacorp.mecareserves.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.mecacorp.mecareserves.baseclass.BaseModel;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Branch extends BaseModel {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String address;
}
