package com.darkshan.mymovcat3.ui.main


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.darkshan.mymovcat3.Adapter.MovieAdapter

import com.darkshan.mymovcat3.R
import com.darkshan.mymovcat3.model.Movie
import kotlinx.android.synthetic.main.fragment_movie.*

/**
 * A simple [Fragment] subclass.
 */
class MovieFragment : Fragment() {
    private lateinit var dataname: Array<String>
    private lateinit var dataphoto: Array<String>
    private lateinit var dataRate: Array<String>
    private lateinit var dataDesc: Array<String>
    private lateinit var adapter: MovieAdapter
    private val list = ArrayList<Movie>()
    private lateinit var gridLayoutManager: GridLayoutManager 
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment

        val root = inflater.inflate(R.layout.fragment_movie, container, false)
        val rv: RecyclerView = root.findViewById(R.id.rv_list)
        list.addAll(loadData())
        adapter = MovieAdapter(context,list)
        gridLayoutManager= GridLayoutManager(context, 2)
        adapter.notifyDataSetChanged()
        rv.setHasFixedSize(true)
        rv.apply {
            layoutManager = gridLayoutManager
            adapter = adapter
        }
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    fun loadData(): ArrayList<Movie> {

        dataname = resources.getStringArray(R.array.data_name)
        dataphoto = resources.getStringArray(R.array.data_photo)
        dataRate = resources.getStringArray(R.array.dataRate)
        dataDesc = resources.getStringArray(R.array.data_desc)
        val listMovie = ArrayList<Movie>()
        for (position in dataname.indices) {
            val movies = Movie(
                dataphoto[position],
                dataname[position],
                dataRate[position],
                dataDesc[position]
            )
            listMovie.add(movies)
        }
        return listMovie
    }

}
