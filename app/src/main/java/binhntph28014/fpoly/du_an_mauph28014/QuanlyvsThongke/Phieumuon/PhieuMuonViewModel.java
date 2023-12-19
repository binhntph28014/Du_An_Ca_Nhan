package binhntph28014.fpoly.du_an_mauph28014.QuanlyvsThongke.Phieumuon;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import binhntph28014.fpoly.du_an_mauph28014.LOPDAO.PhieuMuonDao;
import binhntph28014.fpoly.du_an_mauph28014.LOPPRODUCT.PhieuMuon;

public class PhieuMuonViewModel extends AndroidViewModel {
    MutableLiveData<List<PhieuMuon>> liveData;
    PhieuMuonDao dao;

    public PhieuMuonViewModel(@NonNull @NotNull Application application) {
        super(application);
        liveData = new MutableLiveData<>();
        dao = new PhieuMuonDao(application);
    }

    public MutableLiveData<List<PhieuMuon>> getLiveData() {
        loadData();
        return liveData;
    }

    public void loadData() {
        List<PhieuMuon> list = new ArrayList<>();
        list = dao.GETPM();
        liveData.setValue(list);
    }
}
