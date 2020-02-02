package creationalpattern.builderdesignpattern;

public class ExtraLargeCheesePizza extends VegPizza{  
    @Override  
    public float price() {  
        return 300.f;  
    }  
    @Override  
    public String name() {  
        return  "Cheeze Pizza";  
    }  
    @Override  
    public String size() {  
        return "Extra-Large Size";  
    }  
}
