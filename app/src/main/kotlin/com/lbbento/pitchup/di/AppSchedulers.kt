package com.lbbento.pitchup.di

import rx.Scheduler
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import javax.inject.Inject

@ForApplication
open class AppSchedulers @Inject constructor() {

    open fun io(): Scheduler {
        return Schedulers.io()
    }

    open fun ui(): Scheduler {
        return AndroidSchedulers.mainThread()
    }
}