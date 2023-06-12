package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// task create SkillRepository interface that extends CrudRepository and add repository annotation
@Repository
public interface SkillRepository extends CrudRepository<Skill, Integer> {
}
