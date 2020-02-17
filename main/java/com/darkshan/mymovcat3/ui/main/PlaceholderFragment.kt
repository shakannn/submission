package com.darkshan.mymovcat3.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.darkshan.mymovcat3.Adapter.MovieAdapter
import com.darkshan.mymovcat3.R
import com.darkshan.mymovcat3.model.Movie

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {

    private lateinit var dataname:Array<String>
    private lateinit var dataphoto:Array<String>
    private lateinit var dataRate:Array<String>
    private lateinit var dataDesc:Array<String>
    private lateinit var adapter:MovieAdapter
    private val list=ArrayList<Movie>()
    private val GridLayoutManager:GridLayoutManager= GridLayoutManager(context,2)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
         inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)
//        pageViewModel.text.observe(viewLifecycleOwner, Observer<String> {
//            textView.text = it
//        })
        return root
    }
    fun loadData(): ArrayList<Movie> {

        dataname=resources.getStringArray(R.array.data_name)
        dataphoto=resources.getStringArray(R.array.data_photo)
        dataRate=resources.getStringArray(R.array.dataRate)
        dataDesc=resources.getStringArray(R.array.data_desc)
        val listMovie=ArrayList<Movie>()
        for (position in dataname.indices){
            val movies= Movie(
                dataphoto[position],
                dataname[position],
                dataRate[position],
                dataDesc[position]
            )
            listMovie.add(movies)
        }
        return listMovie
    }
    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }
}