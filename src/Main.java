public class Main {

    public static void main(String[] args) {

    ActivityControler ctrl = new ActivityControler();
    ListActivityType list = new ListActivityType();
    ActivityVue vue = new ActivityVue();

    ctrl.setList(list);
    ctrl.setVue(vue);

    ctrl.call();

    }
}
