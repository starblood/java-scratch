package ide_demo.intellij14.code_completion;

/**
 * Created by john.shim on 14. 12. 2..
 */
public class ConstantsCompletionDemo {

    public static final int S_THIS_IS_NOT_RELATED = 11111;
    public static final int S_THIS_IS_NOT_RELATED_NEITHER = 222;
    public static final int SELECTION_MULTIPLE = 1;
    public static final int SELECTION_SINGLE = 3;


    class Model {
        private int selection;

        public int getSelection() {
            return selection;
        }

        public void setSelection(int selection) {
            this.selection = selection;
        }
    }

    public void test() {
        Model model = new Model();
        // type 'S' suggest most related constants to above in drop down list
        model.setSelection(SELECTION_MULTIPLE);
    }
}
