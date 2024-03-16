package com.example.myway

import android.graphics.Bitmap
import com.example.myway.data.Chat

data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String="",
    val bitmap: Bitmap?=null
)