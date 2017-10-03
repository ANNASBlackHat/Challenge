package id.co.gitsolution.androidchallege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import id.co.gitsolution.androidchallege.model.Help;
import id.co.gitsolution.androidchallege.model.News;

/**
 * Created by Git Solution on 03/10/2017.
 */

public class Constant {
    public static List<News> getNews(){
        return new ArrayList<News>(Arrays.asList(
                new News("Content 1"),
                new News("Content 2"),
                new News("Content 3"),
                new News("Content 4")
        ));
    }

    public static List<Help> getHelp(){
        return new ArrayList<>(Arrays.asList(
                new Help("Bagai mana cara nya untuk move on?", "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form", "23 Sept 2017","189 Viewers"),
                new Help("Bagai mana cara nya untuk move on?", "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form", "23 Sept 2017","189 Viewers"),
                new Help("Bagai mana cara nya untuk move on?", "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form", "23 Sept 2017","189 Viewers"),
                new Help("Bagai mana cara nya untuk move on?", "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form", "23 Sept 2017","189 Viewers"),
                new Help("Bagai mana cara nya untuk move on?", "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form", "23 Sept 2017","189 Viewers")
        ));
    }
}
