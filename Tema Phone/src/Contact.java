public class Contact {
    private String name;
    private String phoneNumber;
    private int id;

    public Contact(String name, String phoneNumber, int id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override

    public String toString() {
        return "Contact{" + "name=" + name + ",phoneNumber='" + phoneNumber + '\'' + ",id='" + id + '\'' + '}';

    }
}
