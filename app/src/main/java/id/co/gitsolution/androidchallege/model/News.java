package id.co.gitsolution.androidchallege.model;

/**
 * Created by Git Solution on 03/10/2017.
 */

public class News {
    private String content;
    private String imgUrl;

    public News(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
