package com.example.homework3_7

import java.io.Serializable

data class Music(
    val number: String,
    val songName: String,
    val singerName: String,
    val time: String
)
    : Serializable {

}
