package ide_demo.intellij14.debugger;

import ide_demo.intellij14.obj.Animal;
import ide_demo.intellij14.obj.Bar;
import ide_demo.intellij14.obj.Foo;
import ide_demo.intellij14.obj.Zoo;

/**
 * Created by john.shim on 14. 11. 27..
 */
public class ReferringObjectDemo {
    private Foo foo;

    public ReferringObjectDemo(Foo foo) {
        this.foo = foo;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("giraffe"); // debugger: Show Referring Objects
        Zoo zoo = new Zoo(animal);
        Bar bar = new Bar(zoo);
        Foo foo1 = new Foo(bar);
        ReferringObjectDemo referringObjectDemo = new ReferringObjectDemo(foo1);
        System.out.println(referringObjectDemo);
    }
}
