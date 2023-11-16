public class SocialMediaPost {
    private final String username;
    private final String postContent;
    private final int numLikes;
    private final int numComments;
    private final int numShares;

    public SocialMediaPost(String username, String postContent, int numLikes, int numComments, int numShares) {
        this.username = username;
        this.postContent = postContent;
        this.numLikes = numLikes;
        this.numComments = numComments;
        this.numShares = numShares;
    }

    public String getUsername() {
        return username;
    }

    public String getPostContent() {
        return postContent;
    }

    public int getNumLikes() {
        return numLikes;
    }

    public int getNumComments() {
        return numComments;
    }

    public int getNumShares() {
        return numShares;
    }
}
