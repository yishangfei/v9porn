package com.u9porn.ui.setting;

import com.hannesdorfmann.mosby3.mvp.MvpView;
import com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView;

/**
 * @author flymegoc
 * @date 2018/2/6
 */

public interface SettingView extends MvpView {

    void showTestingAddressDialog(boolean isTest);

    void testNewAddressSuccess(String message, QMUICommonListItemView qmuiCommonListItemView, String key);

    void testNewAddressFailure(String message, QMUICommonListItemView qmuiCommonListItemView, String key);

    void beginMoveOldDirDownloadVideoToNewDir();

    void setNewDownloadVideoDirSuccess(String message);

    void setNewDownloadVideoDirError(String message);
}
