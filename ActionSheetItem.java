package me.tuoxie.daai.ActionSheet;

/**
 * Created by jason on 14-3-31.
 */
public class ActionSheetItem {

    String title;
    ActionSheet.ActionSheetItemOnClickListener itemOnClickListener;

    public ActionSheetItem(String title, ActionSheet.ActionSheetItemOnClickListener itemOnClickListener) {
        this.title = title;
        this.itemOnClickListener = itemOnClickListener;
    }

    public interface ActionSheetItemOnClickListener {
        public void onClick();
    }
}
