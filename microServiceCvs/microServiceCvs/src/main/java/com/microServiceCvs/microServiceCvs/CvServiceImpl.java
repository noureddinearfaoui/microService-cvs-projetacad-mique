package com.microServiceCvs.microServiceCvs;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;;
@Service
@Transactional
public class CvServiceImpl implements CvService {
	@Autowired
	 private CvRepository cvRepository;

		

	@Override
	public Cv save(Cv cv) {
		// TODO Auto-generated method stub
		return cvRepository.save(cv);
	}

	@Override
	public void delete(Cv cv) {
		cvRepository.delete(cv);
		
	}

	@Override
	public Optional<Cv> findOne(String id) {
		// TODO Auto-generated method stub
		return cvRepository.findById(id);
	}

	@Override
	public Iterable<Cv> findAll() {
		// TODO Auto-generated method stub
		return cvRepository.findAll();
	}

}
