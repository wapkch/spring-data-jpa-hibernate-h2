package com.iampfac.demo.data.jpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class SuiteModuleId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column
    private String suiteId;

    @Column
    private String moduleId;

    @Column
    private String functionalityId;

}
