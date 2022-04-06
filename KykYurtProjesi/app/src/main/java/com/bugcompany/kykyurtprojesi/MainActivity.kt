package com.bugcompany.kykyurtprojesi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bugcompany.kykyurtprojesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var kykList: ArrayList<KykModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val anadoluHisarı = KykModel(
            "Anadolu Hisarı Kyk Kız Öğrenci Yurdu", R.drawable.anadoluhisari,
            "Göksu Cd. 32-14, Göksu, 34815 Beykoz/İstanbul", "(0216) 308 26 17"
        )

        val atasehir = KykModel(
            "Ataşehir Kyk Kız Öğrenci Yurdu",
            R.drawable.atasehir,
            "ÖRNEK MAH. ERCÜMENT BATANAY CAD. NO:27 Ataşehir / İstanbul", "(0216) 470 5427"
        )

        val bahcekoy = KykModel(
            "Bahçeköy Kyk Erkek Öğrenci Yurdu",
            R.drawable.bahcekoy,
            "PTT EVLERİ MAH.HACIOSMAN BAYIRI CAD. NO: 20 34453 SARIYER - İSTANBUL",
            "(0212) 223 0468"
        )

        val fatih = KykModel(
            "Fatih Kyk Kız Öğrenci Yurdu",
            R.drawable.fatih_kyk,
            "AKŞEMSEDDİN MAH.BEDRETTİN SİMAVİ SOK. NO:2 FATİH İSTANBUL", "(0212) 631 1362"
        )

        val iyimaya = KykModel(
            "İyimaya Kyk Kız Öğrenci Yurdu",
            R.drawable.iyimaya,
            "OSMANGAZİ MAHALLESİ ERGUVAN SOKAK NO:8 SANCAKTEPE/İSTANBUL", "(0216) 311 1523"
        )

        val kadirga = KykModel(
            "Kadırga Kyk Erkek Öğrenci Yurdu",
            R.drawable.kadirga,
            "ŞEHSUVARBEY MAH. CÖMERTLER SOK. NO:4 KUMKAPI FATİH- İST.\n" +
                    "Fatih / İstanbul",
            "(0212) 517 9472"
        )

        val kanuniSultanSuleyman = KykModel(
            "Kanuni Sultan Süleyman Kyk Erkek Öğrenci Yurdu",
            R.drawable.kanuni_sultan_suleyman,
            "ZİYA GÖKALP MAHALLESİ MUHSİN ERTUĞRUL CADDESİ NO: 2 İKİTELLİ-BAŞAKŞEHİR/İSTANBUL",
            "0212) 812 3007"
        )

        val mimmarSinan = KykModel(
            "Mimar Sinan Kyk Erkek Öğrenci Yurdu",
            R.drawable.mimar_sinan,
            "ZÜMRÜTEVLER MAHALLESİ EMEK CADDESİ NO: 91 MALTEPE- İSTANBUL",
            "(0216) 371 0191"
        )

        val nigde = KykModel(
            "Niğde Kyk Kız Öğrenci Yurdu",
            R.drawable.nigde,
            "ŞEHREMİNİ MAH. BESTEKAR RAHMİ BEY SOK. NO: 15 FINDIKZADE FATİH/İSTANBUL",
            "(0212) 589 2035"
        )

        val sisli = KykModel(
            "Şişli Kyk Erkek Öğrenci Yurdu",
            R.drawable.sislijpg,
            "KAPTAN PAŞA MAHALLESİ HALİT ZİYA TÜRKKAN SOKAK NO:8\n" +
                    "Şişli / İstanbul",
            "(0212) 222 5510"
        )

        val valimuammer = KykModel(
            "Vali Muammer Güler Kyk Kız Öğrenci Yurdu",
            R.drawable.vali_muammer,
            "ATATÜRK MAH. GİRNE CAD. NO: 2 ATAŞEHİR - İSTANBUL\n" +
                    "Ataşehir / İstanbul",
            "(0216) 455 7571"
        )

        val vezneciler = KykModel(
            "Vezneciler Kyk Kız Öğrenci Yurdu",
            R.drawable.vezneciler,
            "KALENDERHANE MAH. 16 MART ŞEHİTLERİ CAD. NO:3 ŞEHZADEBAŞI / FATİH /İSTANBUL",
            "(0212) 526 2010"
        )

        kykList = ArrayList<KykModel>()
        kykList.add(anadoluHisarı)
        kykList.add(atasehir)
        kykList.add(bahcekoy)
        kykList.add(vezneciler)
        kykList.add(valimuammer)
        kykList.add(sisli)
        kykList.add(nigde)
        kykList.add(mimmarSinan)
        kykList.add(kanuniSultanSuleyman)
        kykList.add(fatih)
        kykList.add(iyimaya)
        kykList.add(kadirga)


        binding.apply {
            rv.setHasFixedSize(true)
            rv.layoutManager = LinearLayoutManager(this@MainActivity)
            rv.adapter = KykAdapter(this@MainActivity, kykList)
        }


    }
}