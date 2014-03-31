dev-android-as-ios-actionsheet
==============================

### Example Call


	List<ActionSheet.ActionSheetItem> items = new ArrayList<ActionSheet.ActionSheetItem>();
            items.add(new ActionSheet.ActionSheetItem(getString(R.string.confirm_delete),
                    new ActionSheet.ActionSheetItemOnClickListener() {
                        @Override
                        public void onClick() {
                            selectPhoto();
                        }
                    }));
            ActionSheet.showWithItems(this, items);