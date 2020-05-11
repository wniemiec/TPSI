package wizut.tpsi;

public class BlogPost
{
    Long id;
    String title;
    String content;


    BlogPost()
    {

    }

    public BlogPost(Long id, String title, String content)
    {
        this.id = id;
        this.title = title;
        this.content = content;
    }


    public void setContent(String content) {
        this.content = content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }


    public String getTitle() {
        return title;
    }

}
