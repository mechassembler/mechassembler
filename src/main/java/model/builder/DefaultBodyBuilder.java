package model.builder;

import formsdialogs.setparamsofobjectdialog.SetParamsOfObjectDialog;
import java.util.LinkedList;

/**
 * Created on 12/16/14.
 *
 * @author Mike Sorokin
 */
public class DefaultBodyBuilder extends AbstractBodyBuilder {
    protected LinkedList<Param> changeableParams = new LinkedList<>();

    public DefaultBodyBuilder(String id) {
        super(id);
    }

    public DefaultBodyBuilder addChangeableParam(String name, float low, float hig) {
        changeableParams.add(new Param(name, low, hig));
        return this;
    }

    @Override
    public void change() {
        if(changeableParams.size() > 0) {
            new SetParamsOfObjectDialog(changeableParams, this);
        }
    }
}
