package br.com.usjt.juntos_por_todos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.usjt.juntos_por_todos.popups.TelaPopupAcnur;
import br.com.usjt.juntos_por_todos.popups.TelaPopupAmericares;
import br.com.usjt.juntos_por_todos.popups.TelaPopupCruzVermelha;
import br.com.usjt.juntos_por_todos.popups.TelaPopupFeeding;
import br.com.usjt.juntos_por_todos.popups.TelaPopupUnited;

public class TelaOrganizacoesActivity extends AppCompatActivity {

    private ImageView cruzVermelha;
    private ImageView acnur;
    private ImageView united;
    private ImageView feeding;
    private ImageView americares;
    private Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizacoes);
        cruzVermelha = (ImageView) findViewById(R.id.cruz_vermelha_logo);
        acnur = (ImageView) findViewById(R.id.acnur_logo);
        united = (ImageView) findViewById(R.id.united_way_logo);
        feeding = (ImageView) findViewById(R.id.feeding_logo);
        americares = (ImageView) findViewById(R.id.americares_logo);
        voltar = (Button) findViewById(R.id.voltar);

        cruzVermelha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaOrganizacoesActivity.this, TelaPopupCruzVermelha.class);
                startActivity(intent);
                finish();
            }
        });

        americares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaOrganizacoesActivity.this, TelaPopupAmericares.class);
                startActivity(intent);
                finish();
            }
        });

        acnur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaOrganizacoesActivity.this, TelaPopupAcnur.class);
                startActivity(intent);
                finish();
            }
        });

        united.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaOrganizacoesActivity.this, TelaPopupUnited.class);
                startActivity(intent);
                finish();
            }
        });
        feeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaOrganizacoesActivity.this, TelaPopupFeeding.class);
                startActivity(intent);
                finish();
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaOrganizacoesActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }




}

