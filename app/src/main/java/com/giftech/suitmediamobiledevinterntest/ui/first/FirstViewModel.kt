package com.giftech.suitmediamobiledevinterntest.ui.first

import androidx.lifecycle.ViewModel
import com.giftech.suitmediamobiledevinterntest.data.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor(
    private val repo:MainRepository
): ViewModel() {
    fun test() = repo.test()
}
