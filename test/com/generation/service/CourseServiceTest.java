package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Module;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Course course = new Course("Intro-1", "Intro-Java-10",6,new Module("INTRO-CS", "Introduction to Computer Science",
                "Introductory module for the generation technical programs" ));
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void registerCourse() {
    }

    @org.junit.jupiter.api.Test
    void getCourse() {
        //assertEquals();
    }

    @org.junit.jupiter.api.Test
    void enrollStudent() {
        //assertEquals();
    }

    @org.junit.jupiter.api.Test
    void showEnrolledStudents() {
    }

    @org.junit.jupiter.api.Test
    void showSummary() {
    }
}