package com.slokam.picgo.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.picgo.entity.Item;
				@Repository
				public interface ItemRepo extends JpaRepository<Item, Integer> {

				}