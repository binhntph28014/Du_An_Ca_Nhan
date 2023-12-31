package binhntph28014.fpoly.du_an_mauph28014.SPINERADAPTER;

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

import binhntph28014.fpoly.du_an_mauph28014.LOPPRODUCT.ThanhVien;
import binhntph28014.fpoly.du_an_mauph28014.R;

public class ThanhVienSpiner extends ArrayAdapter<ThanhVien> {
    Context context;
    ArrayList<ThanhVien> list;
    TextView tv_spinertv;

    public ThanhVienSpiner(Context context, ArrayList<ThanhVien> list) {
        super(context, 0, list);
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.custom_spiner_thanhvien, null);
        }
        ThanhVien thanhVien = list.get(position);
        if (thanhVien != null) {
            tv_spinertv = view.findViewById(R.id.tv_spiner_thanhvien);
            tv_spinertv.setText(thanhVien.getHoTenTV());
        }
        return view;
    }

    @Override
    public View getDropDownView(int position, @Nullable @org.jetbrains.annotations.Nullable View convertView, @NonNull @NotNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.custom_spiner_thanhvien, null);
        }
        ThanhVien thanhVien = list.get(position);
        if (thanhVien != null) {
            tv_spinertv = view.findViewById(R.id.tv_spiner_thanhvien);
            tv_spinertv.setText(thanhVien.getHoTenTV());
        }
        return view;
    }
}
