package com.iampfac.demo.data.jpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Module {

	@Id
	private String id;

	@OneToMany(mappedBy = "module", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SuiteModule> suites = new ArrayList<SuiteModule>();

}
