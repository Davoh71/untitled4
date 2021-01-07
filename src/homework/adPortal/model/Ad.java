package homework.adPortal.model;

import java.util.Date;


public class Ad {

    private String title;
    private String text;
    private double prace;
    private Date date;
    private Category category;
    private User user;

    public Ad(String title, String text, double prace, Date date, Category category, User user) {
        this.title = title;
        this.text = text;
        this.prace = prace;
        this.date = date;
        this.category = category;
        this.user = user;
    }

    public Ad() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getPrace() {
        return prace;
    }

    public void setPrace(double prace) {
        this.prace = prace;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ad ad = (Ad) o;

        if (Double.compare(ad.prace, prace) != 0) return false;
        if (title != null ? !title.equals(ad.title) : ad.title != null) return false;
        if (text != null ? !text.equals(ad.text) : ad.text != null) return false;
        if (date != null ? !date.equals(ad.date) : ad.date != null) return false;
        if (category != ad.category) return false;
        return user != null ? user.equals(ad.user) : ad.user == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title != null ? title.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        temp = Double.doubleToLongBits(prace);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", prace=" + prace +
                ", date=" + date +
                ", category=" + category +
                ", user=" + user +
                '}';
    }
}
