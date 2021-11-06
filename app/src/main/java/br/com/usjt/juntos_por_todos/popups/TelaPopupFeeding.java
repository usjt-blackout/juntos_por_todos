package br.com.usjt.juntos_por_todos.popups;

import android.content.Intent;
import android.net.Uri;
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
    private TextView linkTextView;
    private TextView linkDoar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_feeding);
        botaoMapa = (TextView) findViewById(R.id.mapa);
        botaoVoltar = findViewById(R.id.voltar);
        linkTextView = findViewById(R.id.noticia_feed);
        linkDoar = findViewById(R.id.doar_feed);

        linkDoar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://secure.feedingamerica.org/site/Donation2?df_id=26876&26876_donation=form1&mfc_pref=T&s_onsite_promo=MainNav_Donate&s_src=W21ADIRCT&s_channel=no_channel&s_subsrc=https%3A%2F%2Fwww.feedingamerica.org%2F"));
                startActivity(viewIntent);
            }
        });

        linkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.feedingamerica.org"));
                startActivity(viewIntent);
            }
        });

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
