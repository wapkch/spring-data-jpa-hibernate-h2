package com.iampfac.demo.data.jpa;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iampfac.demo.config.ApplicationConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
@DirtiesContext(classMode = ClassMode.AFTER_CLASS)
public class UserJpaRepositoryIntegrationTest {

	@Autowired
	private SuiteRepository repository;

	@Test
	public void sampleTestCase() {
		Suite dave = new Suite(1);
		dave = repository.save(dave);

		Suite carter = new Suite(2);
		carter = repository.save(carter);

		List<Suite> users = repository.findAll();
		assertThat(users.size(), is(2));
		assertThat(users, hasItem(dave));
		assertThat(users, hasItem(carter));
	}

}
