package vn.lqk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.lqk.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

