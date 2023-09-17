package harish.projects.greenharbour;

public class CustomUserData {
    String Likemost, Suggestions, Featuresadded, Lastcomments;

    public CustomUserData(String likemost, String suggestions, String featuresadded, String lastcomments) {
        Likemost = likemost;
        Suggestions = suggestions;
        Featuresadded = featuresadded;
        Lastcomments = lastcomments;
    }

    public String getLikemost() {
        return Likemost;
    }

    public void setLikemost(String likemost) {
        Likemost = likemost;
    }

    public String getSuggestions() {
        return Suggestions;
    }

    public void setSuggestions(String suggestions) {
        Suggestions = suggestions;
    }

    public String getFeaturesadded() {
        return Featuresadded;
    }

    public void setFeaturesadded(String featuresadded) {
        Featuresadded = featuresadded;
    }

    public String getLastcomments() {
        return Lastcomments;
    }

    public void setLastcomments(String lastcomments) {
        Lastcomments = lastcomments;
    }

    public String toString()
    {
        return "CustomUserData{" +
                "Like= '" + Likemost + '\'' +
                "Suggestions= '" + Suggestions + '\'' +
                "Features= '" + Featuresadded + '\'' +
                "Comments= '" + Lastcomments + '\'' +
                '}';



    }
}
