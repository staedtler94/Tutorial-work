package inheritance_concepts;

public class ProductSKU {
    ProductSKU(){
        this.setProductId("");
        this.setProductCatalogueId("");
        this.setProductName("");
    }

    ProductSKU(String id, String catlogueId, String name){
        this.setProductId(id);
        this.setProductCatalogueId(catlogueId);
        this.setProductName(name);
    }

    private String productId;
    protected String productCatalogueId;
    public String productName;

    public String getProductCatalogueId() {
        return productCatalogueId;
    }

    private void setProductCatalogueId(String productCatalogueId) {
        this.productCatalogueId = productCatalogueId;
    }

    public String getProductName() {
        return productName;
    }

    private void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    private void setProductId(String productId) {
        this.productId = productId;
    }

    public void moreInformation(){
        System.out.println("Product SKU ==> Base Class");
        System.out.println("Product Id which is private accessed in this class:" + this.productId);

        System.out.println("Product Catalogue Id which is protected in this class:" + this.productCatalogueId);
    }

    protected String buildUniqueSKUID(){
        return productId + productCatalogueId;
    }
}
