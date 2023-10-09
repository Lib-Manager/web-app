package libmanager.enumeration;

public enum Type {

    ROMAN("Roman"),
    LIVRE("Livre"),
    PIECE_DE_THEATRE("Pièce de théàtre"),
    BD("BD"),
    MANGA("Manga"),
    CD_ROM("CD-ROM"),
    CD("CD"),
    JOURNAL("Journal"),
    MAGASINE("Magasine");

    private String displayName;

    Type(String displayName) {
        this.displayName = displayName;
    }
    @Override
    public String toString() {
        return displayName;
    }

}
