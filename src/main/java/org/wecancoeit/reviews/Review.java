package org.wecancoeit.reviews;

import javax.persistence.Lob;

public class Review {

    private Long id;
    private String title;
    private String imageUrl;
    private String imageFlipUrl;
    private String reviewCategory;
    @Lob
    private String reviewContent;


    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public String getImageFlipUrl(){
        return imageFlipUrl;
    }

    public String getReviewCategory(){
        return reviewCategory;
    }

    public String getReviewContent(){
        return reviewContent;
    }


    public Review(long id, String title, String imageUrl, String imageFlipUrl, String reviewCategory, String reviewContent){
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.imageFlipUrl = imageFlipUrl;
        this.reviewCategory = reviewCategory;
        this.reviewContent = reviewContent;
    }


}
