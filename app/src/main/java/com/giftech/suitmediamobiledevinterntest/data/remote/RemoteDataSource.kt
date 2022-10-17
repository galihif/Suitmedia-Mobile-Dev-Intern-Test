package com.giftech.suitmediamobiledevinterntest.data.remote

import com.giftech.suitmediamobiledevinterntest.data.remote.network.ApiService
import javax.inject.Inject

class RemoteDataSource
@Inject constructor(
    private val api:ApiService
) {
    fun test() = "test woi"
}