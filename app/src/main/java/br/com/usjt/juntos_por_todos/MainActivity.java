package br.com.usjt.juntos_por_todos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button botaoOrganizacoes;
    private Button botaoNoticias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoOrganizacoes = findViewById(R.id.redirecionaOrganizacoes);
        botaoNoticias = findViewById(R.id.redirecionaNoticias);

        botaoOrganizacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TelaOrganizacoesActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botaoNoticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TelaNoticiasActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}