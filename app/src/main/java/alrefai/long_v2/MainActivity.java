package alrefai.long_v2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    public Button button;
    public static EditText etfname,etlname;
    public TextView tv1;
//      Spinner Seat = (Spinner) findViewById(R.id.spinner);
//    String text = Seat.getSelectedItem().toString();

    public static int po , to;
    Spinner From;
    Spinner To;

    String seats;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button = (Button) findViewById(R.id.button);
        etfname = (EditText) findViewById(R.id.editText);
        etlname = (EditText) findViewById(R.id.etlast);

        From = (Spinner) findViewById(R.id.From);
        To =   (Spinner)findViewById(R.id.To);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Seat, android.R.layout.simple_spinner_item);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        assert spinner != null;
//        spinner.setAdapter(adapter);



        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                try {
//                    if (seat.getSelectedItem().toString() != null) {
//                        seats = seat.getSelectedItem().toString();
//                        po = seat.getSelectedItemPosition();
//                        startActivity(new Intent(getApplicationContext(), NormalClickActivity.class));
//
//                    }
//                }
                Intent intent = new Intent(MainActivity.this,NormalClickActivity.class);
                startActivity(intent);
                po = From.getSelectedItemPosition();
                to= To.getSelectedItemPosition();
//                catch (Exception e) {
//                    Toast.makeText(getApplicationContext(), "Error! Please fill all fields.", Toast.LENGTH_LONG).show();
//                    e.printStackTrace();
//                }
            }
        });



     }



}

