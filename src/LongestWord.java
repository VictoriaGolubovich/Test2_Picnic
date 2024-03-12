public class LongestWord {
    Picnic picnic = new Picnic();
    public String longestWord(){
        String longestWord = picnic.getWords()[0];
        for (int i = 1; i < picnic.getWords().length; i++) {
            if (picnic.getWords()[i].length() > longestWord.length()){
                longestWord = picnic.getWords()[i];
            }
        }
        return longestWord;
    }
}
