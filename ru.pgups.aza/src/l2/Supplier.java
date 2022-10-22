package l2;

public class Supplier {
    private String name;
    private String object;
    private String type;

    public Supplier(String name, String object, String type ) {
        this.name=name;
        this.object= object;
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setObject(String object) {
        this.object = object;
    }
}