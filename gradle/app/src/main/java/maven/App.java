/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package maven;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
// @NoArgsConstructor => 변수 선언 시 final로 선언하면 무조건 값이 필요하기 때문에 빈 생성자 생성 불가능
@RequiredArgsConstructor // final로 지정된 것들만 생성자를 만들어줌
@Builder
class Person {
    private int age;
    private final String name;
}

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Person person = new Person(20, "홍길동");
        person = new Person("고길동");

        person = Person.builder().name("홍길동").age(20).build();
    }
}