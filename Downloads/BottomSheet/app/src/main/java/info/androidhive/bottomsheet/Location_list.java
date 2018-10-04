package info.androidhive.bottomsheet;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;

public class Location_list extends ArrayAdapter<Locationu> {

    private Activity context;
    private List<Locationu> locationList;

    public Location_list(Activity context, List<Locationu> appliancesList){

        super(context, R.layout.list,appliancesList);
        this.context = context;
        this.locationList = appliancesList;
    }
//    public Location_list(@NonNull Context context, int resource) {
//        super(context, resource);
//    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater ();
        View listViewItem = inflater.inflate (R.layout.list,null,true);
        TextView textViewBus = (TextView) listViewItem.findViewById (R.id.bus_text);

        TextView textViewVehicle = (TextView) listViewItem.findViewById(R.id.vehicle_text);

        Button button = (Button) listViewItem.findViewById(R.id.buttonNotification);

        Locationu locationu = locationList.get(position);
        textViewBus.setText(locationu.getLoca());
        textViewVehicle.setText(locationu.getNum());
        return listViewItem;

    }
}
