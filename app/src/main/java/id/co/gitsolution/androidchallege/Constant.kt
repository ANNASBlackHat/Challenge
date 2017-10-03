package id.co.gitsolution.androidchallege

import id.co.gitsolution.androidchallege.model.Help
import id.co.gitsolution.androidchallege.model.News

/**
 * Created by Git Solution on 03/10/2017.
 */

object Constant {
    fun getNews(): List<News>{
        return listOf(
                News("My first experience with this was a year ago, trying to set more than 10 different fonts to the Android App I was developing at that moment"),
                News("My first experience with this was a year ago, trying to set more than 10 different fonts to the Android App I was developing at that moment"),
                News("My first experience with this was a year ago, trying to set more than 10 different fonts to the Android App I was developing at that moment"),
                News("My first experience with this was a year ago, trying to set more than 10 different fonts to the Android App I was developing at that moment"),
                News("My first experience with this was a year ago, trying to set more than 10 different fonts to the Android App I was developing at that moment")
        )
    }

    fun getHelp(): List<Help>{
        return listOf(
                Help("Bagai mana cara nya untuk move on?", "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form", "23 Sept 2017", "189 Viewers"),
                Help("Bagai mana cara nya untuk move on?", "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form", "23 Sept 2017", "189 Viewers"),
                Help("Bagai mana cara nya untuk move on?", "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form", "23 Sept 2017", "189 Viewers"),
                Help("Bagai mana cara nya untuk move on?", "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form", "23 Sept 2017", "189 Viewers")
        )
    }
}
