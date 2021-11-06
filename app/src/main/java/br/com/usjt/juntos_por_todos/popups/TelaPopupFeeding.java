package br.com.usjt.juntos_por_todos.popups;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.usjt.juntos_por_todos.R;
import br.com.usjt.juntos_por_todos.TelaOrganizacoesActivity;
import br.com.usjt.juntos_por_todos.mapas.Mapa_FeedingAmerica;

public class TelaPopupFeeding extends AppCompatActivity {

    private TextView botaoMapa;
    private TextView botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_feeding);
        botaoMapa = (TextView) findViewById(R.id.mapa);
        botaoVoltar = findViewById(R.id.voltar);

        botaoMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPopupFeeding.this, Mapa_FeedingAmerica.class);
                startActivity(intent);
                finish();
            }
        });

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPopupFeeding.this, TelaOrganizacoesActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}