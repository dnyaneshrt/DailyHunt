package com.itp.dailyhunt;

import java.util.List;

public class News {
    int totalResults;

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<Article> getArtciles() {
        return artciles;
    }

    public void setArtciles(List<Article> artciles) {
        this.artciles = artciles;
    }

    List<Article> artciles;
}
