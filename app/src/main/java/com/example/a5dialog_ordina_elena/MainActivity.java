package com.example.a5dialog_ordina_elena;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    Button bondon;
    ConstraintLayout constraintLayout;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bondon = (Button)findViewById(R.id.idbdn);
        constraintLayout = (ConstraintLayout)findViewById(R.id.idconstl);
        context = MainActivity.this;
        Toast.makeText(getApplicationContext(),"Вы выбрали ",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {

        final CharSequence[] items = {getText(R.string.red),
                getText(R.string.yellow), getText(R.string.green)

        };

        bondon.setOnClickListener(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);

        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                switch (item) {

                    case 0:
                        constraintLayout.setBackgroundResource(R.color.redC);
                        Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        constraintLayout.setBackgroundResource(R.color.yelC);
                        Toast.makeText(context, R.string.yellow, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        constraintLayout.setBackgroundResource(R.color.greenC);
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                        break;

                }

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }
}