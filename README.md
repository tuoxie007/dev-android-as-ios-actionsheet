dev-android-as-ios-actionsheet
==============================

### Example Call


	List<ActionSheetItem> items = new ArrayList<ActionSheetItem>();
	items.add(new ActionSheetItem(getString(R.string.confirm_delete),
		new ActionSheetItem.ActionSheetItemOnClickListener() {
			@Override
			public void onClick() {
				selectPhoto();
			}
		}));
	ActionSheet.showWithItems(this, items);
