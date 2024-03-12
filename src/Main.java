public class Main {
    public static void main(String[] args) {
        Picnic picnic = new Picnic();
        Words words = new Words();
        System.out.println(words.countOfWords());
        LongestWord longestWord = new LongestWord();
        System.out.println(longestWord.longestWord());
        CountWords countWords = new CountWords();
        System.out.println(countWords.countWord());
    }
}