package com.example.homework3_7

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BlankFragment2 : Fragment() {
    private lateinit var binding: FragmentMusicBinding
    private var resultFragment:MainActivity2 = MainActivity2()
    private  var bundle: Bundle= Bundle()

    private val musicList = arrayListOf(
        Music("1","Star","Maik","1:33"),
        Music("2","Super","Sem","2:15"),
        Music("3","mimimi","Leo","3:04"),
        Music("4","Peoples ","Rik","9:33"),
        Music("5","double take","Morty","3:10"),
        Music("6","shage","EMENIM","2:26"),
        Music("7","sunshain","Den","8:15"),
        Music("8","Good Day","Artur","3:56"),
        Music("9","poison","Salamon","2:12"),
        Music("10","goals","Rudius","1:32")


    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        binding = FragmentMusicBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = MusicAdapter(musicList, this::onClick)
        binding.rvMusic.adapter = adapter
    }
    private fun onClick(position:Int){
        val music= musicList[position]
        val intent = Intent(activity, MainActivity2::class.java)
        intent.putExtra("name",  music.songName)
        intent.putExtra("singer", music.singerName)
        startActivity(intent)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }



}