package com.maple.mockloading;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.maple.mocklibrary.dialog.v58.Loading58Dialog;

public class MainActivity extends AppCompatActivity {

    private Loading58Dialog mLoadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLoading();
               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {
                       hideLoading();
                   }
               },3000);
            }
        });
    }


    protected void showLoading() {
        if(mLoadingDialog == null){
            mLoadingDialog = new Loading58Dialog(this);
        }
        if(!mLoadingDialog.isShowing()){
            mLoadingDialog.show();
        }
    }

    protected void hideLoading() {
        if(mLoadingDialog != null && mLoadingDialog.isShowing()){
            mLoadingDialog.dismiss();
        }
    }
}
