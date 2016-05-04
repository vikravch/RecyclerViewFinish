package kistudio.com.recycler;

/**
 * Created by Android on 04.05.2016.
 */
public class Movie {
    private String mTitle;
    private String mGenre;
    private String mYear;

    public Movie() {
    }

    public Movie(String mTitle, String mGenre, String mYear) {
        this.mTitle = mTitle;
        this.mGenre = mGenre;
        this.mYear = mYear;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public String getmYear() {
        return mYear;
    }

    public void setmYear(String mYear) {
        this.mYear = mYear;
    }
}
