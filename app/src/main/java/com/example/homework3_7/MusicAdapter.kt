package com.example.homework3_7
import android.widget.TextView
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework3_7.databinding.ItemMusicBinding

class MusicAdapter(private val musicList: List<Music>, val onClick:(position:Int) -> Unit): RecyclerView.Adapter<MusicAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = musicList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(musicList[position])
    }

    inner class ViewHolder(private val binding: ItemMusicBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(music: Music) {
            binding.number.text = music.number
            binding.songName.text = music.songName
            binding.singerName.text = music.singerName
            binding.time.text = music.time

                itemView.setOnClickListener {
                    onClick(position)
                }
            }


        }
    }
}