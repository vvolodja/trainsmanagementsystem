package com.cbsgenesis.trainsmanagementsystem.model;

/**
 * Simple JavaBean domain object that represents a freight Waggon.
 *
 * @author Eugene Suleimanov
 */
public class FreightWagoon extends Wagoon{
    private String type;

    public FreightWagoon(int weight, String type) {
        super(weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "FreightWagoon{" +
                "type='" + type + '\'' +
                '}';
    }
}
