package com.example.holo_android.UI.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.holo_android.Data.MenuData
import com.example.holo_android.R
import com.example.holo_android.UI.Adapter.MenuItemRecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var menuItemRecyclerViewAdapter: MenuItemRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dataList:ArrayList<MenuData> = ArrayList()
        dataList.add(MenuData(
            1,
            "https://www.lark.com/wp-content/uploads/2019/11/jason-briscoe-7MAjXGUmaPw-unsplash.jpg"))
        dataList.add(MenuData(
            2,
            "https://www.lark.com/wp-content/uploads/2019/11/jason-briscoe-7MAjXGUmaPw-unsplash.jpg"))
        dataList.add(MenuData(
            3,
            "https://www.lark.com/wp-content/uploads/2019/11/jason-briscoe-7MAjXGUmaPw-unsplash.jpg"))

        menuItemRecyclerViewAdapter = MenuItemRecyclerViewAdapter(this, dataList)
        rv_menu_overview.adapter = menuItemRecyclerViewAdapter
        rv_menu_overview.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
    }
}
