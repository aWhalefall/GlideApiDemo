package dragger2.nuoyuan.com.glideapidemo.bean;

public class Post {
    private String title;
    private String subtitle;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Post(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

    @Override
    public String toString() {
        return title + subtitle;
    }
}