package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int len = chars.length, index = 0;
        while(index < len) {
            System.out.print(chars[index++]);
        }
    }
}
