package lang.string_pool;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * User: starblood
 * Date: 2014. 2. 16.
 * Time: 오전 11:35
 *
 * Flyweight Design Pattern 을 설명해 주는 예제
 *
 * 참조
 * Enhancing Web Application Performance with Caching
 * By Neal Ford
 * 01 Jun 2004 | TheServerSide.com
 * http://www.theserverside.com/news/1364924/Enhancing-Web-Application-Performance-with-Caching
 */
public class FlyweightPatternExample {
    private ToyServlet servlet;

    public FlyweightPatternExample() {
        servlet = new ToyServlet();
    }

    /**
     * return a slice of the canonical list in product list
     * @param productReferences
     * @param start
     * @param recsPerPage
     * @return
     */
    public List<Product> getProductListSlice(List<Product> productReferences,
                                             int start, int recsPerPage) {
        if (start + recsPerPage > productReferences.size()) {
            return productReferences.subList(start,
                    productReferences.size());
        } else {
            return productReferences.subList(start,
                    start + recsPerPage);
        }
    }

    /**
     * sort type 에 따라서 주어진 product list 를 정렬한다.
     * @param productList
     * @param sortType
     */
    public void sortPagesForDisplay(List<Product> productList,
                                             String sortType) {
        if (sortType.equals("name")) {
            Collections.sort(productList, new NameComparator());
        } else if (sortType.equals("price")) {
            Collections.sort(productList, new PriceComparator());
        }
    }

    /*
        web application 에서 doPost() 와 유사한 기능을 하는 method,
        동시성 문제는 고려하지 않는다.
      */
    public void display(int start, int recsPerPage, String sortType) {
        List<Product> products = servlet.getProductList();
        List<Product> userProducts = getProductListSlice(products, start, recsPerPage);
        System.out.println(String.format("<product list start: %s, records per page: %s before sorting.>",
        String.valueOf(start), String.valueOf(recsPerPage)));

        for (Product product : userProducts) {
            System.out.println(product);
        }
        System.out.println("<product list after sorting sort by " + sortType +" >");
        sortPagesForDisplay(userProducts, sortType);
        for (Product product : userProducts) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        FlyweightPatternExample example = new FlyweightPatternExample();
        System.out.println("---- user1 display ----");
        example.display(1, 3, "name");

        System.out.println("\n\n---- user2 display ----");
        example.display(1, 3, "price");
    }
}

/*
    Servlet 을 의미하는 toy servlet
 */
class ToyServlet {
    List<Product> productList;

    public ToyServlet () {
        this.productList = new ArrayList<Product>();
        init();
    }

    private void init() {
        productList.add(new Product("Banana", 10));
        productList.add(new Product("Apple", 20));
        productList.add(new Product("Cheese", 50));
        productList.add(new Product("Water", 3));
        productList.add(new Product("Maldives Air Plane Ticket", 4000));
        productList.add(new Product("Mango", 34));
        productList.add(new Product("TV", 100));
        productList.add(new Product("Cake", 56));
        productList.add(new Product("iPhone", 900));
        productList.add(new Product("Macbook Pro", 1600));
        productList.add(new Product("Kindle Paper White", 170));
        productList.add(new Product("Galaxy S6", 840));
        productList.add(new Product("XBox 1", 600));
    }

    public List<Product> getProductList() {
        return this.productList;
    }
}

class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class NameComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}

class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}