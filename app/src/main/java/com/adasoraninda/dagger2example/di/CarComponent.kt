package com.adasoraninda.dagger2example.di

import com.adasoraninda.dagger2example.MainActivity
import com.adasoraninda.dagger2example.car.Car
import dagger.Component

@Component // The Injector
interface CarComponent {

    fun inject(activity: MainActivity)

}