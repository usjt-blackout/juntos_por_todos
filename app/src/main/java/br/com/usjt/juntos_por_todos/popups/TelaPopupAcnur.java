package br.com.usjt.juntos_por_todos.popups;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.usjt.juntos_por_todos.R;
import br.com.usjt.juntos_por_todos.TelaOrganizacoesActivity;
import br.com.usjt.juntos_por_todos.mapas.Mapa_ACNUR;

public class TelaPopupAcnur extends AppCompatActivity {

    private TextView botaoMapa;
    private TextView botaoVoltar;
    private TextView linkTextView;
    private TextView linkDoar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_acnur);
        botaoMapa = (TextView) findViewById(R.id.mapa);
        botaoVoltar = findViewById(R.id.voltar);
        linkTextView = findViewById(R.id.site_acnur);
        linkDoar = findViewById(R.id.doar_ac);

        linkDoar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://doar.acnur.org/acnur/donate.html"));
                startActivity(viewIntent);
            }
        });

        linkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.acnur.org/portugues/"));
                startActivity(viewIntent);
            }
        });

        botaoMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPopupAcnur.this, Mapa_ACNUR.class);
                startActivity(intent);
                finish();
            }
        });

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPopupAcnur.this, TelaOrganizacoesActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
