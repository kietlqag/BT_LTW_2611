package vn.lqk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.lqk.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
