package io.javabrains.courseapidata.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public List<Course> getAll(){
       return courseRepository.findAll();
    }

    public Course getCourse (long id) {
        return courseRepository.findById(id).get();
    }

    public void deleteCourse(long id) {
        courseRepository.deleteById(id);
    }

    public Course updateCourse(long id, Course course){
        return  courseRepository.save(course);
    }
}
