package binhntph28014.fpoly.du_an_mauph28014.LOPADAPTER;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import binhntph28014.fpoly.du_an_mauph28014.LOPPRODUCT.Top;
import binhntph28014.fpoly.du_an_mauph28014.QuanlyvsThongke.Thongketop10.Thongketo10Fragment;
import binhntph28014.fpoly.du_an_mauph28014.R;

public class Top10_Adapter extends ArrayAdapter<Top> {
    Context context;
    Thongketo10Fragment fragment;
    ArrayList<Top> list;

    public Top10_Adapter(@NonNull @NotNull Context context, Thongketo10Fragment fragment, ArrayList<Top> list) {
        super(context, 0, list);
        this.context = context;
        this.fragment = fragment;
        this.list = list;
    }

    TextView tv_tenstk, tv_sltk;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.custom_list_thongke, null);
        }
        Top top = list.get(position);
        if (top != null) {
            tv_tenstk = view.findViewById(R.id.tv_tensachtk);
            tv_tenstk.setText("Sách: " + top.tensach);
            tv_sltk = view.findViewById(R.id.tv_slouongtk);
            tv_sltk.setText("Số Lượng " + top.soluong);
        }

        return view;
    }
}
