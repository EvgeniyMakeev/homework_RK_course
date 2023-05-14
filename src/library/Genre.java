package library;
public enum Genre {
    NOVEL("Роман"),
    FANTASY("Фэнтази"),
    LOVE_STORY("Любовная история"),
    DETECTIVE("Детектив");

    private String string;

    Genre(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
