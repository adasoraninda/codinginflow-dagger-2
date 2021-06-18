package com.adasoraninda.dagger2example.car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    private val driver:Driver,
    private val engine: Engine,
    private val wheels: Wheels
) {

    companion object {
        const val TAG = "CAR"
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d(TAG, "$driver drives $this")
    }

}