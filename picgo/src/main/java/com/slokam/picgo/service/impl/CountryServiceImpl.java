package com.slokam.picgo.service.impl;

import com.slokam.picgo.entity.Country;
import com.slokam.picgo.repo.CountryRepo;
import com.slokam.picgo.service.CountryService;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CountryServiceImpl implements CountryService {

      
   

	@Autowired
	private CountryRepo repo;
	
	@Override
	public List<Country> getAll() {
		return repo.findAll();
	}

	@Override
	public Country getById(Integer id) {
		
		Optional<Country> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else
		{
			return null;
		}
	}

	@Override
	public Country save(Country todo) {
		return repo.save(todo);
	}

	@Override
	public void remove(Country todo) {
		repo.delete(todo);
	}
	@Override
	public void remove(Integer id) {
		repo.deleteById(id);
	}
}
