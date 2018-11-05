package com.humblesport.jatnikautsmobpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class ListPertandinganActivity extends AppCompatActivity {

    private final LinkedList<ModelPertandingan> listPertandingan = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private ListPertandinganAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pertandingan);

        String des1 = "Barcelona menang telak dengan skor 5-1 atas Real Madrid di El Clasico pada pekan ke-10 Liga Spanyol. Luis Suarez hat-trick di laga itu.\n" +
                "\n" +
                "Barcelona tampil mendominasi saat menjamu Madrid di Camp Nou, Minggu (28/10/2018). Di babak pertama, Blaugrana unggul 2-0 lewat gol Philippe Coutinho di menit ke-10 dan penalti Suarez menit ke-30.";
        String des2 = "Super big match akan terjadi di Liga Italia. Inter Milan akan menjamu rival sekotanya AC Milan di Stadion Giuseppe Meazza, Minggu malam waktu setempat (21/10/2018).\n" +
                "\n" +
                "Inter dan AC Milan menghadapi laga bertajuk Derby della Madonnina ini, dengan modal yang baik. Rossoneri tak terkalahkan dalam delapan pertandingan terakhir mereka di semua kompetisi. Mereka telah mencetak 10 gol dalam tiga pertandingan terakhir mereka.";
        String des3 = "Laga Arsenal versus Liverpool pada pekan ke-10 Premier League—kasta teratas Liga Inggris—di Stadion Emirates, Sabtu (3/11/2018), berakhir imbang 1-1. Alexandre Lacazette tampil sebagai penyelamat tuan rumah.  Pada pertandingan tersebut, Liverpool unggul terlebih dahulu pada menit ke-61 lewat sepakan James Milner, memanfaatkan bola tepisan kiper Arsenal, Bernd Leno.";
        String des4 = "Pertandingan Persib Bandung versus Persija Jakarta berlangsung panas. Bahkan, satu suporter menjadi korban dari tensi tinggi rivalitas dua klub teras tersebut.  Persib Bandung menjamu Persija Jakarta di Stadion Gelora Bandung Lautan Api (GBLA) pada pertandingan pekan ke-23 Liga 1, Minggu (23/9/2018) sore. Di hadapan pendukungnya sendiri, Maung Bandung menang dramatis 3-2 atas Macan Kemayoran.";
        String des5 = "Bayern Munchen akan menghadapi Borussia Dortmund di Allianz Arena pada laga pekan ke-28 Bundesliga, Sabtu (31/3/2018). Bayern Munchen berpeluang mengamankan gelar jika mampu menang atas Borussia Dortmund, sedangkan Schalke kalah dari Freiburg.";
        String des6 = "Manchester City memastikan Kevin De Bruyne akan absen saat menghadapi Manchester United akhir pekan depan. Hal itu diumumkan klub lewat situs resmi mereka, Jumat (2/11/2018). \n" +
                "\n" +
                "De Bruyne cedera saat Manchester City menghadapi Fulham di Piala Liga Inggris 2018/2019. Dia kontak dengan Timothy Fosu-Mensah hingga akhirnya ditarik keluar lapangan pada menit ke-86.";

        listPertandingan.addLast(new ModelPertandingan("Real Madrid","Barcelona", R.drawable.nadrid, R.drawable.fcb, "https://sport.detik.com/sepakbola/liga-spanyol/4277275/hasil-barcelona-vs-madrid-blaugrana-menang-telak-lewat-hat-trick-suarez", des1));
        listPertandingan.addLast(new ModelPertandingan("AC Milan","Inter Milan", R.drawable.acmilan, R.drawable.inter, "https://www.liputan6.com/bola/read/3672617/derby-della-madonnina-prediksi-susunan-pemain-ac-milan-vs-inter", des2));
        listPertandingan.addLast(new ModelPertandingan("Arsenal","Liverpool", R.drawable.arsenal, R.drawable.liv, "https://bola.kompas.com/read/2018/11/04/03062438/hasil-arsenal-vs-liverpool-lacazette-buyarkan-keunggulan-the-reds", des3));
        listPertandingan.addLast(new ModelPertandingan("Persija","Persib", R.drawable.persija, R.drawable.persib, "https://bola.kompas.com/read/2018/09/24/05350098/persib-vs-persija-44-pelanggaran-10-kartu-kuning-dan-1-korban-jiwa?page=all",des4));
        listPertandingan.addLast(new ModelPertandingan("B. Munchen","Borusia D", R.drawable.munhen, R.drawable.dortmun, "https://www.bola.com/dunia/read/3417565/prediksi-bayern-munchen-vs-borussia-dortmund-di-ambang-juara/page-1",des5));
        listPertandingan.addLast(new ModelPertandingan("Man. United","Man. City", R.drawable.mu, R.drawable.mcity, "https://soccer.sindonews.com/read/1351493/54/city-pastikan-de-bruyne-absen-di-derby-manchester-1541168380", des6));

        mRecyclerView = (RecyclerView) findViewById(R.id.list_pertandingan_cyc);

        mAdapter = new ListPertandinganAdapter( ListPertandinganActivity.this, listPertandingan);

        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
