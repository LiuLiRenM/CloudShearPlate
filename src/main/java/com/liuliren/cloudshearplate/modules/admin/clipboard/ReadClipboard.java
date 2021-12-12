package com.liuliren.cloudshearplate.modules.admin.clipboard;

import com.liuliren.cloudshearplate.modules.admin.sync.service.ISyncService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;

/**
 * 实时监听剪切板内容
 *
 * @author LiuYaoWen
 * @date 2021/11/8 下午9:17
 */
@Service
@AllArgsConstructor
public class ReadClipboard implements ClipboardOwner {

    private final ISyncService syncService;

    {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(clipboard.getContents(null), ReadClipboard.this);
    }

    /**
     * Notifies this object that it is no longer the clipboard owner.
     * This method will be called when another application or another
     * object within this application asserts ownership of the clipboard.
     *
     * @param clipboard the clipboard that is no longer owned
     * @param contents  the contents which this owner had placed on the clipboard
     */
    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {
        // 重写该方法
        // 当有内容写入剪切板时会调用该方法
        // TODO 异常记录需要作处理，保存下来，方便追溯
        try {
            // 延迟100ms执行，如果立即执行会报错，系统还没使用完剪切板，直接操作会报错
            // IllegalStateException: cannot open system clipboard
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String text = null;
        if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor)) {
            // 获取文本数据
            try {
                text = (String) clipboard.getData(DataFlavor.stringFlavor);
            } catch (UnsupportedFlavorException | IOException e) {
                e.printStackTrace();
            }
            // 保存到数据库中
            syncService.sync(text);
            clipboard.setContents(clipboard.getContents(null), this);
        }
    }
}
