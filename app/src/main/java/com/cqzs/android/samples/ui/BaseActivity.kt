package com.cqzs.android.samples.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 *
 * @Author: GaiQS
 * @E-mail: gaiqs@sina.com
 * @Creation Date: 2021-03-31
 * @Time: 16:28
 * @Modified Date: 2021-03-31
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayoutId())
        initView()
        initData()
    }

    protected abstract fun setLayoutId(): Int
    protected abstract fun initView()
    protected abstract fun initData()
}