package PasswordGenerator;

public class RandomCharacters {
    public static char generator (char firstCharacter, char secondCharacter) {
        return (char)(firstCharacter + Math.random() * (secondCharacter - firstCharacter + 1));
    }

    public static char getRandomLowerCaseLetters() {
        return generator('a', 'z');
    }

    public static char getRandomNumbers() {
        return generator('0', '9');
    }

    public static char getRandomUpperCaseLetters() {
        return generator('A', 'Z');
    }
}
