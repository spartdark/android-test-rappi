package com.vsm.myshows.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.vsm.myshows.R
import com.vsm.myshows.service.ItemPopular

/*
* @author Vladimir Saldivar
* vsaldivarm@gmail.com
*/

class PopularAdapter : RecyclerView.Adapter<PopularAdapter.ViewHolder>() {


    var superheros: List<ItemPopular> = ArrayList()
    lateinit var context: Context


    fun PopularAdapter(superheros: List<ItemPopular>, context: Context) {
        this.superheros = superheros
        this.context = context
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = superheros.get(position)
        holder.bind(item, context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_popular, parent, false))
    }

    override fun getItemCount(): Int {
        return superheros.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtViewPopularTittle = view.findViewById(R.id.txtViewPopularTittle) as TextView
        val txtViewPopularSubTittle1 = view.findViewById(R.id.txtViewPopularSubTittle1) as TextView
        val txtViewPopularSubTittle2 = view.findViewById(R.id.txtViewPopularSubTittle2) as TextView
        //val avatar = view.findViewById(R.id.ivAvatar) as ImageView

        fun bind(superhero: ItemPopular, context: Context) {
            txtViewPopularTittle.text = superhero.tittle
            txtViewPopularSubTittle1.text = superhero.subTittle
            txtViewPopularSubTittle2.text = superhero.subTittle2
            //avatar.loadUrl(superhero.photo)
            itemView.setOnClickListener(View.OnClickListener {
                Toast.makeText(
                    context,
                    superhero.tittle,
                    Toast.LENGTH_SHORT
                ).show()
            })
        }
        /*fun ImageView.loadUrl(url: String) {
            Picasso.with(context).load(url).into(this)
        }*/
    }

}