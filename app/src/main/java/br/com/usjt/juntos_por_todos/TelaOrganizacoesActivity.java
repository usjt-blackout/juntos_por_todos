package br.com.usjt.juntos_por_todos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.usjt.juntos_por_todos.mapas.Mapa_ACNUR;
import br.com.usjt.juntos_por_todos.mapas.Mapa_Americares;
import br.com.usjt.juntos_por_todos.mapas.Mapa_Boy;
import br.com.usjt.juntos_por_todos.mapas.Mapa_Cruz_Vermelha;
import br.com.usjt.juntos_por_todos.mapas.Mapa_UTW;

public class TelaOrganizacoesActivity extends AppCompatActivity {

    private ImageView cruzVermelha;
    private ImageView acnur;
    private ImageView united;
    private ImageView boys;
    private ImageView americares;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizacoes);
        cruzVermelha = (ImageView) findViewById(R.id.cruz_vermelha_logo);
        acnur = (ImageView) findViewById(R.id.acnur_logo);
        united = (ImageView) findViewById(R.id.united_way_logo);
        boys = (ImageView) findViewById(R.id.boys_logo);
        americares = (ImageView) findViewById(R.id.americares_logo);

        cruzVermelha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaOrganizacoesActivity.this, Mapa_Cruz_Vermelha.class);
                startActivity(intent);
                finish();
            }
        });

        americares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaOrganizacoesActivity.this, Mapa_Americares.class);
                startActivity(intent);
                finish();
            }
        });

        acnur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaOrganizacoesActivity.this, Mapa_ACNUR.class);
                startActivity(intent);
                finish();
            }
        });

        united.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaOrganizacoesActivity.this, Mapa_UTW.class);
                startActivity(intent);
                finish();
            }
        });
        boys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaOrganizacoesActivity.this, Mapa_Boy.class);
                startActivity(intent);
                finish();
            }
        });
    }




}

