package com.iampfac.demo.data.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Suite {

	@Id
	private String id;

	@OneToMany(mappedBy = "suite", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SuiteModule> modules = new ArrayList<SuiteModule>();

}
