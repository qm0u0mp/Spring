package com.haneul.basic.dto;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
// Request Body로 받는 데이터에 대한 유효성 검사 validation 의존성을 추가해야함
public class RequestSampleDto {

    @NotNull // 해당 속성을 null이 올 수 없도록 지정
    private String notNull;

    @NotEmpty // 문자열일 경우 null 또는 빈 문자열이 올 수 없도록 지정
    private String notEmpty;

    @NotBlank // 문자열일 경우 null 또는 빈 문자열 또는 공백으로된 문자열이 올 수 없도록 지정
    private String notBlank;

    // RequestBody로 받아오는 데이터는 Wrapper 클래스 타입으로 데이터를 받는 것이 좋음
    @NotNull
    // @NotEmpty @NotBlank => Integer에 대해선 유효하지 않음, 문자열에서만 유효함
    private Integer requiredInt; // int로 선언했을 경우, 값이 null이어도 에러 발생 안 함

    @Length(min = 5, max = 10) // 문자열일 경우 문자열 길이의 최소, 최대를 지정 (null 값이면 검사 안함)
    @NotNull
    private String length;

    @Max(100) // 최대값 지정
    @Min(0) // 최소값 지정
    @NotNull
    private Integer maxMin;

    @Range(min = 0, max = 100) // 최대 최소 범위를 지정
    @NotNull
    private Integer range;

    @Email // 문자열이 이메일 형식인지 확인
    @NotEmpty
    private String email;

    // 정규식을 이용해 문자열의 패턴 검사를 진행
    // 이메일 형식 email@eamil.com | email@email.co.kr
    // 전화번호, 이메일, url, 주민등록번호, 비밀번호, 영어로만된 문자열, 한글로만된 문자열
    @Pattern(regexp = "^[a-zA-Z0-9]*@([-.]?[a-zA-Z0-9])*\\.[a-zA-Z]{2,4}$")
    private String emailPattern;
}
