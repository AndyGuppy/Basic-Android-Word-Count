package example.codeclan.com.wordcount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andy Guppy on 17/01/2017.
 */
public class WordCounterTest {

    WordCounter wordCounter;


    @Before
    public void before(){
        wordCounter = new WordCounter("There is six words in here");

    }


    @Test
    public void cangetCountOfWords(){
        int count = wordCounter.getCountOfWords();
        assertEquals(6, count);
    }


}