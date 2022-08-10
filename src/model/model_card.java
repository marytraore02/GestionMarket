
package model;

import javax.swing.Icon;

public class model_card {
    
    Icon icon;
    String title;
    String value;

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
     
    public model_card(){
        
    }
    public model_card(Icon icon, String title, String  value){
        this.icon=icon;
        this.title=title;
        this.value=value;
    }
  
}
