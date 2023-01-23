package hello.core.member;

import lombok.*;

@Getter
@Setter
@ToString // String으로 나오게 해줌
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("asdfas");

        System.out.println("helloLombok = " + helloLombok);
    }
}
