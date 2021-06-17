package com.jamesfchen.manager;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class MyAction extends AnAction {

    @Override
    public void update(AnActionEvent e) {
        // Using the event, evaluate the context, and enable or disable the action.
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        // Using the event, implement an action. For example, create and show a dialog.
    }
}
