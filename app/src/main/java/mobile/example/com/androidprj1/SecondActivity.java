package mobile.example.com.androidprj1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewResult,textViewCorrectP, textViewWrongP;
    Button buttonGoBack;

    ArrayList<String> myList = new ArrayList<>();
    ArrayList<String> myListTime = new ArrayList<>();

    int correctAns;
    int wrongAns;
    float correctPorcentage;
    float wrongPorcentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


         myList  = (ArrayList<String>) getIntent().getExtras()
                .getSerializable("myList");

         myListTime = (ArrayList<String>) getIntent().getExtras()
                .getSerializable("myListTime");

         textViewCorrectP = findViewById(R.id.textViewCorrectP);
         textViewWrongP = findViewById(R.id.textViewWrongP);
        textViewResult = findViewById(R.id.textViewResult);
        buttonGoBack = findViewById(R.id.buttonGoBack);
        buttonGoBack.setOnClickListener(this);


        int N = myList.size();

        for (int i = 0; i < N; i++) {
            //textViewResult = new TextView(this);
            textViewResult.setText(String.valueOf(myList)); //customize as you wish
           // myList.add(textViewResult);
        }
//        int N = myList.size();
//        List<TextView> list = new ArrayList<TextView>(N);
//        for (int i = 0; i < N; i++) {
//            TextView t = new TextView(this);
//            t.setText(""+myList.get(i)); //customize as you wish
//            list.add(t);
//        }


//
          String correctA = String.valueOf(getIntent().getExtras().getSerializable("correct"));
          String wrongA = String.valueOf(getIntent().getExtras().getSerializable("wrong"));
        correctAns = Integer.parseInt(correctA);
        wrongAns = Integer.parseInt(wrongA);


       calculatePorcentage();
    }

    private void goBack() {



        Intent intent = new Intent(this, FirstActivity.class);
        this.startActivity(intent);
    }

    @Override
    public void onClick(View v) {

        goBack();

    }

    private void calculatePorcentage()
    {

        correctPorcentage = (correctAns * 100) / myList.size();
        wrongPorcentage = (wrongAns * 100) / myList.size();

        textViewCorrectP.setText(""+correctPorcentage+"% Correct Answer");
        textViewWrongP.setText(""+wrongPorcentage+"% Wrong Answer");
    }
}
