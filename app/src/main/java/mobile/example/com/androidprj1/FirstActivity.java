package mobile.example.com.androidprj1;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.concurrent.ThreadLocalRandom;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {


    ArrayList<String> myList = new ArrayList<String>();
    ArrayList<String> myListTime = new ArrayList<>();



    Button buttonStop, buttonQuit, buttonEqual, buttonClear, buttonShowAll;
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    Button buttonStart, buttonDash, buttonSave;

    Chronometer chronometer;


    private Boolean running =false;


    public String expected;
    public EditText answer;
    public String sumaanswer, time;
    public TextView question;
    public int correctAnswer = 0;
    public int wrongAnswer = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        initialize();
   }

    public void initialize() {

    answer = (EditText)findViewById(R.id.editTextResult);
    question = (TextView)findViewById(R.id.textViewOperations);


    button0 = findViewById(R.id.button0);
    button0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            answer.setText(answer.getText().toString() + "0");
        }
    });

    button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText().toString() + "1");
            }
        });
    button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText().toString() + "2");
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText().toString() + "3");
            }
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText().toString() + "4");
            }
        });
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText().toString() + "5");
            }
        });
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText().toString() + "6");
            }
        });
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText().toString() + "7");
            }
        });
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText().toString() + "8");
            }
        });
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText().toString() + "9");
            }
        });

        buttonDash = findViewById(R.id.buttonDash);
        buttonDash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText().toString() + "-");
            }
        });


        chronometer = findViewById(R.id.Chronometer);
        chronometer.setFormat("Time: %s");


        buttonSave = findViewById(R.id.buttonSave);
        buttonStart = findViewById(R.id.buttonStart);
        buttonClear = findViewById(R.id.buttonClear);
        buttonStop = findViewById(R.id.buttonStop);
        buttonQuit = findViewById(R.id.buttonQuit);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonShowAll = findViewById(R.id.buttonShowAll);


        buttonSave.setOnClickListener(this);
        buttonStart.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonQuit.setOnClickListener(this);
        buttonShowAll.setOnClickListener(this);


        buttonSave.setVisibility(View.GONE);

        question.setText("");


        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if (SystemClock.elapsedRealtime() - chronometer.getBase() >= 10000){
                    chronometer.setBase(SystemClock.elapsedRealtime());
                    Toast.makeText(FirstActivity.this, "Times End", Toast.LENGTH_LONG);
                    setQuestion();
                }
            }
        });


    }

    public void submitButton()
    {
        if (answer.getText().toString().equals(expected)){
            Toast.makeText(this, "Correct" , Toast.LENGTH_SHORT).show();
            //Toast.makeText(this, ""+expected+"="+answer.getText().toString() , Toast.LENGTH_LONG).show();
            correctAnswer++;
            sumaanswer=question.getText().toString() +"="+answer.getText().toString()+"\n"+ "Your Answer is Correct\n"+"---------------------\n";
            time = String.valueOf(SystemClock.elapsedRealtime() - chronometer.getBase());
        }
        else {

            Toast.makeText(this, "Incorrect" , Toast.LENGTH_SHORT).show();
            //Toast.makeText(this, ""+expected+"="+answer.getText().toString() , Toast.LENGTH_LONG).show();
            wrongAnswer++;
            sumaanswer=question.getText().toString() +"="+answer.getText().toString()+"\n"+ "Your Answer is Wrong!!!\n"+"Correct Answer is:"+expected+"\n"+"---------------------\n" ;
            time = String.valueOf(SystemClock.elapsedRealtime() - chronometer.getBase());
        }
        answer.setText("");
        myListTime.add(sumaanswer);
        myList.add(sumaanswer);
    }



    public void setQuestion(){

        Random rad = new Random();
        int lrn = ThreadLocalRandom.current().nextInt(0,100);
        int rrn = ThreadLocalRandom.current().nextInt(0,100);


        int randQuestion = rad.nextInt(2);
        if (randQuestion == 1) {
            question.setText(lrn + " + " + rrn);
            expected = "" + (lrn + rrn);
        }
        else if (randQuestion == 2) {
            question.setText(lrn + " - " + rrn);
            expected = "" + (lrn - rrn);
        }
        else  {
            question.setText(lrn + " X " + rrn);
            expected = "" + (lrn * rrn);
        }

        startChronometer();
    }



    private void sendObject() {



        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("myList", myList);
        intent.putExtra("correct",correctAnswer);
        intent.putExtra("wrong",wrongAnswer);
        intent.putExtra("myListTime", myListTime);
        this.startActivity(intent);
    }

    private void startChronometer(){


        if(!running){
            chronometer.setBase(SystemClock.elapsedRealtime());
            chronometer.start();
            running = true;
        }

    }

    private void stopChronometer(){
        if(running){
            chronometer.stop();
            running=false;
        }


    }

    private void resetChronometer(){
        chronometer.setBase(SystemClock.elapsedRealtime());
    }





    @Override
    public void onClick(View v) {
        switch (v.getId()){

//            case R.id.button0:
//                answer.setText("0");
//                break;
//            case R.id.button1:
//                answer.setText("1");
//                break;
//            case R.id.button2:
//                answer.setText("2");
//                break;

            case R.id.buttonStart :
                buttonSave.setVisibility(View.GONE);
                startChronometer();
                try {
                setQuestion();
                } catch (Exception e)
                {
                        Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
                }
                break;

            case R.id.buttonQuit :
                finish();
                break;

            case R.id.buttonEqual :
                submitButton();
                break;


            case R.id.buttonClear :
                answer.setText("");
                break;

            case R.id.buttonShowAll :
                sendObject();
                break;

            case  R.id.buttonStop:
                buttonSave.setVisibility(View.VISIBLE);
                stopChronometer();
                resetChronometer();
                break;

            case R.id.buttonSave:
                break;
        }
    }
}
