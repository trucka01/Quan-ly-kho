package com.example.pc.test;

import java.util.Locale;

import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.method.PasswordTransformationMethod;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pc.test.CreateAuthorActivity;
import com.example.pc.test.InsertBookActivity;
import com.example.pc.test.R;
import com.example.pc.test.ShowListAuthorActivity;
import com.example.pc.test.ShowListAuthorActivity2;

/**
 * hàm hình chính cho phép chọn các thao tác
 * @author drthanh
 *
 */
public class MainActivity extends Activity {

    Button btnDn;
    EditText edtMk, edtTk;
    public static final String TITLE="TITLE";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDn = (Button) findViewById(R.id.btnDn);
        edtMk = (EditText) findViewById(R.id.edtMk);
        edtTk = (EditText) findViewById(R.id.edtTk);
        Bundle bundle = new Bundle();

        edtMk.setTransformationMethod(new PasswordTransformationMethod());
        btnDn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = edtTk.getText().toString();
                byExtras(title);
            }
        });

    }
    public void byExtras(String title){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra(TITLE,title);
        startActivity(intent);
    }
}
