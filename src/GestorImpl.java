import java.util.*;

public class GestorImpl implements Gestor {

    List<Product> products;
    Queue<Order> orders;
    HashMap<String, User> users;

    public GestorImpl(){
        this.users = new HashMap<String, User>();
        this.products = new ArrayList<Product>();
        //this.orders = new LaMevaCua<Order>(15);
        this.orders = new LinkedList<>();
    }

    @Override
    public void addUser(String idUser, String name) {
        this.users.put(idUser, new User(idUser, name));

        // Excepcions!!!!! ----->NullPointerException

    }

    public User getUser(String idUser){
        User user = this.users.get(idUser);
        return user;
    }

    @Override
    public void addProduct(String name, String description, double price) {
        this.products.add(new Product(name, description, price));

    }

    @Override
    public List<Product> productsByPrice() {
        Collections.sort(this.products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o2.getPrice()-o1.getPrice());
            }
        });
        return this.products;
    }
    /**
     * Order:
     *   - 3 cafe amb llet
     *   - 1 donut
     *   - 1 xoco
     *   user: "Toni" // nif ...
     */

    @Override
    public void addOrder(Order o) {
        this.orders.add(o);

    }

    @Override
    public Order getOrder() {
        Order o =this.orders.poll();
        process(o);
         //
        //User user = o.getUser();
        //user.addOrder(o);
        return null;
    }

    private void process(Order o) {
        int q;
/*
        for (Item i: o.items()){
            q = i.q;
            product = i.p;

            product.numVendes(q);
        }

 */
    }

    @Override
    public List<Order> ordersbyuser(String idUser) {

        return null;
    }

    @Override
    public List<Product> productsbysales() {
        Collections.sort(this.products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (o2.getNumVendes()-o1.getNumVendes());
            }
        });
        return this.products;

    }

    public static void main(String[] args){
        Gestor g = new GestorImpl();
        g.addUser("23844651E","Marc");

        User u = g.getUser("23844651E");

        System.out.println(u.getName());

        g.addProduct("cafe", "cafe solo",1.2);
        g.addProduct("bocata pernil", "bocata pernil amb tomaquet",4);
        g.addProduct("bocata formatge", "bocata formatge amb tomaquet",3);
        g.addProduct("donut", "donut normal",0.5);
        g.addProduct("bocata lomo queso", "bocata de lomo con queso",5);

        List<Product> llista = g.productsByPrice();

        for (Product p: llista){
            System.out.println(p);
        }



    }
}
