package br.com.usjt.juntos_por_todos.mapas;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import br.com.usjt.juntos_por_todos.R;
import br.com.usjt.juntos_por_todos.databinding.ActivityMapsBinding;


public class Mapa_ACNUR extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng acnur = new LatLng(-23.548239600993078, -46.632717097747516);
        mMap.addMarker(new MarkerOptions().position(acnur).title("Agência da ONU para refugiados"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(acnur));
    }
}