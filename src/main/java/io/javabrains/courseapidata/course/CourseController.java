package io.javabrains.courseapidata.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/course")
    public String saveCourse(@RequestBody Course course) {
        courseService.addCourse(course);
        return "course saved successfully!";
    }

    @GetMapping("/course")
    public List<Course> getAll() {
        return courseService.getAll();
    }

    @GetMapping("/course/{id}")
    public Course getCourse (@PathVariable int id){
        return courseService.getCourse(id);
    }

    @DeleteMapping("/course/{id}")
    public String deleteCourse (@PathVariable int id) {
       courseService.deleteCourse(id);
       return "course delete successfully";
    }

    @PutMapping("/course/{id}")
    public Course updateCourse(@RequestBody Course course, @PathVariable int id) {
       return courseService.updateCourse(id, course);
    }

}
