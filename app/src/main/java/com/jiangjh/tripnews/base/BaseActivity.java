package com.jiangjh.tripnews.base;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jinghao.Jiang.
 */

public abstract class BaseActivity<VB extends ViewDataBinding>
    extends AppCompatActivity{
    protected VB binding;
}
