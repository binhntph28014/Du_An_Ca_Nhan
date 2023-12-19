package binhntph28014.fpoly.du_an_mauph28014.QuanlyvsThongke.Quanlithanhvien;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import binhntph28014.fpoly.du_an_mauph28014.LOPDAO.ThanhVienDao;
import binhntph28014.fpoly.du_an_mauph28014.LOPPRODUCT.ThanhVien;

public class ThanhvienViewModel extends AndroidViewModel {
    ThanhVienDao vienDao;
    MutableLiveData<List<ThanhVien>> liveData;

    public ThanhvienViewModel(@NonNull @NotNull Application application) {
        super(application);
        liveData = new MutableLiveData<>();
        vienDao = new ThanhVienDao(application);
    }

    public MutableLiveData<List<ThanhVien>> getLiveData() {
        loaddl();
        return liveData;
    }

    public void loaddl() {
        List<ThanhVien> list = new ArrayList<>();
        list = vienDao.GETTV();
        liveData.setValue(list);
    }
}