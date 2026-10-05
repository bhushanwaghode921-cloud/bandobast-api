package com.app.bandobastapi.service;
import com.app.bandobastapi.model.RejectionTemplate;
import com.app.bandobastapi.repository.RejectionTemplateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RejectionTemplateService {

    @Autowired
    RejectionTemplateRepo repo;

    public RejectionTemplate getRejectionTemplate(Integer id){
        return repo.findById(id).orElse(null);
    }

    public void addRejectionTemplate (RejectionTemplate rejectionTemplate){
        repo.save(rejectionTemplate);
    }

}
