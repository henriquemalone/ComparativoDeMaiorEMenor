package gasolinaoualcool.cursoandroid.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText valorAlcool;
    private EditText valorGasolina;
    private Button verifica;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(gasolinaoualcool.cursoandroid.com.gasolinaoualcool.R.layout.activity_main);

        valorAlcool = (EditText) findViewById(gasolinaoualcool.cursoandroid.com.gasolinaoualcool.R.id.editAlcoolId);
        valorGasolina = (EditText) findViewById(gasolinaoualcool.cursoandroid.com.gasolinaoualcool.R.id.editGasolinaId);
        verifica = (Button) findViewById(gasolinaoualcool.cursoandroid.com.gasolinaoualcool.R.id.botaoVerifica);
        resultado = (TextView) findViewById(gasolinaoualcool.cursoandroid.com.gasolinaoualcool.R.id.textoResultadoId);

        verifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Float valorA = Float.parseFloat(valorAlcool.getText().toString());
                Float valorG = Float.parseFloat(valorGasolina.getText().toString());

                if(valorA>valorG){
                    resultado.setText("Gasolina mais barata que o alcool");
                }else {
                    resultado.setText("Alcool mais barato que a gasolina");
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    public void recreate() {
        super.recreate();
    }

    @Override
    public void finish() {
        super.finish();
    }
}
