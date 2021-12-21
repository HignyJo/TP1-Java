import java.util.concurrent.Callable;

public class ActivityControler implements Callable {

    private ActivityVue vue;
    private ListActivityType list;

    public Object call(){

    String name = vue.getName();
    list.getActivityType(name);

    String registrationRequired = vue.isValide();
    boolean isVal = false;
    if(registrationRequired.equals("o")){
        isVal = true;
    }

    if(list.getActivityType(name) != null){
        new ActivityType(name,isVal);
        ActivityVue.affichageActivityTypeCree();
    }else{
        ActivityVue.affichageActivityTypeError();
    }



    return null;
    }

    public void setVue(ActivityVue vue) {
    }

    public void setList(ListActivityType list) {
    }
}
