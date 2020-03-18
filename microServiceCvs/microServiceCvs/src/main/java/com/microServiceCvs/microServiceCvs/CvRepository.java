package com.microServiceCvs.microServiceCvs;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface CvRepository extends ElasticsearchRepository<Cv, String>{

}
