package br.edu.ifsp.scl.ads.pdm.requestapi3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.edu.ifsp.scl.ads.pdm.apirequest3.network.User
import br.edu.ifsp.scl.ads.pdm.apirequest3.network.UserNetwork
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {

    val myResponse: MutableLiveData<User> = MutableLiveData()
    val myResponseList: MutableLiveData<List<User>> = MutableLiveData()

    fun getPost() {
        viewModelScope.launch {
            myResponse.value = UserNetwork.retrofit.getPost()
        }
    }

    fun getPosts() {
        viewModelScope.launch {
            myResponseList.value = UserNetwork.retrofit.getPosts()
        }
    }
}