package com.microServiceCvs.microServiceCvs;
import java.util.Optional;

public interface CvService {
	
	    Cv save(Cv cv);

	    void delete(Cv cv);

	    Optional<Cv> findOne(String id);

	    Iterable<Cv> findAll();


}
