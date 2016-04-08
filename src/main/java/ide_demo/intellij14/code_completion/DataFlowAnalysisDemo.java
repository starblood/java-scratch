package ide_demo.intellij14.code_completion;

/**
 * Created by john.shim on 14. 12. 1..
 */
public class DataFlowAnalysisDemo {
    class Bird {
        public String getColor() {
            return "black";
        }
    }

    class Hawk extends Bird {
        @Override
        public String getColor() {
            return super.getColor();
        }
        public Eagle getNeighbor() {
            return new Eagle();
        }
    }

    class Sparrow extends Bird {
        @Override
        public String getColor() {
            return super.getColor();
        }
    }

    class Eagle extends Bird {
        @Override
        public String getColor() {
            return super.getColor();
        }
    }

    class Zoo{
        public Bird getBird(String name) {
            return new Hawk();
        }
    }

    public void test (String name) {
        Zoo zoo = new Zoo();
        Bird bird = zoo.getBird(name);
        // just typing bird. then automatic type casting done by data flow analysis
        Eagle eagle = bird instanceof Hawk ? ((Hawk) bird).getNeighbor() : null;
    }
}

