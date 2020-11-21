package com.kolli.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	public UserRepository() {
		System.out.println("***user repository constructor***");
	}
}
