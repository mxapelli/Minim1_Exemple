import java.util.List;

public interface Gestor {
    //
    public void addUser(String idUser, String name);
    public User getUser(String idUser);
    public void addProduct(String name, String description, double price);
    public List<Product> productsByPrice();
    public void addOrder(Order o);
    public Order getOrder();
    public List<Order> ordersbyuser(String idUser);
    public List<Product> productsbysales();

}
