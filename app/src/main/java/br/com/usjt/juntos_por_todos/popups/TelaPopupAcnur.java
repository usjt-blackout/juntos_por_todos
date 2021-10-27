package br.com.usjt.juntos_por_todos.popups;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.usjt.juntos_por_todos.R;
import br.com.usjt.juntos_por_todos.mapas.Mapa_ACNUR;

public class TelaPopupAcnur extends AppCompatActivity {

    private TextView botaoMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
        botaoMapa = (TextView) findViewById(R.id.mapa);

        botaoMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPopupAcnur.this, Mapa_ACNUR.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
