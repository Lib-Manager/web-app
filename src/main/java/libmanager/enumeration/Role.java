package libmanager.enumeration;

public enum Role {

    ADMIN("Admin"),
    BIBLIOTHEQUE("Bibliotheque"),
    CLIENT("Client");

    private String displayName;

    Role(String displayName) {
        this.displayName = displayName;
    }
    @Override
    public String toString() {
        return displayName;
    }
}
