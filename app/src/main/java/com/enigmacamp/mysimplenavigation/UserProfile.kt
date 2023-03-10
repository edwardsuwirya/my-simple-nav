package com.enigmacamp.mysimplenavigation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserProfile(val userId: String, val fullName: String) : Parcelable
