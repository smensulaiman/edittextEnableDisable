    private void setTextAndDisable(EditText edittext, String text) {
        View parentView = (View) edittext.getParent();
        parentView.setBackgroundResource(0);
        edittext.setText(text);
        edittext.setBackgroundColor(Color.TRANSPARENT);
        edittext.setTag(edittext.getKeyListener());
        edittext.setKeyListener(null);
        edittext.setTextColor(Color.parseColor("#000000"));
    }

    private void setTextAndEnable(EditText edittext) {
        edittext.setEnabled(true);
        View parentView = (View) edittext.getParent();
        parentView.setBackgroundResource(R.drawable.border_dark_color);
        edittext.setKeyListener((KeyListener) edittext.getTag());
    }
