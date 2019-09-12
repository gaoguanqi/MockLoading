package com.maple.mocklibrary.dialog.v58;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.maple.mocklibrary.R;
import com.maple.mocklibrary.base.BaseDialog;

public class Loading58Dialog extends BaseDialog {

    private String msg = "加载中...";
    private boolean isBackDismiss;

    private Loading58View loading58View;

    public Loading58Dialog(@NonNull Context context) {
        super(context, R.style.style_center_58dialog);
        initView(context);
    }

    private void initView(Context context) {
//        window?.setGravity(Gravity.CENTER)
//        //默认的Dialog只有5/6左右的宽度
//        window?.decorView?.setPadding(0, 0, 0, 0);
//        val lp = window?.attributes
//        //lp?.width = WindowManager.LayoutParams.MATCH_PARENT
//        lp?.width = (ScreenUtils.getScreenWidth() * 0.8).toInt()
//        //lp?.height = (ScreenUtils.getScreenHeight() * 0.4).toInt()
//        lp?.height = WindowManager.LayoutParams.WRAP_CONTENT
//        window?.attributes =lp

//        Window window = getWindow();
//        if(window != null){
//            window.setGravity(Gravity.CENTER);
//            WindowManager.LayoutParams attrbutes = window.getAttributes();
//            if(attrbutes != null){
//                attrbutes.height = ScreenUtils.getScreenHeight()
//            }
//        }
    }

    public Loading58Dialog(@NonNull Context context, String msg) {
        super(context, R.style.style_center_58dialog);
        this.msg = msg;
        initView(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_58loading);
        setCanceledOnTouchOutside(false);
        loading58View = this.findViewById(R.id.loadView);
        loading58View.setLoadingText(msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Loading58Dialog notCancel() {
        isBackDismiss = true;
        return this;
    }

    public void setNotCancel() {
        isBackDismiss = true;
    }

    @Override
    public void onBackPressed() {
        if (!isBackDismiss) super.onBackPressed();
    }

    @Override
    public void setOnDismissListener(@Nullable OnDismissListener listener) {
        super.setOnDismissListener(listener);
        if (loading58View != null) {
            loading58View.setVisibility(View.GONE);
        }
    }
}