package com.iampfac.demo.data.jpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SuiteModule {

	@EmbeddedId
	private SuiteModuleId suiteModuleId;

	@ManyToOne
	@MapsId("suiteId")
	private Suite suite;

	@ManyToOne
	@MapsId("moduleId")
	private Module module;

	@ManyToOne
	@MapsId("functionalityId")
	private Functionality functionality;

}
