package pregunta4;

import java.util.ArrayList;
import java.util.List;

public class Notification {
    private List<RefIEEE> refs = new ArrayList<>();

    public void addRefIEEE(String[] ref) {
        refs.add(new RefIEEE(ref));
    }

    public boolean tieneRefs() {
        return !refs.isEmpty();
    }
    
    public List<RefIEEE> getRefs() {
        return refs;
    }

    public void setRefs(List<RefIEEE> refs) {
        this.refs = refs;
    }
}