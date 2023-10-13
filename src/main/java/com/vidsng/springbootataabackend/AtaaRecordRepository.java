package com.vidsng.springbootataabackend;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AtaaRecordRepository extends MongoRepository <AtaaRecord, String> {

    //Custom CRUD statements

    @Query("{ 'operation' : 'takeoff', 'aircraftType' : 'f18' }")
    List<AtaaRecord> findTakeoffF18();


    @Query("{$group : { _id : null, total : { $sum : '$count' } } }")
    AtaaRecord calculateTotalCount();

}
