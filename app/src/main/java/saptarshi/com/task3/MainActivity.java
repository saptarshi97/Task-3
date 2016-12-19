package saptarshi.com.task3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "Task 3 Completed";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,getResources().getString(R.string.toast_text), duration);
        toast.show();
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        TextView editText = (TextView) findViewById(R.id.edit_message);
        String message = editText.getResources().getString(R.string.message2);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
