package com.tashfia.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnFB,btnGoogle,btnGo;
    EditText etxUrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFB=(Button)findViewById(R.id.btn_fb);
        btnGo=(Button)findViewById(R.id.btn_go);
        btnGoogle=(Button)findViewById(R.id.btn_google);

        etxUrl=(EditText)findViewById(R.id.etxt_url);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url=etxUrl.getText().toString();
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("url",url);
                startActivity(intent);
            }
        });
           btnGoogle.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(MainActivity.this,WebActivity.class);
                   intent.putExtra("url","WWW.Google.com");
                   startActivity(intent);
               }
           });
        btnFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                intent.putExtra("url","WWW.facebook.com");
                startActivity(intent);
            }
        });





    }
}
