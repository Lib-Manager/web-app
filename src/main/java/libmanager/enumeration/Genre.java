package libmanager.enumeration;

public enum Genre {

    NOUVELLE("Nouvelle"),
    CONTE("Conte"),
    MYTHE("Mythe"),
    LEGENDE("Légende"),
    BIOGRAPHIE("Biographie"),
    AUTOBIOGRAPHIE("Autobiographie"),
    CHRONIQUE("Chronique"),
    APOLOGUE("Apologue"),
    JOURNAL("Journal"),
    ROMAN("Roman"),
    SENTIMENTAUX("Sentimentaux"),
    MOEURS("Moeurs"),
    APPRENTISSAGE("Apprentissage"),
    SCIENCE_FICTION("Science fiction"),
    AVENTURE("Aventure"),
    PHILOSOPHIQUE("Philosophique"),
    PICARESQUE("Picaresque"),
    POLICIER("Policier"),
    HISTORIQUE("Historique"),
    HORREUR("Horreur"),
    CHANSON("Chanson"),
    BALLADE("Ballade"),
    CALLIGRAMME("Calligramme"),
    CHANT_ROYAL("Chant royal"),
    ELEGIE("Élégie"),
    EPIGRAMME("Épigramme"),
    EPOPEE("Épopée"),
    FATRASIE("Fatrasie"),
    ODE("Ode"),
    TRAGEDIE("Tragédie"),
    COMEDIE("Comédie"),
    FARCE("Farce"),
    MORALITE("Morailité"),
    DRAME("Drame"),
    PROVERBE("Proverbe"),
    ESSAI("Éssai"),
    FABLE("Fable"),
    FABLIAU("Fabliau"),
    PAMPHLET("Pamphlet"),
    SERMON("Sermon"),
    KOMODO("Komodo"),
    SHONEN("Shonen"),
    SHOJO("Shojo"),
    SEINEN("Seinen"),
    JOSEI("Josei"),
    SEIJIN("Seijin"),
    ENCYCLOPEDIE("Encyclopédie"),
    ANIMALIER("Animalier"),
    JEUNESS("Jeunesse"),
    VISITE_DE_MUSEE("Visite de musée");

    private String displayName;

    Genre(String displayName) {
        this.displayName = displayName;
    }
    @Override
    public String toString() {
        return displayName;
    }
}
