package org.mecacorp.mecareserves.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.mecacorp.mecareserves.baseclass.BaseModel;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class ServiceType extends BaseModel {

    @Column(nullable = false)
    private String serviceType;
}
