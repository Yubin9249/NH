package spring.nh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.nh.entity.Db_entity;
import spring.nh.repository.DbRepository;

@Service
public class DbService {

    @Autowired
    private DbRepository dbRepository;

    public void enrollment(Db_entity db_entity){

        dbRepository.save(db_entity);

    }
}
