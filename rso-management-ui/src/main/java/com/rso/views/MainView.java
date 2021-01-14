package com.rso.views;


import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path = MainView.NAME)
@Title("This is the title")
@Theme("valo")
public class MainView extends UI {

    public static final String NAME = "/ui";

    @Override
    protected void init(VaadinRequest request){
        final VerticalLayout verticalLayout = new VerticalLayout();

        verticalLayout.addComponent(new Label("Welcome to Vaadin with spring boot for RSO app"));

        setContent(verticalLayout);
    }
}
