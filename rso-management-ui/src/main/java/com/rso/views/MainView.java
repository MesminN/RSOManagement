package com.rso.views;


import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinRequest;


@Route(MainView.NAME)
public class MainView extends UI {

    public static final String NAME = "/ui";

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.add(new Label("Welcome to Vaadin with spring boot for RSO app"));
    }
}
