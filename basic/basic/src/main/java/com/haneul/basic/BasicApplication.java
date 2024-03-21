// http 응답코드
// 100 - 정보응답
// 200 - 성공응답
// 300 - 리다이렉션 메시지(응답이 주어짐)
// 400 - 클라이언트 에러 응답(우리 문제)(400, 404를 가장 많이 봄)
// 500 - 서버 에러 응답(서버 문제)(500, 502를 가장 많이 보게 될 듯)
package com.haneul.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
	}

}
