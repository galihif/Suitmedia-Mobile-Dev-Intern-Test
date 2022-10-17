package com.giftech.suitmediamobiledevinterntest.di

import com.giftech.suitmediamobiledevinterntest.data.MainRepository
import com.giftech.suitmediamobiledevinterntest.data.remote.RemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module(includes = [RemoteModule::class])
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(remote:RemoteDataSource) = MainRepository(remote)
}