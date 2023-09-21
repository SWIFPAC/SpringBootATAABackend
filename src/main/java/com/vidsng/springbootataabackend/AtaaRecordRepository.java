package com.vidsng.springbootataabackend;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AtaaRecordRepository extends MongoRepository <AtaaRecord, String> {

    //Custom CRUD statements
    List<AtaaRecord> findByOperation(String operation);

}
