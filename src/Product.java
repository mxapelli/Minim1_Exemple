public class Product {



    private String name, description;
    private double price;
    private int numVendes;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.numVendes = 0;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumVendes() {
        return numVendes;
    }

    public void setNumVendes(int numVendes) {
        this.numVendes = numVendes;
    }

    @Override
    public String toString() {
        return  name + ' ' + description + ' ' +  price;
    }
}
