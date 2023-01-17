package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int size = chars.length;
        System.out.println(chars);
    }

    public static void main(String[] args) {
        WordsBuilder builder = new WordsBuilder();

        builder.buildPhrase('l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l');
    }
}
