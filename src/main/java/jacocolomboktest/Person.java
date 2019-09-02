package jacocolomboktest;

import lombok.Data;

@Data

public class Person {

    private String name;
    private int age;

    public boolean hasReachedMajority() {
        return age >= 18;
    }
}