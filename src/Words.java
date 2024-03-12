public class Words {
    Picnic picnic = new Picnic();
    public Integer countOfWords(){
        String[] array = picnic.getWords();
        return array.length;
    }
}
