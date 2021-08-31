package com.paul.wang.androidstarter

import android.content.Context
import androidx.startup.Initializer
import retrofit2.Retrofit

class NetworkInitializer: Initializer<Retrofit> {
    override fun create(context: Context): Retrofit {
        TODO("Not yet implemented")
    }
    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        TODO("Not yet implemented")
    }
}
