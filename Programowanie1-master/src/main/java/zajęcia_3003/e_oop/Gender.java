package zajęcia_3003.e_oop;

public enum Gender {
    MALE,
    FEMALE;

    public static Gender getGender() {
        return Math.random() > 0.5 ? MALE: FEMALE;
    }
}
