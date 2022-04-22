package br.edu.ifsp.scl.ads.pdm.requestapi3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val TAG = "TESTE"

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer {
            Log.d(TAG, it.id)
            Log.d(TAG, it.accountId)
            Log.d(TAG, it.name)
            Log.d(TAG, it.puuid)
        })

        /*viewModel.getPost()
        viewModel.myResponse.observe(this, Observer {
            Log.d(TAG, it.body)
            Log.d(TAG, it.title)
            Log.d(TAG, it.id.toString())
            Log.d(TAG, it.userId.toString())
        })*/

        /*viewModel.getPosts()
        viewModel.myResponseList.observe(this, Observer {
            for (user in it) {
                Log.d(TAG, user.body)
                Log.d(TAG, user.title)
                Log.d(TAG, user.id.toString())
                Log.d(TAG, user.userId.toString())
            }
        })*/
    }
}