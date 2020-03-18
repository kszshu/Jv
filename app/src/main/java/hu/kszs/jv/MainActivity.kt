package hu.kszs.jv

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_kiszamol.setOnClickListener {

            kiszamolo ()

        }
    }

    private fun kiszamolo() {
        val szja = 0.15
        tv_MeccsekDijja.text =("${et_EgyMecss.text}".toInt() * "${et_Meccs_Szam.text}".toInt()).toString()
        tv_Utikoltseg.text =("${et_Km.text}".toInt() * "${et_MkoszNorma.text}".toInt()).toString()
        tv_SzumSzum.text =("${et_EgyMecss.text}".toInt() * "${et_Meccs_Szam.text}".toInt() + "${et_Km.text}".toInt() * "${et_MkoszNorma.text}".toInt()).toString()
        tv_jvdij_nb.text = tv_SzumSzum.text
        tv_Koltseg_nb.text = ("${tv_jvdij_nb.text}".toInt() * 0.1).toInt().toString()
        tv_JarulekAlapNb.text = ("${tv_jvdij_nb.text}".toInt() - "${tv_Koltseg_nb.text}".toInt()).toString()
        tv_SzJA15Nb.text = (("${tv_JarulekAlapNb.text}".toInt() * szja).roundToInt()).toString()
        tv_levonasokNb.text = tv_SzJA15Nb.text
        tv_KifizetendoNb.text = ("${tv_jvdij_nb.text}".toInt() - "${tv_levonasokNb.text}".toInt()).toString()
    }
}

