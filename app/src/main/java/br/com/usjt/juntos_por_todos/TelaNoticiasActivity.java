package br.com.usjt.juntos_por_todos;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaNoticiasActivity extends AppCompatActivity {

    private Button voltar;
    private TextView acnur1;
    private TextView uww1;
    private TextView uww2;
    private TextView feed1;
    private TextView americares1;
    private TextView americares2;
    private TextView cruz1;
    private TextView cruz2;
    private TextView acnur2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_noticias);
        voltar = findViewById(R.id.voltar);

        americares1 = (TextView) findViewById(R.id.americares_1_text);
        americares2 = (TextView) findViewById(R.id.americares_2_text);
        acnur1 = (TextView) findViewById(R.id.ancnur_1_text);
        acnur2 = (TextView) findViewById(R.id.anur_2_text);
        uww1 = (TextView) findViewById(R.id.uww_1_text);
        uww2 = (TextView) findViewById(R.id.uww_2_text);
        feed1 = (TextView) findViewById(R.id.feed_1_text);
        cruz1 = (TextView) findViewById(R.id.cruz_1_text);
        cruz2 = (TextView) findViewById(R.id.cruz_2_text);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaNoticiasActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        acnur1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (acnur1 != null) {
                    acnur1.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        uww1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (uww1 != null) {
                    uww1.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        uww2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (uww2 != null) {
                    uww2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        feed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (feed1 != null) {
                    feed1.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        americares1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (americares1 != null) {
                    americares1.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        cruz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cruz1 != null) {
                    cruz1.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        acnur2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (acnur2 != null) {
                    acnur2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        americares2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (americares2 != null) {
                    americares2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });

        cruz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cruz2 != null) {
                    cruz2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        });
    }
}