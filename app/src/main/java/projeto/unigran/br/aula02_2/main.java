package projeto.unigran.br.aula02_2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class main extends Activity {

    EditText etNome =  (EditText) findViewById(R.id.etNome);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvNome = findViewById(R.id.tvNome);
        TextView tvEmail = findViewById(R.id.tvEmail);
        TextView tvTelefone = findViewById(R.id.tvTelefone);

        EditText etEmail = findViewById(R.id.etEmail);
        EditText etTelefone = findViewById(R.id.etTelefone);

//        Button btSair = findViewById(R.id.btSair);
//        Button btSalvar = findViewById(R.id.btSalvar);

//        btSalvar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Toast.makeText(getApplicationContext(),"Teste", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
    public void acaoSalvar(View view){
        Toast.makeText(getApplicationContext(),"Olá" + etNome.getText(), Toast.LENGTH_SHORT).show();
    }
}
