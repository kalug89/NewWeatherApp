package com.dkaluzny.newweatherapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dkaluzny.newweatherapp.R
import com.dkaluzny.newweatherapp.ui.dashboard.DashboardFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.root, DashboardFragment()
            ).commit()
        }
    }
}


/*
Zadanie polega na stworzeniu prostej aplikacji do sprawdzania prognozy pogody z wykorzystaniem darmowej usługi np.
http://apidev.accuweather.com/developers/ lub http://openweathermap.org/api lub dowolnej innej, wybranej przez kandydata, która udostępnia publiczne API.

Wymagania funkcjonalne:
● na pierwszym widoku można podać miasto dla którego chce się wyszukać prognozę pogody (google places API, SDK Android (validacja miasta))
● po pobraniu prognozy pogody dla podanego miasta ma nastąpić nawigacja do nowego widoku ze szczegółami prognozy,
● ilość szczegółów prognozy pogody na ekranie szczegółowym jest dowolna. Może być np. temperatura aktualna, stan zachmurzenia, możliwość opadów, tabelka z temperaturami na najbliższe godziny itd. w zależności co uda się pobrać z usługi,
● kolor czcionki temperatury ma różnić się w zależności od stopni -> poniżej 10 stopni kolor niebieski, między 10 a 20 stopni kolor czarny, powyżej 20 kolor czerwony.
Notatki.
- Do pobierania API - retrofit
 */

/*Notatki:
https://csform.com/product/matta-material-ui-kit/
https://lh3.googleusercontent.com/N2wLODwPww0RRlNQqvrmAS0pN4B64Dwai5_1txGAnEtvnhi2qyASsbsiNKbv-cIuWQ
 */