package pertemuan_3

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bengapps.R
import com.example.bengapps.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {


        private lateinit var binding: ActivityThirdBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityThirdBinding.inflate(layoutInflater) //mengubah menggunakan binding
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnKirim.setOnClickListener {
            val nomor = binding.inputNoTujuan.text

            Toast.makeText(this, "pesan di kirim ke :  $nomor" , Toast.LENGTH_SHORT).show()
        }
        }
    }
}
