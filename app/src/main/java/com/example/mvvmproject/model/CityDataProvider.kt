package com.example.mvvmproject.model

import com.example.mvvmproject.R

class CityDataProvider{

    private val cities = arrayListOf<City>()

    init {
        cities.add(City("Bangkok", R.drawable.bangkok, 100_705_090))
        cities.add(City("Beijing", R.drawable.beijing, 210_030_050))
        cities.add(City("London", R.drawable.london, 18_000_000))
        cities.add(City("New York", R.drawable.newyork, 9_600_000))
        cities.add(City("Paris", R.drawable.paris, 20_070_089))
        cities.add(City("Rio de Janeiro", R.drawable.rio, 30_000_910))
        cities.add(City("Rome", R.drawable.rome, 6_089_786))
        cities.add(City("Singapore", R.drawable.singapore, 7_867_903))
        cities.add(City("Sydney", R.drawable.sydney, 3_330_009))
        cities.add(City("Tokyo", R.drawable.tokyo, 35_908_087))
    }

    fun getCities() = cities
}
