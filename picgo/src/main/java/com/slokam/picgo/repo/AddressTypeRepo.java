package com.slokam.picgo.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.picgo.entity.AddressType;
				@Repository
				public interface AddressTypeRepo extends JpaRepository<AddressType, Integer> {

				}