package io.javabrains.courseapidata.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }

    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    public Department updateDepartment ( Department department, long id) {
        return departmentRepository.save(department);
    }

    public void deleteDepartment (long id) {
        departmentRepository.deleteById(id);
    }

    public Department getDepartment (long id) {
        return departmentRepository.findById(id).get();
    }
}


