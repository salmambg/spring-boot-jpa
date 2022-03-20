package io.javabrains.courseapidata.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping ("/department")
    public String saveDepartment (@RequestBody Department department) {
        departmentService.addDepartment(department);
        return "Department save successfully";
    }

    @GetMapping ("/department")
    public List<Department> getAll() {
        return departmentService.getAll();
    }

    @PutMapping("/department/{id}")
    public Department updateDepartment(@RequestBody Department department, @PathVariable int id ) {
        return departmentService.updateDepartment(department, id);
    }

    @DeleteMapping("/department/{id}")
    public void deleteDepartment(@PathVariable int id) {
        departmentService.deleteDepartment(id);
    }

    @GetMapping("/department/{id}")
    public Department getDepartment (@PathVariable int id) {
        return departmentService.getDepartment(id);
    }




}
