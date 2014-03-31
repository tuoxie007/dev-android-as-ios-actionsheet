package me.tuoxie.daai.ActionSheet;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import java.util.List;

/**
 * Created by jason on 14-3-31.
 */
public class ActionSheet {

    public static class ActionSheetItem {

        private String title;
        private ActionSheetItemOnClickListener itemOnClickListener;

        public ActionSheetItem(String title, ActionSheetItemOnClickListener itemOnClickListener) {
            this.title = title;
            this.itemOnClickListener = itemOnClickListener;
        }
    }

    public static interface ActionSheetItemOnClickListener {
        public void onClick();
    }

    public static void showWithItems(Context ctx, final List<ActionSheetItem> items) {
        AlertDialog.Builder menuDialog = new AlertDialog.Builder(ctx);
        String[] titles = new String[items.size()];
        for (int i=0; i<items.size(); i++) {
            titles[i] = items.get(i).title;
        }
        menuDialog.setItems(titles, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                items.get(which).itemOnClickListener.onClick();
            }
        });
        menuDialog.show();
    }
}
