package challenge.entities;

public class RentRooms {
    private String name;
    private String mail;

    public RentRooms() {
    }
    public RentRooms(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }
    public String getMail() {
        return mail;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return name + ", " + mail;
    }
}
