package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/department")
public class DepartmentController {
  @Autowired
  private DepartmentRepository repo;
  
  @RequestMapping(method = RequestMethod.GET)
  public List<Department> findItems() {
    return repo.findAll();
  }
}