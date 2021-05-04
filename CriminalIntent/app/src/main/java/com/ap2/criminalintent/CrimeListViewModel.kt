package com.ap2.criminalintent

import androidx.lifecycle.ViewModel

class CrimeListViewModel: ViewModel() {

    /*var crimes = mutableListOf<Crime>()

    init {
        for (i in 0 until 100) {
            val crime = Crime()
            crime.title = "Crime #${i+1}"
            crime.isSolved = i % 2 == 0
            crime.requirePolice = !crime.isSolved
            //crimes.add(crime)
            crimes.plusAssign(crime)
        }
    }*/

    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes() //val crimes = crimeRepository.getCrimes()
}