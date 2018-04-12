package ipn.cecyt9.caleb.reserva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText usuario, contrasena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario = findViewById(R.id.usuario);
        contrasena = findViewById(R.id.contrasena);

    }

    public void iniciarSesion(View view) {
        String usr = usuario.getText().toString();
        String psw = contrasena.getText().toString();

        if(usr.equals("Lalin") && psw.equals("Bolin")){
            Intent inicio = new Intent(this, res.class);
            startActivity(inicio);
            finish();
        }
    }
}
