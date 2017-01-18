package example.codeclan.com.wordcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.*;

/**
 * Created by Andy Guppy on 17/01/2017.
 */
// WordCount.java
public class WordCount extends AppCompatActivity {

    EditText wordstocountEditText;
    TextView countanswerText;
    Button countwordButton;

    @Override
    protected void onCreate(Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_main);
        wordstocountEditText = (EditText)findViewById(R.id.wordstocount_text);
        countanswerText = (TextView)findViewById(R.id.countanswer_text);
        countwordButton = (Button)findViewById(R.id.count_button);



        Log.d("WordCount", "onCreate has been called");

    }

    public void onCountButtonClicked(View button) {
        String wordstocount = wordstocountEditText.getText().toString();
        WordCounter wordcounter = new WordCounter(wordstocount);
        countanswerText.setText(wordcounter.toString());
        Log.d(getClass().toString(), "onCountButtonClicked was called");
        Log.d("WordCount:", "The words to count were '" + wordstocount + "'");

    }
}
