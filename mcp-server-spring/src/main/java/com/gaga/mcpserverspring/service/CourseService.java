package com.gaga.mcpserverspring.service;

import com.gaga.mcpserverspring.model.Course;
import jakarta.annotation.PostConstruct;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
     List<Course> courses = new ArrayList<>();



    @PostConstruct
    public void initCourses() {
        courses.add(new Course(
                "Spring Boot Basics"
        ));

        courses.add(new Course(
                "Advanced React"
        ));

        courses.add(new Course(
                "Database Design"
        ));
    }

    @Tool(name = "get_all_courses",
            description = "Get all available courses")
    public List<Course> getAllCourses() {
        return courses;
    }

}
