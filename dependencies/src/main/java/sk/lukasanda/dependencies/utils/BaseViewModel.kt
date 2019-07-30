package sk.lukasanda.dependencies.utils

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseViewModel : ViewModel() {
    private val disposable = CompositeDisposable()

    inline fun launch(function: () -> Disposable) {
        function()
    }

    override fun onCleared() {
        disposable.clear()
        super.onCleared()
    }
}