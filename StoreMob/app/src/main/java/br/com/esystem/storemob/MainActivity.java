package br.com.esystem.storemob;


import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;


import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends Activity {
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
        bt_acessar = (Button) findViewById(R.id.bt_acessar);
        lb_in = (TextView) findViewById(R.id.lb_in);
        lb_in.setText("Hello Boy");

        RequestQueue queue = Volley.newRequestQueue(this);

        JsonObjectRequest json = new JsonObjectRequest(Request.Method.GET, "https://viacep.com.br/ws/67140260/json/", null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response.toString());
                try {
                    lb_in.setText(response.get("cep").toString());
                }catch (JSONException ex){

                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println(error.toString());
                lb_in.setText(error.toString());
            }
        });
        queue.add(json);

                bt_acessar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (new Autenticacao().isAutenticado(ds_email.getText().toString().trim(), ds_snh.getText().toString().trim())) {
                            ds_email.setText("");
                            ds_snh.setText("");
                            lb_in.setText(new StringBuilder().append("Usuário: ").append(ds_email.getText().toString()).toString());
                            Toast t = Toast.makeText(getApplicationContext(), "Seja Bem-Vindo " + ds_email.getText().toString(), Toast.LENGTH_LONG);
                            t.show();
                        } else {
                            lb_in.setText("");
                            Toast t = Toast.makeText(getApplicationContext(), "Usuário ou Senha invalida " + ds_email.getText().toString(), Toast.LENGTH_LONG);
                            t.show();
                        }
                    }
                });


    }



}
