import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PageDAO {


    public String queryPageContent(String name, String loc) throws ClassNotFoundException, SQLException {
        

        
        
        //String GET_PAGE_LOC_CONTENT_SQL = "SELECT content FROM page WHERE pageName='"+page.getPageName()+"' AND pageLoc = '"+page.getPageLoc()+"'";

        String resStr = "";
        //ArrayList<Page> pages = new ArrayList<>();
        
        Class.forName("org.mariadb.jdbc.Driver");
        //Class.forName("com.mysql.cj.jdbc.Driver");
        
        String content;
        // Step 2:Create a statement using connection object
        /**
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT content FROM page WHERE pageName=? AND pageLoc=? ");
        preparedStatement.setString(1, page.getPageName());
        preparedStatement.setString(2, page.getPageLoc());
        ResultSet result = preparedStatement.executeQuery();
        resStr = result.;
        return resStr;
         **/
        try (Connection connection = DriverManager
                .getConnection("jdbc:mariadb://localhost:3306/matthewsb_cms?user=matthewsb_usr&password=)KVWWw6i9ULZ")) {
            // Step 2:Create a statement using connection object
            /**
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT content FROM page WHERE pageName=? AND pageLoc=? ");
            preparedStatement.setString(1, page.getPageName());
            preparedStatement.setString(2, page.getPageLoc());
            ResultSet result = preparedStatement.executeQuery();
            resStr = result.;
            return resStr;
             **/
            content = "";
            String query = "SELECT pagecontent FROM pagetable WHERE pagename = \""+name+"\" AND pageloc = \""+loc+"\" ";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                //preparedStatement.setString(1, page.getPageName());
                //preparedStatement.setString(2, page.getPageLoc());
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    //Page newpage = new Page();
                    //newpage.setPageName(page.getPageName());
                    //newpage.setPageLoc(page.getPageLoc());
                    content = rs.getString(1);
                    //newpage.setContent(content);
                    //pages.add(newpage);
                    //content = rs.getString("pagecontent");
                    //Logger.getLogger(PageDAO.class.getName()).log(Level.ALL, null, content);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
            connection.close();
        }
       return content; 
        
        /**
     Class.forName("com.mysql.jdbc.Driver");
     Connection conn = DriverManager.getConnection(
         "jdbc:mysql://localhost:3306/matthewsb_cms", "matthewsb_usr", ")KVWWw6i9ULZ");
     Statement stmt = conn.createStatement();
     ResultSet rs = stmt.executeQuery("");
     //ResultSet rs = stmt.executeQuery("SELECT ID, post_title, post_content, GROUP_CONCAT(pm.meta_key ORDER BY pm.meta_key DESC SEPARATOR '||') as meta_keys, GROUP_CONCAT(pm.meta_value ORDER BY pm.meta_key DESC SEPARATOR '#') as meta_values FROM wp_posts p LEFT JOIN wp_postmeta pm on pm.post_id = p.ID WHERE p.post_type = 'tsml_meeting' and p.post_status = 'publish' GROUP BY p.ID;");

     
     ResultSetMetaData resMetaData = rs.getMetaData();
     int nCols = resMetaData.getColumnCount();
     
     for (int kCol = 1; kCol <= nCols; kCol++) {
       //out.print("<td><b>" + resMetaData.getColumnName(kCol) + "</b></td>");
       }
    
     while (rs.next()) {
      
       for (int kCol = 1; kCol <= nCols; kCol++) {
         if(kCol!=nCols){
           // out.print("<td>" + rs.getString(kCol) + "</td>");
         } else {
            //out.print("<td>");
            String arStr[] = rs.getString(kCol).split("#");
            //out.print(arStr[1]+" , ");
            Pattern p = Pattern.compile("\"([^\"]*)\"");
            Matcher m = p.matcher(rs.getString(kCol));
            while (m.find()) {
             /// out.print(m.group(1) + " ");
            }         
            // out.print("</td>");
         }
       }

       } 
 
     conn.close();        
        **/
       
        
    }
}
