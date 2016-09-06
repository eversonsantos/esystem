package br.com.esystem.storemob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ds_email;
    private EditText ds_snh;
    private TextView lb_in;
    private Button bt_acessar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ds_email = (EditText) findViewById(R.id.ds_email);
        ds_snh = (EditText) findViewById(R.id.ds_snh);
        bt_acessar = (Button)findViewById(R.id.bt_acessar);
        lb_in = (TextView)findViewById(R.id.lb_in);

        bt_acessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(new Autenticacao().isAutenticado(ds_email.getText().toString().trim(), ds_snh.getText().toString().trim())){
                    ds_email.setText("");
                    ds_snh.setText("");
                    lb_in.setText(new StringBuilder().append("Usuário: ").append(ds_email.getText().toString()).toString());
                    Toast t = Toast.makeText(getApplicationContext(), "Seja Bem-Vindo "+ds_email.getText().toString(), Toast.LENGTH_LONG);
                    t.show();
                }else{
                    lb_in.setText("");
                    Toast t = Toast.makeText(getApplicationContext(), "Usuário ou Senha invalida "+ds_email.getText().toString(), Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });

    }
}
