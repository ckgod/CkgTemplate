package com.ckg.ckgtemplate.fragment

import com.ckg.ckgtemplate.R
import com.ckg.ckgtemplate.base.BaseKotlinFragment
import com.ckg.ckgtemplate.databinding.FragmentMainBinding

class MainFragment() : BaseKotlinFragment<FragmentMainBinding>() {
    override val layoutResourceId: Int
        get() = R.layout.fragment_main

    override fun initStartView() {
        binding.btn.setOnClickListener {
            showProgress()
        }
    }

    override fun initDataBinding() {
    }

    override fun initAfterBinding() {
    }

    override fun reLoadUI() {
    }

    companion object {
        const val TAG = "MainFragment"
    }

}