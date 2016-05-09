package alrefai.long_v2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NormalClickActivity extends AppCompatActivity {

   public TextView name,name1,From,To;
    int pos ,TO , se ,s2;
    String F , T;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_click);
        pos=MainActivity.po;
        TO=MainActivity.to;

        name = (TextView) findViewById(R.id.tv_first);
        name1 = (TextView) findViewById(R.id.tv_last);

        name.setText("First Name  :" +MainActivity.etfname.getText().toString());
        name1.setText("Last Name  :"+MainActivity.etlname.getText().toString());
        From=(TextView)findViewById(R.id.tv_from);
        To=(TextView)findViewById(R.id.tv_to);

            if (pos == 0) {
                F = "sharjah";
            } else if (pos == 1) {
                F = "DXB";
            } else if (pos == 2) {
                F = "Ajman";
            }

        if (TO==0){T="Sharjah";}
        else
        if (TO == 1) {T="DXB";}
        else
        if (TO == 2) {T="AJMAN";}

//        name1.setText(MainActivity.Fname);
       //     name.setText("The First Name is :" + MainActivity.etfname.getText().toString());
        From.setText("Travelling From :" +  F);
        To.setText("                      To :" +  T);



    }
}
