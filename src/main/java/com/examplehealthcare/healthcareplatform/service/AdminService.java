package com.examplehealthcare.healthcareplatform.service;

import java.util.List;
import com.examplehealthcare.healthcareplatform.model.Admin;

public interface AdminService { //Basic CRUD Operations for Admins 
    List<Admin> findAllAdmins();
    Admin findAdminById(Long id);
    Admin saveAdmin(Admin admin);
    void deleteAdmin(Long id);
    void deleteByName(String name);
}


