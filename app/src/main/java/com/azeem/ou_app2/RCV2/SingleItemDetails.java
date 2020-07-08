package com.azeem.ou_app2.RCV2;

import org.parceler.Parcel;

@Parcel
public class SingleItemDetails implements Comparable<SingleItemDetails> {

    String title;
    String urlForDownload;

    public SingleItemDetails() {
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setUrlForDownload(String urlForDownload) {
        this.urlForDownload = urlForDownload;
    }


    public String getTitle() {
        return title;
    }


    public String getUrlForDownload() {
        return urlForDownload;
    }

    public SingleItemDetails(String title,String urlForDownload) {
        this.title = title;
        this.urlForDownload = urlForDownload;
    }

    @Override
    public String toString() {
        return "SingleItemDetails{" +
                "title='" + title + '\'' +
                ", urlForDownload='" + urlForDownload + '\'' +
                '}';
    }

    @Override
    public int compareTo(SingleItemDetails o) {
        if(o == null) {
            return 1;
        } else if(title == null) {
            return 0;
        } else {
            return title.compareTo(o.title);
        }
    }
}
