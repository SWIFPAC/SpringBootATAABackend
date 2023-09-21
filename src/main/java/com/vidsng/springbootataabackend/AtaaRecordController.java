package com.vidsng.springbootataabackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class AtaaRecordController {

    private AtaaRecordRepository ataaRecordRepository;

    @Autowired
    public AtaaRecordController(AtaaRecordRepository ataaRecordRepository){
        this.ataaRecordRepository = ataaRecordRepository;
    }

    // Save the user to MongoDB
    @PostMapping("/create-record")
    public AtaaRecord createAtaaRecord(@RequestBody AtaaRecord ataaRecord){
        return ataaRecordRepository.save(ataaRecord);

    }

    //Get full list of records
    @GetMapping("/get-all-records")
    public List<AtaaRecord> getAllAtaaRecords(){
        return ataaRecordRepository.findAll();
    }

    @GetMapping("/getrecords-by-operation")
    public List<AtaaRecord> getRecordByOp(@RequestParam String operation){
        return ataaRecordRepository.findByOperation(operation);
    }


}
