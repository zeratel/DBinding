package vm;

import android.databinding.Bindable;

import kale.db.BR;
import kale.dbinding.BaseViewModel;
/** Generated code from DBinding. Do not modify! */
public class EventViewModel extends BaseViewModel<EventViewModel> {

    private android.view.View.OnClickListener onClick;
    public void setOnClick(android.view.View.OnClickListener onClick) {
        this.onClick = onClick;
        notifyPropertyChanged(BR.onClick);
    }
    @Bindable public android.view.View.OnClickListener getOnClick() {return this.onClick;}}