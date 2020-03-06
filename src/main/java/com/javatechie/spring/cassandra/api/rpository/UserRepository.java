package com.javatechie.spring.cassandra.api.rpository;

import java.util.List;

import com.javatechie.spring.cassandra.api.model.User;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<User, Integer> {

	@AllowFiltering
	List<User> findByAgeGreaterThan(int age);

}
