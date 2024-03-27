package com.haneul.basic.service;

import org.springframework.http.ResponseEntity;

import com.haneul.basic.dto.request.student.PostStudentRequestDto;

public interface StudentService {
    ResponseEntity<String> postStudent(PostStudentRequestDto dto);
}