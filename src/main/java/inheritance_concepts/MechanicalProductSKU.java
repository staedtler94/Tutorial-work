package inheritance_concepts;

public class MechanicalProductSKU extends ProductSKU {
    MechanicalProductSKU(){
        super();
        this.setProductFriction("");
    }

    MechanicalProductSKU(
            String id,
            String catlogueId,
            String name,
            String friction){
        super(id, catlogueId, name);
        setProductFriction(friction);
    }

    @Override
    public void moreInformation(){
        // super.setProductID // cannot set this since its private to the base class
    }

    public String mechanicalSKUSegregationID(){
        return super.buildUniqueSKUID() + productFriction; // can get protected function not private
    }

    public String getProductFriction() {
        return productFriction;
    }

    public void setProductFriction(String productFriction) {
        this.productFriction = productFriction;
    }
    private String productFriction;
}
