package main.java.com.cbsgenesis.trainsmanagementsystem.model;

/**
 * Class that extends class {@link BaseEntity} adding property 'name'.
 * Used as a base class for all objects that need this property.
 *
 * @author Eugene Suleimanov
 */

public class NamedEntity extends BaseEntity {
    private String name;

    public NamedEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NamedEntity{" +
                "Id: " + super.getId() +
                "Name: " + name;
    }
}
