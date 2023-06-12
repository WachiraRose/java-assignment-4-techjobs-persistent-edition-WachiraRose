package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// task create EmployerRepository interface that extends CrudRepository and add repository annotation
@Repository
public interface EmployerRepository extends CrudRepository<Employer, Integer> {
}
