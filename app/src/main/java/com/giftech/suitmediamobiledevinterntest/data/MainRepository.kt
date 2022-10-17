package com.giftech.suitmediamobiledevinterntest.data

import com.giftech.suitmediamobiledevinterntest.data.remote.RemoteDataSource
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val remote:RemoteDataSource
) {

    fun test() = remote.test()
}