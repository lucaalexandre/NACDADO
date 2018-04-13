package lucaalexandreparrapintoaraujo.com.br.nacdado

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_dado.*
import java.util.*

class DADOActivity : AppCompatActivity() {

    private val gerarImagem: Random? = null

    private val dado1 = 1
    private val dado2 = 2
    private val dado3 = 3
    private val dado4 = 4
    private val dado5 = 5
    private val dado6 = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dado)




    }
}
