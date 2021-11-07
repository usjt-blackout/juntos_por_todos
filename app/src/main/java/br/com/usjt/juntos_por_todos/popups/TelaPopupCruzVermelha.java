package br.com.usjt.juntos_por_todos.popups;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.usjt.juntos_por_todos.R;
import br.com.usjt.juntos_por_todos.TelaOrganizacoesActivity;
import br.com.usjt.juntos_por_todos.mapas.Mapa_Cruz_Vermelha;

public class TelaPopupCruzVermelha extends AppCompatActivity {

    private TextView botaoMapa;
    private TextView botaoVoltar;
    private TextView linkTextView;
    private TextView linkDoar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_cruz);
        botaoMapa = (TextView) findViewById(R.id.mapa);
        botaoVoltar = findViewById(R.id.voltar);
        linkTextView = findViewById(R.id.site_cruz);
        linkDoar = findViewById(R.id.doar_cruz);

        linkDoar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://doe.cicv.org.br/institucional/people/new?utm_campaign=institucional-DM&utm_medium=site-cicv&utm_source=institucional"));
                startActivity(viewIntent);
            }
        });

        linkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("http://www.cruzvermelha.org.br/pb/"));
                startActivity(viewIntent);
            }
        });

        botaoMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPopupCruzVermelha.this, Mapa_Cruz_Vermelha.class);
                startActivity(intent);
                finish();
            }
        });

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPopupCruzVermelha.this, TelaOrganizacoesActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
