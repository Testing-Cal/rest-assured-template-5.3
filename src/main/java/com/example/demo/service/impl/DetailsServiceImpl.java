package com.example.demo.service.impl;

import com.example.demo.entity.DetailsEntity;
import com.example.demo.repository.DetailsRepository;
import com.example.demo.service.DetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailsServiceImpl implements DetailsService {

	protected static Logger logger = LoggerFactory.getLogger(DetailsServiceImpl.class.getName());

	@Autowired
	DetailsRepository detailsRepository;

	@Override
	public void createDetails() {
		detailsRepository.save(new DetailsEntity("John", "Team Lead"));
		detailsRepository.save(new DetailsEntity("Mike", "Manager"));
		detailsRepository.save(new DetailsEntity("Rose", "Engineer"));
		detailsRepository.save(new DetailsEntity("Harvey", "Engineer"));
		detailsRepository.save(new DetailsEntity("Zane", "Engineer"));
		detailsRepository.save(new DetailsEntity("Thomas", "Engineer"));
		detailsRepository.save(new DetailsEntity("Maria", "Engineer"));
	}

	@Override
	public List<DetailsEntity> getDetails() {
		return detailsRepository.findAll();
	}



}
