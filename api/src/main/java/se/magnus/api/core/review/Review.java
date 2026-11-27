package se.magnus.api.core.review;

@JsonCreator
public Review(
        @JsonProperty("productId") int productId,
        @JsonProperty("reviewId") int reviewId,
        @JsonProperty("author") String author,
        @JsonProperty("subject") String subject,
        @JsonProperty("content") String content,
        @JsonProperty("serviceAddress") String serviceAddress) {

  this.productId = productId;
  this.reviewId = reviewId;
  this.author = author;
  this.subject = subject;
  this.content = content;
  this.serviceAddress = serviceAddress;
}
  public Review() {
    productId = 0;
    reviewId = 0;
    author = null;
    subject = null;
    content = null;
    serviceAddress = null;
  }

  public Review(
    int productId,
    int reviewId,
    String author,
    String subject,
    String content,
    String serviceAddress) {

    this.productId = productId;
    this.reviewId = reviewId;
    this.author = author;
    this.subject = subject;
    this.content = content;
    this.serviceAddress = serviceAddress;
  }

  public int getProductId() {
    return productId;
  }

  public int getReviewId() {
    return reviewId;
  }

  public String getAuthor() {
    return author;
  }

  public String getSubject() {
    return subject;
  }

  public String getContent() {
    return content;
  }

  public String getServiceAddress() {
    return serviceAddress;
  }
}
