package example.codeclan.com.wordcount;

/**
 * Created by Andy Guppy on 17/01/2017.
 */
public class WordCounter {
    private String wordstocount;

    public WordCounter(String wordstocount){
        this.wordstocount = wordstocount;
    }


    public int getCountOfWords() {
        return wordstocount.split(" ").length;
    }

    @Override
    public String toString() {
        return "There are  " + getCountOfWords() + " words in - [ " + wordstocount + " ]";
    }
}

