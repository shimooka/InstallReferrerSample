InstallReferrerSample
=====================
インストール後、ターミナルやコマンドライン等から以下のコマンドを実行。LogCatのinfoレベルにreferrerの値が出力されることを確認。

`adb shell am broadcast -a com.android.vending.INSTALL_REFERRER --es referrer hogehoge`

 * INSTALL_REFERRERに対して、複数のBroadcaseReceiverを登録可能
 * 同一のBroadcaseReceiverを重複登録した場合、一度だけBroadcaseReceiverが起動される
