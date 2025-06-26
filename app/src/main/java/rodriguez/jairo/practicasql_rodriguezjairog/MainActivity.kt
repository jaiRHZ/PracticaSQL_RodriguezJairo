package rodriguez.jairo.practicasql_rodriguezjairog

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val etNombre: EditText = findViewById(R.id.nombre)
        val etApellidoPaterno: EditText = findViewById(R.id.apellidoPaterno)
        val etApellidoMaterno: EditText = findViewById(R.id.apellidoMaterno)
        val etCarrera: EditText = findViewById(R.id.carrera)
        val guardar: Button = findViewById(R.id.btnSave)

        guardar.setOnClickListener {
            var nombre = etNombre.text.toString()
            var apellidoPaterno = etApellidoPaterno.text.toString()
            var apellidoMaterno = etApellidoMaterno.text.toString()
            var carrera = etCarrera.text.toString()
        }
    }
}