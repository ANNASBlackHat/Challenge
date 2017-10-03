package id.co.gitsolution.androidchallege.global

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.co.gitsolution.androidchallege.BR

/**
 * Created by Git Solution on 03/10/2017.
 */
abstract class GlobalAdapter(@field:LayoutRes private val layoutId: Int, private val listData: List<*>?): RecyclerView.Adapter<GlobalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): GlobalViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(layoutId, parent, false)
        return GlobalViewHolder(view)
    }

    override fun onBindViewHolder(holder: GlobalViewHolder?, position: Int) {
        listData?.apply { holder?.onBind(BR.model, listData[position]) }
    }

    override fun getItemCount() = listData?.size ?: 0
}

class GlobalViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    val binding: ViewDataBinding = DataBindingUtil.bind(itemView)

    fun onBind(variable: Int, value: Any?){
        binding.setVariable(variable, value)
        binding.executePendingBindings()
    }

    fun getView() = binding.root
}