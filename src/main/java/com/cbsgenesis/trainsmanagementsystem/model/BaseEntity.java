package main.java.com.cbsgenesis.trainsmanagementsystem.model;

/**
 * Base class that contains property 'id'.
 * Used as a base class for all objects that need this property.
 *
 * @author Eugene Suleimanov
 */

public class BaseEntity {
    private Long id;

    public BaseEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isNew(){
        return (this.id == null);
    }
}
