package kaushiks.theappcompany.com.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

        int randomNumber;

        public void generateRandomNumber(){

            Random rand = new Random();

            randomNumber = rand.nextInt(20) + 1;


        }

        public void guess(View view){

            String message;

            EditText editText = (EditText) findViewById(R.id.editText);

            if(editText.getText().toString().isEmpty()){

                message= "Please enter a value!";

            }
                else {

                int guessValue = Integer.parseInt(editText.getText().toString());


                if (guessValue > randomNumber) {

                    message = "Think Lower!";

                } else if (guessValue < randomNumber) {

                    message = "Think Higher!";

                } else {

                    message = "You Got it! Try again! ";
                    generateRandomNumber();

                }

            }

            Toast.makeText(this, message , Toast.LENGTH_SHORT).show();

            Log.i("Entered Value: ", editText.getText().toString());

            Log.i("Random Number: ", Integer.toString(randomNumber));


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();
    }
}
