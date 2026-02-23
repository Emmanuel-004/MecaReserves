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
public class User extends BaseModel {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phoneNumber;

    @Column
    private String address;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
}
