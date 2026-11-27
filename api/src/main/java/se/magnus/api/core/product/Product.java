package se.magnus.api.core.product;

@JsonCreator
public Product(
        @JsonProperty("productId") int productId,
        @JsonProperty("name") String name,
        @JsonProperty("weight") int weight,
        @JsonProperty("serviceAddress") String serviceAddress) {
  this.productId = productId;
  this.name = name;
  this.weight = weight;
  this.serviceAddress = serviceAddress;
}
  public Product() {
    productId = 0;
    name = null;
    weight = 0;
    serviceAddress = null;
  }

  public Product(int productId, String name, int weight, String serviceAddress) {
    this.productId = productId;
    this.name = name;
    this.weight = weight;
    this.serviceAddress = serviceAddress;
  }

  public int getProductId() {
    return productId;
  }

  public String getName() {
    return name;
  }

  public int getWeight() {
    return weight;
  }

  public String getServiceAddress() {
    return serviceAddress;
  }
}
