package spring.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("bosuk");
        helloLombok.setAge(33);

        System.out.println("helloLombok = " + helloLombok);
    }
}
