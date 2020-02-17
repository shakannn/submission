package com.darkshan.mymovcat3.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    var photo:String,
    var name: String,
    var rate:String,
    var description:String
    ):Parcelable