package com.prakas.modul5_recyclerview1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    val Datamahasiswa = listOf<Inis_Variable>(
        Inis_Variable(
            R.drawable. ultraman,
            namamhs = "Ultraman 1",
            nimmhs = "0001",
            telp = "084123"
        ),
        Inis_Variable(
            R.drawable. tanjiro,
            namamhs = "Tanjiro 1",
            nimmhs = "0002",
            telp = "084123"
        ),
        Inis_Variable(
            R.drawable. ultraman,
            namamhs = "Ultraman 2",
            nimmhs = "0003",
            telp = "084123"
        ),
        Inis_Variable(
            R.drawable. tanjiro,
            namamhs = "Tanjiro 2",
            nimmhs = "0004",
            telp = "084123"
        ),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.setHasFixedSize(true)

        //ShowListMahasiswa()
        //ShowGridMahasiswa()
        ShowCardMahasiswa()
    }

    private fun ShowCardMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager (this)
        val adapter = Card_MahasiswaAdapter(this, Datamahasiswa) {}
        recyclerView.adapter = adapter
    }

    private fun ShowGridMahasiswa() {
        val adapter = Grid_MahasiswaAdapter(grid_mhs = Datamahasiswa){

        }
        val recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.layoutManager = GridLayoutManager (this, 3)
        recyclerView.adapter = Grid_MahasiswaAdapter (Datamahasiswa){

        }
    }

    private fun ShowListMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = List_MahasiswaAdapter(this, Datamahasiswa) {

        }
    }
}