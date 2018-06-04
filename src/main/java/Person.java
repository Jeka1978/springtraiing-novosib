import lombok.Data;

/**
 * @author Evgeny B
 * orisov
 */
@Data
public class Person {
    private String name;
    private String family;
    private int age;

    @java.beans.ConstructorProperties({"name", "family", "age"})
    public Person(String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }
}
