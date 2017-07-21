package com.example.nikos.booklisting;

/**
 * {@link Book} represents a Google Book.
 * which consists of a title, authors and an infoLink url.
 */

public class Book {
    private String mTitle;
    private String mAuthors;
    private String mUrl;

    public Book(String title, String authors, String url) {
        mTitle = title;
        mAuthors = authors;
        mUrl = url;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getAuthors()
    {
        return mAuthors;
    }

    public String getUrl()
    {
        return mUrl;
    }
}
