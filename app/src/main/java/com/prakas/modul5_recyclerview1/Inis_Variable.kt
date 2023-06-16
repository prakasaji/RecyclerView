package com.prakas.modul5_recyclerview1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Inis_Variable(
    val fotomhs: Int = 0,
    val namamhs: String,
    val nimmhs: String,
    val telp: String
) : Parcelable
