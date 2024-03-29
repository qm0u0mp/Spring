package com.haneul.basic.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.haneul.basic.dto.request.student.PostStudentRequestDto;
import com.haneul.basic.entity.StudentEntity;
import com.haneul.basic.repository.StudentRepository;
import com.haneul.basic.service.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImplement implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public ResponseEntity<String> postStudent(PostStudentRequestDto dto) {

        // @CREATE(SQL : INSERT)
        // 1. Entity 클래스의 인스턴스 생성
        // 2. 생성한 인스턴스를 repository.save() 메서드로 저장
        StudentEntity studentEntity = new StudentEntity(dto);
        // save() : 저장 및 수정 (덮어쓰기)
        studentRepository.save(studentEntity);

        return ResponseEntity.status(HttpStatus.CREATED).body("성공!");
    }

}