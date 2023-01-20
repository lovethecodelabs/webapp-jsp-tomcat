import java.io.Serializable;

/**
 * JavaBean class used in jsp action tags.
 * @author Ramesh Fadatare
 */
public class Page implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String pageName;
    private String pageLoc;
    private String content;
    
    public String getPageName() {
        return pageName;
    }
    public void setPageName(String firstName) {
        this.pageName = pageName;
    }
    public String getPageLoc() {
        return pageLoc;
    }
    public void setPageLoc(String pageLoc) {
        this.pageLoc = pageLoc;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}