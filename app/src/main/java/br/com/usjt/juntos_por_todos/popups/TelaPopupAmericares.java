package br.com.usjt.juntos_por_todos.popups;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.usjt.juntos_por_todos.R;
import br.com.usjt.juntos_por_todos.TelaOrganizacoesActivity;
import br.com.usjt.juntos_por_todos.mapas.Mapa_Americares;

public class TelaPopupAmericares extends AppCompatActivity {

    private TextView botaoMapa;
    private TextView botaoVoltar;
    private TextView linkTextView;
    private TextView linkDoar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_americares);
        botaoMapa = (TextView) findViewById(R.id.mapa);
        botaoVoltar = findViewById(R.id.voltar);
        linkTextView = findViewById(R.id.site_americares);
        linkDoar = findViewById(R.id.doar_americares);

        linkDoar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://secure.americares.org/site/Donation2?df_id=26733&26733.donation=form1&mfc_pref=T"));
                startActivity(viewIntent);
            }
        });

        linkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.americares.org"));
                startActivity(viewIntent);
            }
        });

        botaoMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPopupAmericares.this, Mapa_Americares.class);
                startActivity(intent);
                finish();
            }
        });

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPopupAmericares.this, TelaOrganizacoesActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
