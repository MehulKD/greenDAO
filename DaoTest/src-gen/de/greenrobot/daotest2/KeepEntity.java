package de.greenrobot.daotest2;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// Custom comment
// KEEP INCLUDES END
/**
 * Entity mapped to table KEEP_ENTITY (schema version 1).
 */
public class KeepEntity {

    private Long id;

    // KEEP FIELDS - put your custom fields here
    private String prefixToString = "Custom toString ID=";
    // KEEP FIELDS END

    public KeepEntity() {
    }

    public KeepEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // KEEP METHODS - put your custom methods here
    @Override
    public String toString() {
        return prefixToString + id;
    }
    // KEEP METHODS END

}